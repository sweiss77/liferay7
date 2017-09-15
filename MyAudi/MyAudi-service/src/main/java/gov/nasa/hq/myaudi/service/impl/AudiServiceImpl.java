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

package gov.nasa.hq.myaudi.service.impl;

import java.util.List;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import aQute.bnd.annotation.ProviderType;
import gov.nasa.hq.myaudi.model.Audi;
import gov.nasa.hq.myaudi.service.AudiLocalServiceUtil;
import gov.nasa.hq.myaudi.service.base.AudiServiceBaseImpl;

/**
 * The implementation of the audi remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link gov.nasa.hq.myaudi.service.AudiService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have
 * security checks based on the propagated JAAS credentials because this service
 * can be accessed remotely.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AudiServiceBaseImpl
 * @see gov.nasa.hq.myaudi.service.AudiServiceUtil
 */
@ProviderType
public class AudiServiceImpl extends AudiServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link
	 * gov.nasa.hq.myaudi.service.AudiServiceUtil} to access the audi remote
	 * service.
	 */

	private Log _log = LogFactoryUtil.getLog(this.getClass());

	public String listAudis() {
		_log.info("ENTER");
		String xml = null;
		StringBuffer buff = new StringBuffer();
		buff.append("<html>");
		List<Audi> audis = AudiLocalServiceUtil.getAudis(0, 1000);
		for (Audi audi : audis) {
			StringBuffer car = new StringBuffer();
			car.append("Model: ");
			car.append(audi.getModelName());
			car.append(" Exterior: ");
			car.append(audi.getExteriorColor());
			car.append(" Interior: ");
			car.append(audi.getInteriorColor());
			String newcar = car.toString();
			_log.info(newcar);
			buff.append(newcar);
			buff.append("<p/>");
			buff.append("<p/>");
		}
		buff.append("</html>");
		xml = buff.toString();
		_log.info("EXIT");
		return xml;
	}
}