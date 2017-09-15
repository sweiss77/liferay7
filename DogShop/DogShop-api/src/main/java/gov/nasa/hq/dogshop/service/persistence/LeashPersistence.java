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

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import gov.nasa.hq.dogshop.exception.NoSuchLeashException;
import gov.nasa.hq.dogshop.model.Leash;

/**
 * The persistence interface for the leash service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see gov.nasa.hq.dogshop.service.persistence.impl.LeashPersistenceImpl
 * @see LeashUtil
 * @generated
 */
@ProviderType
public interface LeashPersistence extends BasePersistence<Leash> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link LeashUtil} to access the leash persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the leashs where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching leashs
	*/
	public java.util.List<Leash> findByUuid(java.lang.String uuid);

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
	public java.util.List<Leash> findByUuid(java.lang.String uuid, int start,
		int end);

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
	public java.util.List<Leash> findByUuid(java.lang.String uuid, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Leash> orderByComparator);

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
	public java.util.List<Leash> findByUuid(java.lang.String uuid, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Leash> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first leash in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching leash
	* @throws NoSuchLeashException if a matching leash could not be found
	*/
	public Leash findByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Leash> orderByComparator)
		throws NoSuchLeashException;

	/**
	* Returns the first leash in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching leash, or <code>null</code> if a matching leash could not be found
	*/
	public Leash fetchByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Leash> orderByComparator);

	/**
	* Returns the last leash in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching leash
	* @throws NoSuchLeashException if a matching leash could not be found
	*/
	public Leash findByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Leash> orderByComparator)
		throws NoSuchLeashException;

	/**
	* Returns the last leash in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching leash, or <code>null</code> if a matching leash could not be found
	*/
	public Leash fetchByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Leash> orderByComparator);

	/**
	* Returns the leashs before and after the current leash in the ordered set where uuid = &#63;.
	*
	* @param leashId the primary key of the current leash
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next leash
	* @throws NoSuchLeashException if a leash with the primary key could not be found
	*/
	public Leash[] findByUuid_PrevAndNext(long leashId, java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Leash> orderByComparator)
		throws NoSuchLeashException;

	/**
	* Removes all the leashs where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public void removeByUuid(java.lang.String uuid);

	/**
	* Returns the number of leashs where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching leashs
	*/
	public int countByUuid(java.lang.String uuid);

	/**
	* Returns the leash where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchLeashException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching leash
	* @throws NoSuchLeashException if a matching leash could not be found
	*/
	public Leash findByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchLeashException;

	/**
	* Returns the leash where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching leash, or <code>null</code> if a matching leash could not be found
	*/
	public Leash fetchByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns the leash where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching leash, or <code>null</code> if a matching leash could not be found
	*/
	public Leash fetchByUUID_G(java.lang.String uuid, long groupId,
		boolean retrieveFromCache);

	/**
	* Removes the leash where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the leash that was removed
	*/
	public Leash removeByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchLeashException;

	/**
	* Returns the number of leashs where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching leashs
	*/
	public int countByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns all the leashs where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching leashs
	*/
	public java.util.List<Leash> findByUuid_C(java.lang.String uuid,
		long companyId);

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
	public java.util.List<Leash> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end);

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
	public java.util.List<Leash> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Leash> orderByComparator);

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
	public java.util.List<Leash> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Leash> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first leash in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching leash
	* @throws NoSuchLeashException if a matching leash could not be found
	*/
	public Leash findByUuid_C_First(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Leash> orderByComparator)
		throws NoSuchLeashException;

	/**
	* Returns the first leash in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching leash, or <code>null</code> if a matching leash could not be found
	*/
	public Leash fetchByUuid_C_First(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Leash> orderByComparator);

	/**
	* Returns the last leash in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching leash
	* @throws NoSuchLeashException if a matching leash could not be found
	*/
	public Leash findByUuid_C_Last(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Leash> orderByComparator)
		throws NoSuchLeashException;

	/**
	* Returns the last leash in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching leash, or <code>null</code> if a matching leash could not be found
	*/
	public Leash fetchByUuid_C_Last(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Leash> orderByComparator);

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
	public Leash[] findByUuid_C_PrevAndNext(long leashId,
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Leash> orderByComparator)
		throws NoSuchLeashException;

	/**
	* Removes all the leashs where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public void removeByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns the number of leashs where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching leashs
	*/
	public int countByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns all the leashs where color = &#63;.
	*
	* @param color the color
	* @return the matching leashs
	*/
	public java.util.List<Leash> findByColor(java.lang.String color);

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
	public java.util.List<Leash> findByColor(java.lang.String color, int start,
		int end);

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
	public java.util.List<Leash> findByColor(java.lang.String color, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Leash> orderByComparator);

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
	public java.util.List<Leash> findByColor(java.lang.String color, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Leash> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first leash in the ordered set where color = &#63;.
	*
	* @param color the color
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching leash
	* @throws NoSuchLeashException if a matching leash could not be found
	*/
	public Leash findByColor_First(java.lang.String color,
		com.liferay.portal.kernel.util.OrderByComparator<Leash> orderByComparator)
		throws NoSuchLeashException;

	/**
	* Returns the first leash in the ordered set where color = &#63;.
	*
	* @param color the color
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching leash, or <code>null</code> if a matching leash could not be found
	*/
	public Leash fetchByColor_First(java.lang.String color,
		com.liferay.portal.kernel.util.OrderByComparator<Leash> orderByComparator);

	/**
	* Returns the last leash in the ordered set where color = &#63;.
	*
	* @param color the color
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching leash
	* @throws NoSuchLeashException if a matching leash could not be found
	*/
	public Leash findByColor_Last(java.lang.String color,
		com.liferay.portal.kernel.util.OrderByComparator<Leash> orderByComparator)
		throws NoSuchLeashException;

	/**
	* Returns the last leash in the ordered set where color = &#63;.
	*
	* @param color the color
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching leash, or <code>null</code> if a matching leash could not be found
	*/
	public Leash fetchByColor_Last(java.lang.String color,
		com.liferay.portal.kernel.util.OrderByComparator<Leash> orderByComparator);

	/**
	* Returns the leashs before and after the current leash in the ordered set where color = &#63;.
	*
	* @param leashId the primary key of the current leash
	* @param color the color
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next leash
	* @throws NoSuchLeashException if a leash with the primary key could not be found
	*/
	public Leash[] findByColor_PrevAndNext(long leashId,
		java.lang.String color,
		com.liferay.portal.kernel.util.OrderByComparator<Leash> orderByComparator)
		throws NoSuchLeashException;

	/**
	* Removes all the leashs where color = &#63; from the database.
	*
	* @param color the color
	*/
	public void removeByColor(java.lang.String color);

	/**
	* Returns the number of leashs where color = &#63;.
	*
	* @param color the color
	* @return the number of matching leashs
	*/
	public int countByColor(java.lang.String color);

	/**
	* Caches the leash in the entity cache if it is enabled.
	*
	* @param leash the leash
	*/
	public void cacheResult(Leash leash);

	/**
	* Caches the leashs in the entity cache if it is enabled.
	*
	* @param leashs the leashs
	*/
	public void cacheResult(java.util.List<Leash> leashs);

	/**
	* Creates a new leash with the primary key. Does not add the leash to the database.
	*
	* @param leashId the primary key for the new leash
	* @return the new leash
	*/
	public Leash create(long leashId);

	/**
	* Removes the leash with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param leashId the primary key of the leash
	* @return the leash that was removed
	* @throws NoSuchLeashException if a leash with the primary key could not be found
	*/
	public Leash remove(long leashId) throws NoSuchLeashException;

	public Leash updateImpl(Leash leash);

	/**
	* Returns the leash with the primary key or throws a {@link NoSuchLeashException} if it could not be found.
	*
	* @param leashId the primary key of the leash
	* @return the leash
	* @throws NoSuchLeashException if a leash with the primary key could not be found
	*/
	public Leash findByPrimaryKey(long leashId) throws NoSuchLeashException;

	/**
	* Returns the leash with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param leashId the primary key of the leash
	* @return the leash, or <code>null</code> if a leash with the primary key could not be found
	*/
	public Leash fetchByPrimaryKey(long leashId);

	@Override
	public java.util.Map<java.io.Serializable, Leash> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the leashs.
	*
	* @return the leashs
	*/
	public java.util.List<Leash> findAll();

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
	public java.util.List<Leash> findAll(int start, int end);

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
	public java.util.List<Leash> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Leash> orderByComparator);

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
	public java.util.List<Leash> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Leash> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the leashs from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of leashs.
	*
	* @return the number of leashs
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}