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
import com.liferay.portal.kernel.security.auth.HttpPrincipal;
import com.liferay.portal.kernel.service.http.TunnelUtil;
import com.liferay.portal.kernel.util.MethodHandler;
import com.liferay.portal.kernel.util.MethodKey;

import gov.nasa.hq.dogshop.service.LeashServiceUtil;

/**
 * Provides the HTTP utility for the
 * {@link LeashServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it requires an additional
 * {@link HttpPrincipal} parameter.
 *
 * <p>
 * The benefits of using the HTTP utility is that it is fast and allows for
 * tunneling without the cost of serializing to text. The drawback is that it
 * only works with Java.
 * </p>
 *
 * <p>
 * Set the property <b>tunnel.servlet.hosts.allowed</b> in portal.properties to
 * configure security.
 * </p>
 *
 * <p>
 * The HTTP utility is only generated for remote services.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LeashServiceSoap
 * @see HttpPrincipal
 * @see LeashServiceUtil
 * @generated
 */
@ProviderType
public class LeashServiceHttp {
	public static java.util.List<gov.nasa.hq.dogshop.model.Leash> getLeashes(
		HttpPrincipal httpPrincipal) {
		try {
			MethodKey methodKey = new MethodKey(LeashServiceUtil.class,
					"getLeashes", _getLeashesParameterTypes0);

			MethodHandler methodHandler = new MethodHandler(methodKey);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (java.util.List<gov.nasa.hq.dogshop.model.Leash>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static java.util.List<gov.nasa.hq.dogshop.model.Leash> addLeash(
		HttpPrincipal httpPrincipal, java.lang.String color, int length,
		java.lang.String material) {
		try {
			MethodKey methodKey = new MethodKey(LeashServiceUtil.class,
					"addLeash", _addLeashParameterTypes1);

			MethodHandler methodHandler = new MethodHandler(methodKey, color,
					length, material);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (java.util.List<gov.nasa.hq.dogshop.model.Leash>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	private static Log _log = LogFactoryUtil.getLog(LeashServiceHttp.class);
	private static final Class<?>[] _getLeashesParameterTypes0 = new Class[] {  };
	private static final Class<?>[] _addLeashParameterTypes1 = new Class[] {
			java.lang.String.class, int.class, java.lang.String.class
		};
}