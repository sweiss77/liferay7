package gov.nasa.hq.myaudi.service.impl;

import java.util.Date;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.User;

import gov.nasa.hq.myaudi.model.Audi;
import gov.nasa.hq.myaudi.service.base.AudiLocalServiceBaseImpl;

/**
 * The implementation of the audi local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to
 * copy their definitions into the {@link gov.nasa.hq.myaudi.service.AudiLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Steve weiss
 * @see AudiLocalServiceBaseImpl
 * @see gov.nasa.hq.myaudi.service.AudiLocalServiceUtil
 */
public class AudiLocalServiceImpl extends AudiLocalServiceBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this class directly. Always use {@link gov.nasa.hq.myaudi.service.AudiLocalServiceUtil}
     * to access the audi local service.
     */

    public Audi addAudi(User user, String modelName, String exteriorColor, String interiorColor, Boolean allWheelDrive,
            Boolean coldWeatherPackage, Boolean technologyPackage) {

        long audi_id = CounterLocalServiceUtil.increment(Audi.class.getName());
        long user_id = user.getUserId();
        long group_id = user.getGroupId();
        long company_id = user.getCompanyId();
        String username = user.getScreenName();
        Date d = new Date();
        Audi audi = createAudi(audi_id);
        audi.setUserId(user_id);
        audi.setGroupId(group_id);
        audi.setCompanyId(company_id);
        audi.setCreateDate(d);
        audi.setUserName(username);
        audi.setModelName(modelName);
        audi.setExteriorColor(exteriorColor);
        audi.setInteriorColor(interiorColor);
        audi.setAllWheelDrive(allWheelDrive);
        audi.setColdWeatherPackage(coldWeatherPackage);
        audi.setTechnologyPackage(technologyPackage);
        audi = addAudi(audi);

        return audi;
    }

    /**
     * 
     */
    public Audi updateAudi(User user, long audiId, String modelName, String exteriorColor, String interiorColor,
            Boolean allWheelDrive, Boolean coldWeatherPackage, Boolean technologyPackage) throws PortalException {

        long user_id = user.getUserId();
        long group_id = user.getGroupId();
        long company_id = user.getCompanyId();
        String username = user.getScreenName();
        Date d = new Date();
        Audi audi = getAudi(audiId);
        audi.setUserId(user_id);
        audi.setGroupId(group_id);
        audi.setCompanyId(company_id);
        audi.setModifiedDate(d);
        audi.setUserName(username);
        audi.setModelName(modelName);
        audi.setExteriorColor(exteriorColor);
        audi.setInteriorColor(interiorColor);
        audi.setAllWheelDrive(allWheelDrive);
        audi.setColdWeatherPackage(coldWeatherPackage);
        audi.setTechnologyPackage(technologyPackage);
        audi = updateAudi(audi);

        return audi;
    }

}
