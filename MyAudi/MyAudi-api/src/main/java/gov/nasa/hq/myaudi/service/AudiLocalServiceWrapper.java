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

package gov.nasa.hq.myaudi.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AudiLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AudiLocalService
 * @generated
 */
@ProviderType
public class AudiLocalServiceWrapper implements AudiLocalService,
	ServiceWrapper<AudiLocalService> {
	public AudiLocalServiceWrapper(AudiLocalService audiLocalService) {
		_audiLocalService = audiLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _audiLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _audiLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.exportimport.kernel.lar.PortletDataContext portletDataContext) {
		return _audiLocalService.getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _audiLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _audiLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _audiLocalService.getPersistedModel(primaryKeyObj);
	}

	@Override
	public gov.nasa.hq.myaudi.model.Audi addAudi(
		com.liferay.portal.kernel.model.User user, java.lang.String modelName,
		java.lang.String exteriorColor, java.lang.String interiorColor,
		java.lang.Boolean allWheelDrive, java.lang.Boolean coldWeatherPackage,
		java.lang.Boolean technologyPackage)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _audiLocalService.addAudi(user, modelName, exteriorColor,
			interiorColor, allWheelDrive, coldWeatherPackage, technologyPackage);
	}

	/**
	* Adds the audi to the database. Also notifies the appropriate model listeners.
	*
	* @param audi the audi
	* @return the audi that was added
	*/
	@Override
	public gov.nasa.hq.myaudi.model.Audi addAudi(
		gov.nasa.hq.myaudi.model.Audi audi) {
		return _audiLocalService.addAudi(audi);
	}

	/**
	* Creates a new audi with the primary key. Does not add the audi to the database.
	*
	* @param audiId the primary key for the new audi
	* @return the new audi
	*/
	@Override
	public gov.nasa.hq.myaudi.model.Audi createAudi(long audiId) {
		return _audiLocalService.createAudi(audiId);
	}

	/**
	* Deletes the audi from the database. Also notifies the appropriate model listeners.
	*
	* @param audi the audi
	* @return the audi that was removed
	*/
	@Override
	public gov.nasa.hq.myaudi.model.Audi deleteAudi(
		gov.nasa.hq.myaudi.model.Audi audi) {
		return _audiLocalService.deleteAudi(audi);
	}

	/**
	* Deletes the audi with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param audiId the primary key of the audi
	* @return the audi that was removed
	* @throws PortalException if a audi with the primary key could not be found
	*/
	@Override
	public gov.nasa.hq.myaudi.model.Audi deleteAudi(long audiId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _audiLocalService.deleteAudi(audiId);
	}

	@Override
	public gov.nasa.hq.myaudi.model.Audi fetchAudi(long audiId) {
		return _audiLocalService.fetchAudi(audiId);
	}

	/**
	* Returns the audi matching the UUID and group.
	*
	* @param uuid the audi's UUID
	* @param groupId the primary key of the group
	* @return the matching audi, or <code>null</code> if a matching audi could not be found
	*/
	@Override
	public gov.nasa.hq.myaudi.model.Audi fetchAudiByUuidAndGroupId(
		java.lang.String uuid, long groupId) {
		return _audiLocalService.fetchAudiByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns the audi with the primary key.
	*
	* @param audiId the primary key of the audi
	* @return the audi
	* @throws PortalException if a audi with the primary key could not be found
	*/
	@Override
	public gov.nasa.hq.myaudi.model.Audi getAudi(long audiId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _audiLocalService.getAudi(audiId);
	}

	/**
	* Returns the audi matching the UUID and group.
	*
	* @param uuid the audi's UUID
	* @param groupId the primary key of the group
	* @return the matching audi
	* @throws PortalException if a matching audi could not be found
	*/
	@Override
	public gov.nasa.hq.myaudi.model.Audi getAudiByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _audiLocalService.getAudiByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public gov.nasa.hq.myaudi.model.Audi updateAudi(
		com.liferay.portal.kernel.model.User user, long audiId,
		java.lang.String modelName, java.lang.String exteriorColor,
		java.lang.String interiorColor, java.lang.Boolean allWheelDrive,
		java.lang.Boolean coldWeatherPackage,
		java.lang.Boolean technologyPackage)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _audiLocalService.updateAudi(user, audiId, modelName,
			exteriorColor, interiorColor, allWheelDrive, coldWeatherPackage,
			technologyPackage);
	}

	/**
	* Updates the audi in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param audi the audi
	* @return the audi that was updated
	*/
	@Override
	public gov.nasa.hq.myaudi.model.Audi updateAudi(
		gov.nasa.hq.myaudi.model.Audi audi) {
		return _audiLocalService.updateAudi(audi);
	}

	/**
	* Returns the number of audis.
	*
	* @return the number of audis
	*/
	@Override
	public int getAudisCount() {
		return _audiLocalService.getAudisCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _audiLocalService.getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _audiLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link gov.nasa.hq.myaudi.model.impl.AudiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _audiLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link gov.nasa.hq.myaudi.model.impl.AudiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _audiLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns a range of all the audis.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link gov.nasa.hq.myaudi.model.impl.AudiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of audis
	* @param end the upper bound of the range of audis (not inclusive)
	* @return the range of audis
	*/
	@Override
	public java.util.List<gov.nasa.hq.myaudi.model.Audi> getAudis(int start,
		int end) {
		return _audiLocalService.getAudis(start, end);
	}

	/**
	* Returns all the audis matching the UUID and company.
	*
	* @param uuid the UUID of the audis
	* @param companyId the primary key of the company
	* @return the matching audis, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<gov.nasa.hq.myaudi.model.Audi> getAudisByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return _audiLocalService.getAudisByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns a range of audis matching the UUID and company.
	*
	* @param uuid the UUID of the audis
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of audis
	* @param end the upper bound of the range of audis (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching audis, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<gov.nasa.hq.myaudi.model.Audi> getAudisByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<gov.nasa.hq.myaudi.model.Audi> orderByComparator) {
		return _audiLocalService.getAudisByUuidAndCompanyId(uuid, companyId,
			start, end, orderByComparator);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _audiLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return _audiLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public AudiLocalService getWrappedService() {
		return _audiLocalService;
	}

	@Override
	public void setWrappedService(AudiLocalService audiLocalService) {
		_audiLocalService = audiLocalService;
	}

	private AudiLocalService _audiLocalService;
}