package gov.nasa.hq.myaudi.web.portlet;

import java.io.IOException;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import com.liferay.frontend.js.loader.modules.extender.npm.JSPackage;
import com.liferay.frontend.js.loader.modules.extender.npm.NPMResolver;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import gov.nasa.hq.myaudi.web.constants.AudiWebKeys;
import gov.nasa.hq.myaudi.web.constants.MyAudiPortletKeys;

/**
 * @author sweiss
 */
@Component(immediate = true, property = {
        "com.liferay.portlet.display-category=category.sample",
        "com.liferay.portlet.instanceable=true",
        "javax.portlet.init-param.template-path=/",
        "javax.portlet.init-param.view-template=/view.jsp",
        "javax.portlet.name=" + MyAudiPortletKeys.MyAudi,
        "javax.portlet.resource-bundle=content.Language",
        "javax.portlet.security-role-ref=power-user,user" }, service = Portlet.class)
public class MyAudiPortlet extends MVCPortlet {

    @Override
    public void doView(RenderRequest renderRequest, RenderResponse renderResponse)
            throws IOException, PortletException {

        JSPackage jsPackage = _npmResolver.getJSPackage();

        renderRequest.setAttribute("mainRequire", _npmResolver.resolveModuleName("MyAudi-web") + " as main");
        renderRequest.setAttribute(AudiWebKeys.BOOTSTRAP_REQUIRE,
                jsPackage.getResolvedId() + " as bootstrapRequire");
        super.doView(renderRequest, renderResponse);
    }

    @Reference
    private NPMResolver _npmResolver;

}