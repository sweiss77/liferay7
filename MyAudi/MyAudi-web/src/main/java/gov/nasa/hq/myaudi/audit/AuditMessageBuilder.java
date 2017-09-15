// $Id: $

package gov.nasa.hq.myaudi.audit;
/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
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

import com.liferay.portal.kernel.audit.AuditMessage;
import com.liferay.portal.kernel.audit.AuditRequestThreadLocal;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.security.auth.CompanyThreadLocal;
import com.liferay.portal.kernel.security.auth.PrincipalThreadLocal;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.StringPool;
//import com.liferay.portal.kernel.model.User;
//import com.liferay.portal.security.auth.CompanyThreadLocal;
//import com.liferay.portal.security.auth.PrincipalThreadLocal;
//import com.liferay.portal.kernel.util.PortalUtil;

import java.util.List;

/**
 * @author Mika Koivisto
 * @author Brian Wing Shun Chan
 */
public class AuditMessageBuilder {

	private static Log _log = LogFactoryUtil.getLog(AuditMessageBuilder.class);

	/**
	 * 
	 * @param eventType
	 * @param className
	 * @param classPK
	 * @param attributes
	 * @return
	 */
	public static AuditMessage buildAuditMessage(String eventType, String className, long classPK,
			List<Attribute> attributes, User realUser) {

		long companyId = CompanyThreadLocal.getCompanyId();

		long userId = 0;

		if (PrincipalThreadLocal.getName() != null) {
			userId = GetterUtil.getLong(PrincipalThreadLocal.getName());
		}
		_log.info("userId: " + userId);

		AuditRequestThreadLocal auditRequestThreadLocal = AuditRequestThreadLocal.getAuditThreadLocal();

		long realUserId = realUser.getUserId();// auditRequestThreadLocal.getRealUserId();
		_log.info("realUserId: " + realUserId);
		if (realUserId == 0) {
			// Don't know why this is 0 on delete
			realUserId = userId;
		}
		_log.info("realUserId: " + realUserId);
		String realUserName = PortalUtil.getUserName(realUserId, StringPool.BLANK);
		_log.info("realUserName: " + realUserName);

		JSONObject additionalInfo = JSONFactoryUtil.createJSONObject();

		if ((realUserId > 0) && (userId != realUserId)) {
			additionalInfo.put("doAsUserId", String.valueOf(userId));
			additionalInfo.put("doAsUserName", PortalUtil.getUserName(userId, StringPool.BLANK));
		}

		if (attributes != null) {
			additionalInfo.put("attributes", _getAttributesJSON(attributes));
		}

		return new AuditMessage(eventType, companyId, realUserId, realUserName, className, String.valueOf(classPK),
				null, additionalInfo);
	}

	/**
	 * 
	 * @param attributes
	 * @return
	 */
	private static JSONArray _getAttributesJSON(List<Attribute> attributes) {

		JSONArray jsonArray = JSONFactoryUtil.createJSONArray();

		for (Attribute attribute : attributes) {
			JSONObject attributeJSONObject = JSONFactoryUtil.createJSONObject();

			attributeJSONObject.put("name", attribute.getName());
			if (attribute.getNewValue() != null) {
				attributeJSONObject.put("newValue", attribute.getNewValue());
			}
			if (attribute.getOldValue() != null) {
				attributeJSONObject.put("oldValue", attribute.getOldValue());
			}

			jsonArray.put(attributeJSONObject);
		}

		return jsonArray;
	}

}
