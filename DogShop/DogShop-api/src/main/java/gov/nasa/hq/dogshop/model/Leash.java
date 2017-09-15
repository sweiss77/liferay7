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

package gov.nasa.hq.dogshop.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the Leash service. Represents a row in the &quot;nasa_Leash&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see LeashModel
 * @see gov.nasa.hq.dogshop.model.impl.LeashImpl
 * @see gov.nasa.hq.dogshop.model.impl.LeashModelImpl
 * @generated
 */
@ImplementationClassName("gov.nasa.hq.dogshop.model.impl.LeashImpl")
@ProviderType
public interface Leash extends LeashModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link gov.nasa.hq.dogshop.model.impl.LeashImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<Leash, Long> LEASH_ID_ACCESSOR = new Accessor<Leash, Long>() {
			@Override
			public Long get(Leash leash) {
				return leash.getLeashId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<Leash> getTypeClass() {
				return Leash.class;
			}
		};
}