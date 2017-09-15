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

package gov.nasa.hq.dogshop.service.http;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import gov.nasa.hq.dogshop.service.LeashServiceUtil;

import java.rmi.RemoteException;

/**
 * Provides the SOAP utility for the
 * {@link LeashServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link gov.nasa.hq.dogshop.model.LeashSoap}.
 * If the method in the service utility returns a
 * {@link gov.nasa.hq.dogshop.model.Leash}, that is translated to a
 * {@link gov.nasa.hq.dogshop.model.LeashSoap}. Methods that SOAP cannot
 * safely wire are skipped.
 * </p>
 *
 * <p>
 * The benefits of using the SOAP utility is that it is cross platform
 * compatible. SOAP allows different languages like Java, .NET, C++, PHP, and
 * even Perl, to call the generated services. One drawback of SOAP is that it is
 * slow because it needs to serialize all calls into a text format (XML).
 * </p>
 *
 * <p>
 * You can see a list of services at http://localhost:8080/api/axis. Set the
 * property <b>axis.servlet.hosts.allowed</b> in portal.properties to configure
 * security.
 * </p>
 *
 * <p>
 * The SOAP utility is only generated for remote services.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LeashServiceHttp
 * @see gov.nasa.hq.dogshop.model.LeashSoap
 * @see LeashServiceUtil
 * @generated
 */
@ProviderType
public class LeashServiceSoap {
	public static gov.nasa.hq.dogshop.model.LeashSoap[] getLeashes()
		throws RemoteException {
		try {
			java.util.List<gov.nasa.hq.dogshop.model.Leash> returnValue = LeashServiceUtil.getLeashes();

			return gov.nasa.hq.dogshop.model.LeashSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static gov.nasa.hq.dogshop.model.LeashSoap[] addLeash(
		java.lang.String color, int length, java.lang.String material)
		throws RemoteException {
		try {
			java.util.List<gov.nasa.hq.dogshop.model.Leash> returnValue = LeashServiceUtil.addLeash(color,
					length, material);

			return gov.nasa.hq.dogshop.model.LeashSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(LeashServiceSoap.class);
}