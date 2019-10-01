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

package gov.nasa.hq.myaudi.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the Audi service. Represents a row in the &quot;NASA_Audi&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see AudiModel
 * @see gov.nasa.hq.myaudi.model.impl.AudiImpl
 * @see gov.nasa.hq.myaudi.model.impl.AudiModelImpl
 * @generated
 */
@ImplementationClassName("gov.nasa.hq.myaudi.model.impl.AudiImpl")
@ProviderType
public interface Audi extends AudiModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link gov.nasa.hq.myaudi.model.impl.AudiImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<Audi, Long> AUDI_ID_ACCESSOR = new Accessor<Audi, Long>() {
			@Override
			public Long get(Audi audi) {
				return audi.getAudiId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<Audi> getTypeClass() {
				return Audi.class;
			}
		};
}