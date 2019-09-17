/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under the terms of the GNU Lesser
 * General Public License as published by the Free Software Foundation; either version 2.1 of the License, or
 * (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the
 * implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public
 * License for more details.
 */

package gov.nasa.hq.myaudi.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

import aQute.bnd.annotation.ProviderType;

/**
 * Provides a wrapper for {@link AudiService}.
 *
 * @author Brian Wing Shun Chan
 * @see AudiService
 * @generated
 */
@ProviderType
public class AudiServiceWrapper implements AudiService, ServiceWrapper<AudiService> {
    public AudiServiceWrapper(AudiService audiService) {
        _audiService = audiService;
    }

    /**
     * Returns the OSGi service identifier.
     *
     * @return the OSGi service identifier
     */
    @Override
    public String getOSGiServiceIdentifier() {
        return _audiService.getOSGiServiceIdentifier();
    }

    @Override
    public AudiService getWrappedService() {
        return _audiService;
    }

    @Override
    public void setWrappedService(AudiService audiService) {
        _audiService = audiService;
    }

    private AudiService _audiService;
}
