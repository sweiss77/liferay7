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

package gov.nasa.hq.myaudi.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import gov.nasa.hq.myaudi.model.Audi;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the audi service. This utility wraps {@link gov.nasa.hq.myaudi.service.persistence.impl.AudiPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AudiPersistence
 * @see gov.nasa.hq.myaudi.service.persistence.impl.AudiPersistenceImpl
 * @generated
 */
@ProviderType
public class AudiUtil {
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
	public static void clearCache(Audi audi) {
		getPersistence().clearCache(audi);
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
	public static List<Audi> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Audi> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Audi> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator<Audi> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Audi update(Audi audi) {
		return getPersistence().update(audi);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Audi update(Audi audi, ServiceContext serviceContext) {
		return getPersistence().update(audi, serviceContext);
	}

	/**
	* Returns all the audis where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching audis
	*/
	public static List<Audi> findByUuid(java.lang.String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	* Returns a range of all the audis where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AudiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of audis
	* @param end the upper bound of the range of audis (not inclusive)
	* @return the range of matching audis
	*/
	public static List<Audi> findByUuid(java.lang.String uuid, int start,
		int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	* Returns an ordered range of all the audis where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AudiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of audis
	* @param end the upper bound of the range of audis (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching audis
	*/
	public static List<Audi> findByUuid(java.lang.String uuid, int start,
		int end, OrderByComparator<Audi> orderByComparator) {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the audis where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AudiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of audis
	* @param end the upper bound of the range of audis (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching audis
	*/
	public static List<Audi> findByUuid(java.lang.String uuid, int start,
		int end, OrderByComparator<Audi> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid(uuid, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first audi in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching audi
	* @throws NoSuchAudiException if a matching audi could not be found
	*/
	public static Audi findByUuid_First(java.lang.String uuid,
		OrderByComparator<Audi> orderByComparator)
		throws gov.nasa.hq.myaudi.exception.NoSuchAudiException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the first audi in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching audi, or <code>null</code> if a matching audi could not be found
	*/
	public static Audi fetchByUuid_First(java.lang.String uuid,
		OrderByComparator<Audi> orderByComparator) {
		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the last audi in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching audi
	* @throws NoSuchAudiException if a matching audi could not be found
	*/
	public static Audi findByUuid_Last(java.lang.String uuid,
		OrderByComparator<Audi> orderByComparator)
		throws gov.nasa.hq.myaudi.exception.NoSuchAudiException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the last audi in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching audi, or <code>null</code> if a matching audi could not be found
	*/
	public static Audi fetchByUuid_Last(java.lang.String uuid,
		OrderByComparator<Audi> orderByComparator) {
		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the audis before and after the current audi in the ordered set where uuid = &#63;.
	*
	* @param audiId the primary key of the current audi
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next audi
	* @throws NoSuchAudiException if a audi with the primary key could not be found
	*/
	public static Audi[] findByUuid_PrevAndNext(long audiId,
		java.lang.String uuid, OrderByComparator<Audi> orderByComparator)
		throws gov.nasa.hq.myaudi.exception.NoSuchAudiException {
		return getPersistence()
				   .findByUuid_PrevAndNext(audiId, uuid, orderByComparator);
	}

	/**
	* Removes all the audis where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public static void removeByUuid(java.lang.String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Returns the number of audis where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching audis
	*/
	public static int countByUuid(java.lang.String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Returns the audi where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchAudiException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching audi
	* @throws NoSuchAudiException if a matching audi could not be found
	*/
	public static Audi findByUUID_G(java.lang.String uuid, long groupId)
		throws gov.nasa.hq.myaudi.exception.NoSuchAudiException {
		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	* Returns the audi where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching audi, or <code>null</code> if a matching audi could not be found
	*/
	public static Audi fetchByUUID_G(java.lang.String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	* Returns the audi where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching audi, or <code>null</code> if a matching audi could not be found
	*/
	public static Audi fetchByUUID_G(java.lang.String uuid, long groupId,
		boolean retrieveFromCache) {
		return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
	}

	/**
	* Removes the audi where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the audi that was removed
	*/
	public static Audi removeByUUID_G(java.lang.String uuid, long groupId)
		throws gov.nasa.hq.myaudi.exception.NoSuchAudiException {
		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	* Returns the number of audis where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching audis
	*/
	public static int countByUUID_G(java.lang.String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	* Returns all the audis where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching audis
	*/
	public static List<Audi> findByUuid_C(java.lang.String uuid, long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	* Returns a range of all the audis where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AudiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of audis
	* @param end the upper bound of the range of audis (not inclusive)
	* @return the range of matching audis
	*/
	public static List<Audi> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end) {
		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	* Returns an ordered range of all the audis where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AudiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of audis
	* @param end the upper bound of the range of audis (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching audis
	*/
	public static List<Audi> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		OrderByComparator<Audi> orderByComparator) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the audis where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AudiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of audis
	* @param end the upper bound of the range of audis (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching audis
	*/
	public static List<Audi> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		OrderByComparator<Audi> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first audi in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching audi
	* @throws NoSuchAudiException if a matching audi could not be found
	*/
	public static Audi findByUuid_C_First(java.lang.String uuid,
		long companyId, OrderByComparator<Audi> orderByComparator)
		throws gov.nasa.hq.myaudi.exception.NoSuchAudiException {
		return getPersistence()
				   .findByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the first audi in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching audi, or <code>null</code> if a matching audi could not be found
	*/
	public static Audi fetchByUuid_C_First(java.lang.String uuid,
		long companyId, OrderByComparator<Audi> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last audi in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching audi
	* @throws NoSuchAudiException if a matching audi could not be found
	*/
	public static Audi findByUuid_C_Last(java.lang.String uuid, long companyId,
		OrderByComparator<Audi> orderByComparator)
		throws gov.nasa.hq.myaudi.exception.NoSuchAudiException {
		return getPersistence()
				   .findByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last audi in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching audi, or <code>null</code> if a matching audi could not be found
	*/
	public static Audi fetchByUuid_C_Last(java.lang.String uuid,
		long companyId, OrderByComparator<Audi> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the audis before and after the current audi in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param audiId the primary key of the current audi
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next audi
	* @throws NoSuchAudiException if a audi with the primary key could not be found
	*/
	public static Audi[] findByUuid_C_PrevAndNext(long audiId,
		java.lang.String uuid, long companyId,
		OrderByComparator<Audi> orderByComparator)
		throws gov.nasa.hq.myaudi.exception.NoSuchAudiException {
		return getPersistence()
				   .findByUuid_C_PrevAndNext(audiId, uuid, companyId,
			orderByComparator);
	}

	/**
	* Removes all the audis where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public static void removeByUuid_C(java.lang.String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	* Returns the number of audis where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching audis
	*/
	public static int countByUuid_C(java.lang.String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	* Returns all the audis where exteriorColor = &#63;.
	*
	* @param exteriorColor the exterior color
	* @return the matching audis
	*/
	public static List<Audi> findByexteriorColor(java.lang.String exteriorColor) {
		return getPersistence().findByexteriorColor(exteriorColor);
	}

	/**
	* Returns a range of all the audis where exteriorColor = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AudiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param exteriorColor the exterior color
	* @param start the lower bound of the range of audis
	* @param end the upper bound of the range of audis (not inclusive)
	* @return the range of matching audis
	*/
	public static List<Audi> findByexteriorColor(
		java.lang.String exteriorColor, int start, int end) {
		return getPersistence().findByexteriorColor(exteriorColor, start, end);
	}

	/**
	* Returns an ordered range of all the audis where exteriorColor = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AudiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param exteriorColor the exterior color
	* @param start the lower bound of the range of audis
	* @param end the upper bound of the range of audis (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching audis
	*/
	public static List<Audi> findByexteriorColor(
		java.lang.String exteriorColor, int start, int end,
		OrderByComparator<Audi> orderByComparator) {
		return getPersistence()
				   .findByexteriorColor(exteriorColor, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the audis where exteriorColor = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AudiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param exteriorColor the exterior color
	* @param start the lower bound of the range of audis
	* @param end the upper bound of the range of audis (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching audis
	*/
	public static List<Audi> findByexteriorColor(
		java.lang.String exteriorColor, int start, int end,
		OrderByComparator<Audi> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findByexteriorColor(exteriorColor, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first audi in the ordered set where exteriorColor = &#63;.
	*
	* @param exteriorColor the exterior color
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching audi
	* @throws NoSuchAudiException if a matching audi could not be found
	*/
	public static Audi findByexteriorColor_First(
		java.lang.String exteriorColor,
		OrderByComparator<Audi> orderByComparator)
		throws gov.nasa.hq.myaudi.exception.NoSuchAudiException {
		return getPersistence()
				   .findByexteriorColor_First(exteriorColor, orderByComparator);
	}

	/**
	* Returns the first audi in the ordered set where exteriorColor = &#63;.
	*
	* @param exteriorColor the exterior color
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching audi, or <code>null</code> if a matching audi could not be found
	*/
	public static Audi fetchByexteriorColor_First(
		java.lang.String exteriorColor,
		OrderByComparator<Audi> orderByComparator) {
		return getPersistence()
				   .fetchByexteriorColor_First(exteriorColor, orderByComparator);
	}

	/**
	* Returns the last audi in the ordered set where exteriorColor = &#63;.
	*
	* @param exteriorColor the exterior color
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching audi
	* @throws NoSuchAudiException if a matching audi could not be found
	*/
	public static Audi findByexteriorColor_Last(
		java.lang.String exteriorColor,
		OrderByComparator<Audi> orderByComparator)
		throws gov.nasa.hq.myaudi.exception.NoSuchAudiException {
		return getPersistence()
				   .findByexteriorColor_Last(exteriorColor, orderByComparator);
	}

	/**
	* Returns the last audi in the ordered set where exteriorColor = &#63;.
	*
	* @param exteriorColor the exterior color
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching audi, or <code>null</code> if a matching audi could not be found
	*/
	public static Audi fetchByexteriorColor_Last(
		java.lang.String exteriorColor,
		OrderByComparator<Audi> orderByComparator) {
		return getPersistence()
				   .fetchByexteriorColor_Last(exteriorColor, orderByComparator);
	}

	/**
	* Returns the audis before and after the current audi in the ordered set where exteriorColor = &#63;.
	*
	* @param audiId the primary key of the current audi
	* @param exteriorColor the exterior color
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next audi
	* @throws NoSuchAudiException if a audi with the primary key could not be found
	*/
	public static Audi[] findByexteriorColor_PrevAndNext(long audiId,
		java.lang.String exteriorColor,
		OrderByComparator<Audi> orderByComparator)
		throws gov.nasa.hq.myaudi.exception.NoSuchAudiException {
		return getPersistence()
				   .findByexteriorColor_PrevAndNext(audiId, exteriorColor,
			orderByComparator);
	}

	/**
	* Removes all the audis where exteriorColor = &#63; from the database.
	*
	* @param exteriorColor the exterior color
	*/
	public static void removeByexteriorColor(java.lang.String exteriorColor) {
		getPersistence().removeByexteriorColor(exteriorColor);
	}

	/**
	* Returns the number of audis where exteriorColor = &#63;.
	*
	* @param exteriorColor the exterior color
	* @return the number of matching audis
	*/
	public static int countByexteriorColor(java.lang.String exteriorColor) {
		return getPersistence().countByexteriorColor(exteriorColor);
	}

	/**
	* Caches the audi in the entity cache if it is enabled.
	*
	* @param audi the audi
	*/
	public static void cacheResult(Audi audi) {
		getPersistence().cacheResult(audi);
	}

	/**
	* Caches the audis in the entity cache if it is enabled.
	*
	* @param audis the audis
	*/
	public static void cacheResult(List<Audi> audis) {
		getPersistence().cacheResult(audis);
	}

	/**
	* Creates a new audi with the primary key. Does not add the audi to the database.
	*
	* @param audiId the primary key for the new audi
	* @return the new audi
	*/
	public static Audi create(long audiId) {
		return getPersistence().create(audiId);
	}

	/**
	* Removes the audi with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param audiId the primary key of the audi
	* @return the audi that was removed
	* @throws NoSuchAudiException if a audi with the primary key could not be found
	*/
	public static Audi remove(long audiId)
		throws gov.nasa.hq.myaudi.exception.NoSuchAudiException {
		return getPersistence().remove(audiId);
	}

	public static Audi updateImpl(Audi audi) {
		return getPersistence().updateImpl(audi);
	}

	/**
	* Returns the audi with the primary key or throws a {@link NoSuchAudiException} if it could not be found.
	*
	* @param audiId the primary key of the audi
	* @return the audi
	* @throws NoSuchAudiException if a audi with the primary key could not be found
	*/
	public static Audi findByPrimaryKey(long audiId)
		throws gov.nasa.hq.myaudi.exception.NoSuchAudiException {
		return getPersistence().findByPrimaryKey(audiId);
	}

	/**
	* Returns the audi with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param audiId the primary key of the audi
	* @return the audi, or <code>null</code> if a audi with the primary key could not be found
	*/
	public static Audi fetchByPrimaryKey(long audiId) {
		return getPersistence().fetchByPrimaryKey(audiId);
	}

	public static java.util.Map<java.io.Serializable, Audi> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the audis.
	*
	* @return the audis
	*/
	public static List<Audi> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the audis.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AudiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of audis
	* @param end the upper bound of the range of audis (not inclusive)
	* @return the range of audis
	*/
	public static List<Audi> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the audis.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AudiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of audis
	* @param end the upper bound of the range of audis (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of audis
	*/
	public static List<Audi> findAll(int start, int end,
		OrderByComparator<Audi> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the audis.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AudiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of audis
	* @param end the upper bound of the range of audis (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of audis
	*/
	public static List<Audi> findAll(int start, int end,
		OrderByComparator<Audi> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the audis from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of audis.
	*
	* @return the number of audis
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static AudiPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<AudiPersistence, AudiPersistence> _serviceTracker =
		ServiceTrackerFactory.open(AudiPersistence.class);
}