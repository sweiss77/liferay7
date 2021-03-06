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
 * Provides a wrapper for {@link LeashLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see LeashLocalService
 * @generated
 */
@ProviderType
public class LeashLocalServiceWrapper implements LeashLocalService,
	ServiceWrapper<LeashLocalService> {
	public LeashLocalServiceWrapper(LeashLocalService leashLocalService) {
		_leashLocalService = leashLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _leashLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _leashLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.exportimport.kernel.lar.PortletDataContext portletDataContext) {
		return _leashLocalService.getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _leashLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _leashLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _leashLocalService.getPersistedModel(primaryKeyObj);
	}

	@Override
	public gov.nasa.hq.dogshop.model.Leash addLeash(
		com.liferay.portal.kernel.model.User user, java.lang.String color,
		int length, java.lang.String material) {
		return _leashLocalService.addLeash(user, color, length, material);
	}

	/**
	* Adds the leash to the database. Also notifies the appropriate model listeners.
	*
	* @param leash the leash
	* @return the leash that was added
	*/
	@Override
	public gov.nasa.hq.dogshop.model.Leash addLeash(
		gov.nasa.hq.dogshop.model.Leash leash) {
		return _leashLocalService.addLeash(leash);
	}

	/**
	* Creates a new leash with the primary key. Does not add the leash to the database.
	*
	* @param leashId the primary key for the new leash
	* @return the new leash
	*/
	@Override
	public gov.nasa.hq.dogshop.model.Leash createLeash(long leashId) {
		return _leashLocalService.createLeash(leashId);
	}

	/**
	* Deletes the leash from the database. Also notifies the appropriate model listeners.
	*
	* @param leash the leash
	* @return the leash that was removed
	*/
	@Override
	public gov.nasa.hq.dogshop.model.Leash deleteLeash(
		gov.nasa.hq.dogshop.model.Leash leash) {
		return _leashLocalService.deleteLeash(leash);
	}

	/**
	* Deletes the leash with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param leashId the primary key of the leash
	* @return the leash that was removed
	* @throws PortalException if a leash with the primary key could not be found
	*/
	@Override
	public gov.nasa.hq.dogshop.model.Leash deleteLeash(long leashId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _leashLocalService.deleteLeash(leashId);
	}

	@Override
	public gov.nasa.hq.dogshop.model.Leash fetchLeash(long leashId) {
		return _leashLocalService.fetchLeash(leashId);
	}

	/**
	* Returns the leash matching the UUID and group.
	*
	* @param uuid the leash's UUID
	* @param groupId the primary key of the group
	* @return the matching leash, or <code>null</code> if a matching leash could not be found
	*/
	@Override
	public gov.nasa.hq.dogshop.model.Leash fetchLeashByUuidAndGroupId(
		java.lang.String uuid, long groupId) {
		return _leashLocalService.fetchLeashByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns the leash with the primary key.
	*
	* @param leashId the primary key of the leash
	* @return the leash
	* @throws PortalException if a leash with the primary key could not be found
	*/
	@Override
	public gov.nasa.hq.dogshop.model.Leash getLeash(long leashId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _leashLocalService.getLeash(leashId);
	}

	/**
	* Returns the leash matching the UUID and group.
	*
	* @param uuid the leash's UUID
	* @param groupId the primary key of the group
	* @return the matching leash
	* @throws PortalException if a matching leash could not be found
	*/
	@Override
	public gov.nasa.hq.dogshop.model.Leash getLeashByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _leashLocalService.getLeashByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Updates the leash in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param leash the leash
	* @return the leash that was updated
	*/
	@Override
	public gov.nasa.hq.dogshop.model.Leash updateLeash(
		gov.nasa.hq.dogshop.model.Leash leash) {
		return _leashLocalService.updateLeash(leash);
	}

	/**
	* Returns the number of leashs.
	*
	* @return the number of leashs
	*/
	@Override
	public int getLeashsCount() {
		return _leashLocalService.getLeashsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _leashLocalService.getOSGiServiceIdentifier();
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
		return _leashLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link gov.nasa.hq.dogshop.model.impl.LeashModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _leashLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link gov.nasa.hq.dogshop.model.impl.LeashModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _leashLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	@Override
	public java.util.List<gov.nasa.hq.dogshop.model.Leash> getLeashes() {
		return _leashLocalService.getLeashes();
	}

	/**
	* Returns a range of all the leashs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link gov.nasa.hq.dogshop.model.impl.LeashModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of leashs
	* @param end the upper bound of the range of leashs (not inclusive)
	* @return the range of leashs
	*/
	@Override
	public java.util.List<gov.nasa.hq.dogshop.model.Leash> getLeashs(
		int start, int end) {
		return _leashLocalService.getLeashs(start, end);
	}

	/**
	* Returns all the leashs matching the UUID and company.
	*
	* @param uuid the UUID of the leashs
	* @param companyId the primary key of the company
	* @return the matching leashs, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<gov.nasa.hq.dogshop.model.Leash> getLeashsByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return _leashLocalService.getLeashsByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns a range of leashs matching the UUID and company.
	*
	* @param uuid the UUID of the leashs
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of leashs
	* @param end the upper bound of the range of leashs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching leashs, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<gov.nasa.hq.dogshop.model.Leash> getLeashsByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<gov.nasa.hq.dogshop.model.Leash> orderByComparator) {
		return _leashLocalService.getLeashsByUuidAndCompanyId(uuid, companyId,
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
		return _leashLocalService.dynamicQueryCount(dynamicQuery);
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
		return _leashLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public LeashLocalService getWrappedService() {
		return _leashLocalService;
	}

	@Override
	public void setWrappedService(LeashLocalService leashLocalService) {
		_leashLocalService = leashLocalService;
	}

	private LeashLocalService _leashLocalService;
}