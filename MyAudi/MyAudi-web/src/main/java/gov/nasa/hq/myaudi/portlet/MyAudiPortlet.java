package gov.nasa.hq.myaudi.portlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.GenericPortlet;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.PortletRequestDispatcher;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.audit.AuditException;
import com.liferay.portal.kernel.audit.AuditMessage;
import com.liferay.portal.kernel.audit.AuditRouterUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.WebKeys;

import gov.nasa.hq.myaudi.audit.AttributesBuilder;
import gov.nasa.hq.myaudi.audit.AuditMessageBuilder;
import gov.nasa.hq.myaudi.model.Audi;
import gov.nasa.hq.myaudi.service.AudiLocalServiceUtil;

/**
 * @author sweiss
 */
@Component(immediate = true, property = { "com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.instanceable=true", "javax.portlet.display-name=MyAudi-web Portlet",
		"javax.portlet.security-role-ref=power-user,user" }, service = Portlet.class)
public class MyAudiPortlet extends GenericPortlet {

	protected String viewTemplate;
	protected String buildTemplate;
	protected String editTemplate;
	protected String searchTemplate;
	protected String listTemplate;

	private Log _log = null;

	protected static String[] methods = { "build", "list" };

	public void init() {
		_log = LogFactoryUtil.getLog(this.getClass());
		viewTemplate = "/META-INF/resources/view.jsp";//getInitParameter("view-template");
		buildTemplate = "/META-INF/resources/build.jsp";//getInitParameter("build-template");
		editTemplate = "/META-INF/resources/edit.jsp";//getInitParameter("edit-template");
		searchTemplate = "/META-INF/resources/search.jsp";//getInitParameter("search-template");
		listTemplate = "/META-INF/resources/list.jsp";//getInitParameter("list-template");
	}

	/**
	 * 
	 */
	public void doView(RenderRequest request, RenderResponse response) throws IOException, PortletException {

		String ID = this.getClass().getName() + ".doView: ";
		_log.info(ID + "ENTER");
		String screen_name = null;

		ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
		User realUser = themeDisplay.getRealUser();

		Enumeration<String> e = request.getParameterNames();
		while (e.hasMoreElements()) {
			String name = (String) e.nextElement();
			String valu = request.getParameter(name);
			_log.info("REQUEST PARAM: " + name + " = " + valu);
		}

		String audiAction = request.getParameter("audiAction");
		_log.info(ID + "audiAction: " + audiAction);

		if (audiAction == null || audiAction.equals("showMethods")) {

			// Show available methods
			_log.info(ID + "SHOW METHODS");
			request.setAttribute("methods", methods);
			request.setAttribute("audiAction", "showMethods");
			include(viewTemplate, request, response);

		} else if (audiAction.equals("showResult")) {

			_log.info(ID + "SHOW RESULT");
			include("/jsp/results.jsp", request, response);

		} else if (audiAction.equals("getAudi")) {
			String audi_id = request.getParameter("audiId");
			try {
				Audi audi = AudiLocalServiceUtil.getAudi(new Long(audi_id));
				request.setAttribute("audi", audi);
				String jsp = "/META-INF/resources/edit.jsp";
				include(jsp, request, response);
			} catch (NumberFormatException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (PortalException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (SystemException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} else if (audiAction.equals("buyAudi")) {
			String audi_id = request.getParameter("audiId");
			try {
				Audi audi = AudiLocalServiceUtil.getAudi(new Long(audi_id));
				audit(realUser, audi, null, "audi.deleted");
				audi = AudiLocalServiceUtil.deleteAudi(new Long(audi_id));
				request.setAttribute("audi", audi);
				String jsp = "/META-INF/resources/buy.jsp";
				include(jsp, request, response);
			} catch (NumberFormatException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (PortalException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (SystemException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} else if (audiAction.equals("showForm")) {

			// Displays search form for specific search type
			_log.info(ID + "SHOW FORM");
			request.setAttribute("screenName", screen_name);
			String method = request.getParameter("method");
			if (method.equals("list")) {
				try {
					List<Audi> audis = AudiLocalServiceUtil.getAudis(0, 1000);
					request.setAttribute("carSearchResults", audis);
				} catch (SystemException ex) {
					// TODO Auto-generated catch block
					ex.printStackTrace();
				}
			}
			_log.info(ID + "method: " + method);
			String jsp = "/META-INF/resources/" + method + ".jsp";
			include(jsp, request, response);

		}

		_log.info(ID + "EXIT");

	}

	/**
	 * 
	 */
	public void processAction(ActionRequest request, ActionResponse response) throws IOException, PortletException {

		_log.info("processAction, ENTER");
		String action = request.getParameter("action");
		_log.info("action: " + action);
		User user = null;

		try {
			long uid = PortalUtil.getUserId(request);
			if (uid > 0) {
				user = UserLocalServiceUtil.getUser(uid);
			}
		} catch (PortalException e) {
			e.printStackTrace();
		} catch (SystemException e) {
			e.printStackTrace();
		}

		Enumeration e = request.getParameterNames();
		while (e.hasMoreElements()) {
			String name = (String) e.nextElement();
			String valu = request.getParameter(name);
			_log.info("REQUEST PARAM: " + name + " = " + valu);
		}

		if (action.equalsIgnoreCase("saveCar")) {
			_log.info("ADD CAR");
			doSaveCar(user, request, response, false);
		} else if (action.equalsIgnoreCase("updateCar")) {
			_log.info("UPDATE CAR");
			doSaveCar(user, request, response, true);
		}
		_log.info("processAction, EXIT");
	}

	/**
	 * 
	 * @param user
	 * @param request
	 * @param response
	 * @param update
	 */
	protected void doSaveCar(User user, ActionRequest request, ActionResponse response, boolean update) {

		_log.info("doSaveCar, ENTER");

		try {

			ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
			User realUser = themeDisplay.getRealUser();

			String modelname = request.getParameter("model");
			String exterior = request.getParameter("exterior");
			String interior = request.getParameter("interior");
			Boolean awd = new Boolean(request.getParameter("allWheelDrive"));
			Boolean weather = new Boolean(request.getParameter("coldWeather"));
			Boolean tech = new Boolean(request.getParameter("techPackage"));

			Audi new_audi = null;
			_log.info("update = " + update);

			if (update) {
				Long audi_id = new Long(request.getParameter("audiId"));
				Audi old_audi = AudiLocalServiceUtil.getAudi(audi_id);
				new_audi = AudiLocalServiceUtil.updateAudi(user, audi_id, modelname, exterior, interior, awd, weather,
						tech);
				_log.info("Audit update stuff");
				audit(realUser, old_audi, new_audi, "audi.updated");
			} else {
				Audi audi = AudiLocalServiceUtil.addAudi(user, modelname, exterior, interior, awd, weather, tech);
				// create the audit message
				audit(realUser, null, audi, "audi.added");
			}

		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		_log.info("doSaveCar, EXIT");
	}

	/**
	 * 
	 * @param path
	 * @param renderRequest
	 * @param renderResponse
	 * @throws IOException
	 * @throws PortletException
	 */
	protected void include(String path, RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {

		PortletRequestDispatcher portletRequestDispatcher = getPortletContext().getRequestDispatcher(path);

		if (portletRequestDispatcher == null) {
			_log.error(path + " is not a valid include");
		} else {
			portletRequestDispatcher.include(renderRequest, renderResponse);
		}
	}

	/**
	 * 
	 * @param oldBean
	 * @param newBean
	 * @param action
	 */
	protected void audit(User realUser, Audi oldBean, Audi newBean, String action) {

		// collect the attributes we want to audit
		AttributesBuilder attributesBuilder = new AttributesBuilder(newBean, oldBean);
		attributesBuilder.add("audiId");
		attributesBuilder.add("modelName");
		attributesBuilder.add("exteriorColor");
		attributesBuilder.add("interiorColor");
		attributesBuilder.add("allWheelDrive");
		attributesBuilder.add("technologyPackage");
		attributesBuilder.add("coldWeatherPackage");

		long id = newBean != null ? newBean.getAudiId() : oldBean.getAudiId();

		// create the audit message
		AuditMessage auditMessage = AuditMessageBuilder.buildAuditMessage(action, Audi.class.getName(), id,
				attributesBuilder.getAttributes(), realUser);
		// add the audit message
		try {
			AuditRouterUtil.route(auditMessage);
		} catch (AuditException e) {
			e.printStackTrace();
		}
	}

}
