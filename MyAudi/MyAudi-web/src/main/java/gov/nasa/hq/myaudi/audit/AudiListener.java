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

package gov.nasa.hq.myaudi.audit;

import java.util.List;

import com.liferay.portal.kernel.audit.AuditMessage;
import com.liferay.portal.kernel.audit.AuditRouterUtil;
import com.liferay.portal.kernel.exception.ModelListenerException;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.model.BaseModelListener;
import com.liferay.portal.kernel.model.User;

import gov.nasa.hq.myaudi.model.Audi;
import gov.nasa.hq.myaudi.service.AudiLocalServiceUtil;

/**
 * @author Sergio Gonz�lez
 */
public class AudiListener extends BaseModelListener<Audi> {

	public void onBeforeCreate(Audi audi, User realUser) throws ModelListenerException {
		auditOnCreateOrRemove(EventTypes.ADD, audi, realUser);
	}

	public void onBeforeRemove(Audi audi, User realUser) throws ModelListenerException {
		auditOnCreateOrRemove(EventTypes.DELETE, audi, realUser);
	}

	public void onBeforeUpdate(Audi newAudi, User realUser) throws ModelListenerException {

		try {

			Audi oldAudi = AudiLocalServiceUtil.getAudi(newAudi.getAudiId());
			List<Attribute> attributes = getModifiedAttributes(newAudi, oldAudi);

			if (!attributes.isEmpty()) {
				AuditMessage auditMessage = AuditMessageBuilder.buildAuditMessage(EventTypes.UPDATE,
						Audi.class.getName(), newAudi.getAudiId(), attributes, realUser);

				AuditRouterUtil.route(auditMessage);
			}
		} catch (Exception e) {
			throw new ModelListenerException(e);
		}
	}

	protected void auditOnCreateOrRemove(String eventType, Audi audi, User realUser) throws ModelListenerException {

		try {

			AuditMessage auditMessage = AuditMessageBuilder.buildAuditMessage(eventType, Audi.class.getName(),
					audi.getAudiId(), null, realUser);

			JSONObject additionalInfo = auditMessage.getAdditionalInfo();

			additionalInfo.put("modelName", audi.getModelName());
			additionalInfo.put("exteriorColor", audi.getExteriorColor());
			additionalInfo.put("interiorColor", audi.getInteriorColor());

			AuditRouterUtil.route(auditMessage);

		} catch (Exception e) {
			throw new ModelListenerException(e);
		}
	}

	protected List<Attribute> getModifiedAttributes(Audi newAudi, Audi oldAudi) {

		AttributesBuilder attributesBuilder = new AttributesBuilder(newAudi, oldAudi);

		attributesBuilder.add("modelName");
		attributesBuilder.add("exteriorColor");
		attributesBuilder.add("interiorColor");

		List<Attribute> attributes = attributesBuilder.getAttributes();

		return attributes;
	}

}
