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

package gov.nasa.hq.dogshop.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import gov.nasa.hq.dogshop.model.Leash;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the leash service. This utility wraps {@link gov.nasa.hq.dogshop.service.persistence.impl.LeashPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LeashPersistence
 * @see gov.nasa.hq.dogshop.service.persistence.impl.LeashPersistenceImpl
 * @generated
 */
@ProviderType
public class LeashUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(Leash leash) {
		getPersistence().clearCache(leash);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Leash> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Leash> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Leash> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator<Leash> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Leash update(Leash leash) {
		return getPersistence().update(leash);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Leash update(Leash leash, ServiceContext serviceContext) {
		return getPersistence().update(leash, serviceContext);
	}

	/**
	* Returns all the leashs where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching leashs
	*/
	public static List<Leash> findByUuid(java.lang.String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	* Returns a range of all the leashs where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LeashModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of leashs
	* @param end the upper bound of the range of leashs (not inclusive)
	* @return the range of matching leashs
	*/
	public static List<Leash> findByUuid(java.lang.String uuid, int start,
		int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	* Returns an ordered range of all the leashs where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LeashModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of leashs
	* @param end the upper bound of the range of leashs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching leashs
	*/
	public static List<Leash> findByUuid(java.lang.String uuid, int start,
		int end, OrderByComparator<Leash> orderByComparator) {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the leashs where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LeashModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of leashs
	* @param end the upper bound of the range of leashs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching leashs
	*/
	public static List<Leash> findByUuid(java.lang.String uuid, int start,
		int end, OrderByComparator<Leash> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid(uuid, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first leash in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching leash
	* @throws NoSuchLeashException if a matching leash could not be found
	*/
	public static Leash findByUuid_First(java.lang.String uuid,
		OrderByComparator<Leash> orderByComparator)
		throws gov.nasa.hq.dogshop.exception.NoSuchLeashException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the first leash in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching leash, or <code>null</code> if a matching leash could not be found
	*/
	public static Leash fetchByUuid_First(java.lang.String uuid,
		OrderByComparator<Leash> orderByComparator) {
		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the last leash in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching leash
	* @throws NoSuchLeashException if a matching leash could not be found
	*/
	public static Leash findByUuid_Last(java.lang.String uuid,
		OrderByComparator<Leash> orderByComparator)
		throws gov.nasa.hq.dogshop.exception.NoSuchLeashException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the last leash in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching leash, or <code>null</code> if a matching leash could not be found
	*/
	public static Leash fetchByUuid_Last(java.lang.String uuid,
		OrderByComparator<Leash> orderByComparator) {
		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the leashs before and after the current leash in the ordered set where uuid = &#63;.
	*
	* @param leashId the primary key of the current leash
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next leash
	* @throws NoSuchLeashException if a leash with the primary key could not be found
	*/
	public static Leash[] findByUuid_PrevAndNext(long leashId,
		java.lang.String uuid, OrderByComparator<Leash> orderByComparator)
		throws gov.nasa.hq.dogshop.exception.NoSuchLeashException {
		return getPersistence()
				   .findByUuid_PrevAndNext(leashId, uuid, orderByComparator);
	}

	/**
	* Removes all the leashs where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public static void removeByUuid(java.lang.String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Returns the number of leashs where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching leashs
	*/
	public static int countByUuid(java.lang.String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Returns the leash where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchLeashException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching leash
	* @throws NoSuchLeashException if a matching leash could not be found
	*/
	public static Leash findByUUID_G(java.lang.String uuid, long groupId)
		throws gov.nasa.hq.dogshop.exception.NoSuchLeashException {
		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	* Returns the leash where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching leash, or <code>null</code> if a matching leash could not be found
	*/
	public static Leash fetchByUUID_G(java.lang.String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	* Returns the leash where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching leash, or <code>null</code> if a matching leash could not be found
	*/
	public static Leash fetchByUUID_G(java.lang.String uuid, long groupId,
		boolean retrieveFromCache) {
		return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
	}

	/**
	* Removes the leash where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the leash that was removed
	*/
	public static Leash removeByUUID_G(java.lang.String uuid, long groupId)
		throws gov.nasa.hq.dogshop.exception.NoSuchLeashException {
		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	* Returns the number of leashs where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching leashs
	*/
	public static int countByUUID_G(java.lang.String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	* Returns all the leashs where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching leashs
	*/
	public static List<Leash> findByUuid_C(java.lang.String uuid, long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	* Returns a range of all the leashs where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LeashModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of leashs
	* @param end the upper bound of the range of leashs (not inclusive)
	* @return the range of matching leashs
	*/
	public static List<Leash> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end) {
		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	* Returns an ordered range of all the leashs where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LeashModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of leashs
	* @param end the upper bound of the range of leashs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching leashs
	*/
	public static List<Leash> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		OrderByComparator<Leash> orderByComparator) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the leashs where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LeashModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of leashs
	* @param end the upper bound of the range of leashs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching leashs
	*/
	public static List<Leash> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		OrderByComparator<Leash> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first leash in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching leash
	* @throws NoSuchLeashException if a matching leash could not be found
	*/
	public static Leash findByUuid_C_First(java.lang.String uuid,
		long companyId, OrderByComparator<Leash> orderByComparator)
		throws gov.nasa.hq.dogshop.exception.NoSuchLeashException {
		return getPersistence()
				   .findByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the first leash in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching leash, or <code>null</code> if a matching leash could not be found
	*/
	public static Leash fetchByUuid_C_First(java.lang.String uuid,
		long companyId, OrderByComparator<Leash> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last leash in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching leash
	* @throws NoSuchLeashException if a matching leash could not be found
	*/
	public static Leash findByUuid_C_Last(java.lang.String uuid,
		long companyId, OrderByComparator<Leash> orderByComparator)
		throws gov.nasa.hq.dogshop.exception.NoSuchLeashException {
		return getPersistence()
				   .findByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last leash in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching leash, or <code>null</code> if a matching leash could not be found
	*/
	public static Leash fetchByUuid_C_Last(java.lang.String uuid,
		long companyId, OrderByComparator<Leash> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the leashs before and after the current leash in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param leashId the primary key of the current leash
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next leash
	* @throws NoSuchLeashException if a leash with the primary key could not be found
	*/
	public static Leash[] findByUuid_C_PrevAndNext(long leashId,
		java.lang.String uuid, long companyId,
		OrderByComparator<Leash> orderByComparator)
		throws gov.nasa.hq.dogshop.exception.NoSuchLeashException {
		return getPersistence()
				   .findByUuid_C_PrevAndNext(leashId, uuid, companyId,
			orderByComparator);
	}

	/**
	* Removes all the leashs where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public static void removeByUuid_C(java.lang.String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	* Returns the number of leashs where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching leashs
	*/
	public static int countByUuid_C(java.lang.String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	* Returns all the leashs where color = &#63;.
	*
	* @param color the color
	* @return the matching leashs
	*/
	public static List<Leash> findByColor(java.lang.String color) {
		return getPersistence().findByColor(color);
	}

	/**
	* Returns a range of all the leashs where color = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LeashModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param color the color
	* @param start the lower bound of the range of leashs
	* @param end the upper bound of the range of leashs (not inclusive)
	* @return the range of matching leashs
	*/
	public static List<Leash> findByColor(java.lang.String color, int start,
		int end) {
		return getPersistence().findByColor(color, start, end);
	}

	/**
	* Returns an ordered range of all the leashs where color = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LeashModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param color the color
	* @param start the lower bound of the range of leashs
	* @param end the upper bound of the range of leashs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching leashs
	*/
	public static List<Leash> findByColor(java.lang.String color, int start,
		int end, OrderByComparator<Leash> orderByComparator) {
		return getPersistence().findByColor(color, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the leashs where color = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LeashModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param color the color
	* @param start the lower bound of the range of leashs
	* @param end the upper bound of the range of leashs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching leashs
	*/
	public static List<Leash> findByColor(java.lang.String color, int start,
		int end, OrderByComparator<Leash> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByColor(color, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first leash in the ordered set where color = &#63;.
	*
	* @param color the color
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching leash
	* @throws NoSuchLeashException if a matching leash could not be found
	*/
	public static Leash findByColor_First(java.lang.String color,
		OrderByComparator<Leash> orderByComparator)
		throws gov.nasa.hq.dogshop.exception.NoSuchLeashException {
		return getPersistence().findByColor_First(color, orderByComparator);
	}

	/**
	* Returns the first leash in the ordered set where color = &#63;.
	*
	* @param color the color
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching leash, or <code>null</code> if a matching leash could not be found
	*/
	public static Leash fetchByColor_First(java.lang.String color,
		OrderByComparator<Leash> orderByComparator) {
		return getPersistence().fetchByColor_First(color, orderByComparator);
	}

	/**
	* Returns the last leash in the ordered set where color = &#63;.
	*
	* @param color the color
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching leash
	* @throws NoSuchLeashException if a matching leash could not be found
	*/
	public static Leash findByColor_Last(java.lang.String color,
		OrderByComparator<Leash> orderByComparator)
		throws gov.nasa.hq.dogshop.exception.NoSuchLeashException {
		return getPersistence().findByColor_Last(color, orderByComparator);
	}

	/**
	* Returns the last leash in the ordered set where color = &#63;.
	*
	* @param color the color
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching leash, or <code>null</code> if a matching leash could not be found
	*/
	public static Leash fetchByColor_Last(java.lang.String color,
		OrderByComparator<Leash> orderByComparator) {
		return getPersistence().fetchByColor_Last(color, orderByComparator);
	}

	/**
	* Returns the leashs before and after the current leash in the ordered set where color = &#63;.
	*
	* @param leashId the primary key of the current leash
	* @param color the color
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next leash
	* @throws NoSuchLeashException if a leash with the primary key could not be found
	*/
	public static Leash[] findByColor_PrevAndNext(long leashId,
		java.lang.String color, OrderByComparator<Leash> orderByComparator)
		throws gov.nasa.hq.dogshop.exception.NoSuchLeashException {
		return getPersistence()
				   .findByColor_PrevAndNext(leashId, color, orderByComparator);
	}

	/**
	* Removes all the leashs where color = &#63; from the database.
	*
	* @param color the color
	*/
	public static void removeByColor(java.lang.String color) {
		getPersistence().removeByColor(color);
	}

	/**
	* Returns the number of leashs where color = &#63;.
	*
	* @param color the color
	* @return the number of matching leashs
	*/
	public static int countByColor(java.lang.String color) {
		return getPersistence().countByColor(color);
	}

	/**
	* Caches the leash in the entity cache if it is enabled.
	*
	* @param leash the leash
	*/
	public static void cacheResult(Leash leash) {
		getPersistence().cacheResult(leash);
	}

	/**
	* Caches the leashs in the entity cache if it is enabled.
	*
	* @param leashs the leashs
	*/
	public static void cacheResult(List<Leash> leashs) {
		getPersistence().cacheResult(leashs);
	}

	/**
	* Creates a new leash with the primary key. Does not add the leash to the database.
	*
	* @param leashId the primary key for the new leash
	* @return the new leash
	*/
	public static Leash create(long leashId) {
		return getPersistence().create(leashId);
	}

	/**
	* Removes the leash with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param leashId the primary key of the leash
	* @return the leash that was removed
	* @throws NoSuchLeashException if a leash with the primary key could not be found
	*/
	public static Leash remove(long leashId)
		throws gov.nasa.hq.dogshop.exception.NoSuchLeashException {
		return getPersistence().remove(leashId);
	}

	public static Leash updateImpl(Leash leash) {
		return getPersistence().updateImpl(leash);
	}

	/**
	* Returns the leash with the primary key or throws a {@link NoSuchLeashException} if it could not be found.
	*
	* @param leashId the primary key of the leash
	* @return the leash
	* @throws NoSuchLeashException if a leash with the primary key could not be found
	*/
	public static Leash findByPrimaryKey(long leashId)
		throws gov.nasa.hq.dogshop.exception.NoSuchLeashException {
		return getPersistence().findByPrimaryKey(leashId);
	}

	/**
	* Returns the leash with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param leashId the primary key of the leash
	* @return the leash, or <code>null</code> if a leash with the primary key could not be found
	*/
	public static Leash fetchByPrimaryKey(long leashId) {
		return getPersistence().fetchByPrimaryKey(leashId);
	}

	public static java.util.Map<java.io.Serializable, Leash> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the leashs.
	*
	* @return the leashs
	*/
	public static List<Leash> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the leashs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LeashModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of leashs
	* @param end the upper bound of the range of leashs (not inclusive)
	* @return the range of leashs
	*/
	public static List<Leash> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the leashs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LeashModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of leashs
	* @param end the upper bound of the range of leashs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of leashs
	*/
	public static List<Leash> findAll(int start, int end,
		OrderByComparator<Leash> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the leashs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LeashModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of leashs
	* @param end the upper bound of the range of leashs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of leashs
	*/
	public static List<Leash> findAll(int start, int end,
		OrderByComparator<Leash> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the leashs from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of leashs.
	*
	* @return the number of leashs
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static LeashPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<LeashPersistence, LeashPersistence> _serviceTracker =
		ServiceTrackerFactory.open(LeashPersistence.class);
}