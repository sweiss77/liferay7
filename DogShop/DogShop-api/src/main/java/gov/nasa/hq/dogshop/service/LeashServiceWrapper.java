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

package gov.nasa.hq.dogshop.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link LeashService}.
 *
 * @author Brian Wing Shun Chan
 * @see LeashService
 * @generated
 */
@ProviderType
public class LeashServiceWrapper implements LeashService,
	ServiceWrapper<LeashService> {
	public LeashServiceWrapper(LeashService leashService) {
		_leashService = leashService;
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _leashService.getOSGiServiceIdentifier();
	}

	@Override
	public java.util.List<gov.nasa.hq.dogshop.model.Leash> addLeash(
		java.lang.String color, int length, java.lang.String material) {
		return _leashService.addLeash(color, length, material);
	}

	@Override
	public java.util.List<gov.nasa.hq.dogshop.model.Leash> getLeashes() {
		return _leashService.getLeashes();
	}

	@Override
	public LeashService getWrappedService() {
		return _leashService;
	}

	@Override
	public void setWrappedService(LeashService leashService) {
		_leashService = leashService;
	}

	private LeashService _leashService;
}