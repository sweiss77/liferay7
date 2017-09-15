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

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.model.User;

import aQute.bnd.annotation.ProviderType;
import gov.nasa.hq.dogshop.model.Leash;
import gov.nasa.hq.dogshop.service.base.LeashLocalServiceBaseImpl;

/**
 * The implementation of the leash local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link gov.nasa.hq.dogshop.service.LeashLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LeashLocalServiceBaseImpl
 * @see gov.nasa.hq.dogshop.service.LeashLocalServiceUtil
 */
@ProviderType
public class LeashLocalServiceImpl extends LeashLocalServiceBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this class directly. Always use {@link
     * gov.nasa.hq.dogshop.service.LeashLocalServiceUtil} to access the leash
     * local service.
     */

    public List<Leash> getLeashes() {
        int count = getLeashsCount();
        List<Leash> list = getLeashs(0, count);
        return list;
    }

    public Leash addLeash(User user, String color, int length, String material) {
        
        long audi_id = CounterLocalServiceUtil.increment(Leash.class.getName());
        long user_id = user.getUserId();
        long group_id = user.getGroupId();
        long company_id = user.getCompanyId();
        String username = user.getScreenName();
        Date d = new Date();
        Leash leash = createLeash(audi_id);
        leash.setUserName(username);
        leash.setGroupId(group_id);
        leash.setCompanyId(company_id);
        leash.setUserId(user_id);
        leash.setColor(color);
        leash.setLength(length);
        leash.setMaterial(material);
        leash.setCreateDate(d);
        leash = addLeash(leash);
        return leash;

    }
}
