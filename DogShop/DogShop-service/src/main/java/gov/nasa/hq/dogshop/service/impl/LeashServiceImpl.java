/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package gov.nasa.hq.dogshop.service.impl;

import java.util.List;

import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;

import aQute.bnd.annotation.ProviderType;
import gov.nasa.hq.dogshop.model.Leash;
import gov.nasa.hq.dogshop.service.LeashLocalServiceUtil;
import gov.nasa.hq.dogshop.service.base.LeashServiceBaseImpl;

/**
 * The implementation of the leash remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link gov.nasa.hq.dogshop.service.LeashService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have
 * security checks based on the propagated JAAS credentials because this service
 * can be accessed remotely.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LeashServiceBaseImpl
 * @see gov.nasa.hq.dogshop.service.LeashServiceUtil
 */
@ProviderType
public class LeashServiceImpl extends LeashServiceBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this class directly. Always use {@link
     * gov.nasa.hq.dogshop.service.LeashServiceUtil} to access the leash remote
     * service.
     */

    public List<Leash> getLeashes() {
        List<Leash> list = LeashLocalServiceUtil.getLeashes();
        return list;
    }

    public List<Leash> addLeash(String color, int length, String material) {
        //long company_id = Long.parseLong(companyId)
        String screenName = "sweiss";
        long companyId = 20116;
        User u = UserLocalServiceUtil.fetchUserByScreenName(companyId, screenName);
        Leash l = LeashLocalServiceUtil.addLeash(u, color, length, material);
        List<Leash> list = LeashLocalServiceUtil.getLeashes();
        return list;
    }
}
