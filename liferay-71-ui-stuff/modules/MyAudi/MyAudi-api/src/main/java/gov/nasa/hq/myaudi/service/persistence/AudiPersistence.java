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

package gov.nasa.hq.myaudi.service.persistence;

import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

import aQute.bnd.annotation.ProviderType;
import gov.nasa.hq.myaudi.exception.NoSuchAudiException;
import gov.nasa.hq.myaudi.model.Audi;

/**
 * The persistence interface for the audi service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see gov.nasa.hq.myaudi.service.persistence.impl.AudiPersistenceImpl
 * @see AudiUtil
 * @generated
 */
@ProviderType
public interface AudiPersistence extends BasePersistence<Audi> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link AudiUtil} to access the audi
     * persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
     * Returns all the audis where uuid = &#63;.
     *
     * @param uuid
     *            the uuid
     * @return the matching audis
     */
    public java.util.List<Audi> findByUuid(String uuid);

    /**
     * Returns a range of all the audis where uuid = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances.
     * <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus,
     * <code>0</code> refers to the first result in the set. Setting both <code>start</code> and
     * <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If
     * <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If
     * <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and
     * <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY
     * logic from {@link AudiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for
     * performance reasons, the query will not have an ORDER BY clause and the returned result set will be
     * sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param uuid
     *            the uuid
     * @param start
     *            the lower bound of the range of audis
     * @param end
     *            the upper bound of the range of audis (not inclusive)
     * @return the range of matching audis
     */
    public java.util.List<Audi> findByUuid(String uuid, int start, int end);

    /**
     * Returns an ordered range of all the audis where uuid = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances.
     * <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus,
     * <code>0</code> refers to the first result in the set. Setting both <code>start</code> and
     * <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If
     * <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If
     * <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and
     * <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY
     * logic from {@link AudiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for
     * performance reasons, the query will not have an ORDER BY clause and the returned result set will be
     * sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param uuid
     *            the uuid
     * @param start
     *            the lower bound of the range of audis
     * @param end
     *            the upper bound of the range of audis (not inclusive)
     * @param orderByComparator
     *            the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching audis
     */
    public java.util.List<Audi> findByUuid(String uuid, int start, int end,
            com.liferay.portal.kernel.util.OrderByComparator<Audi> orderByComparator);

    /**
     * Returns an ordered range of all the audis where uuid = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances.
     * <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus,
     * <code>0</code> refers to the first result in the set. Setting both <code>start</code> and
     * <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If
     * <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If
     * <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and
     * <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY
     * logic from {@link AudiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for
     * performance reasons, the query will not have an ORDER BY clause and the returned result set will be
     * sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param uuid
     *            the uuid
     * @param start
     *            the lower bound of the range of audis
     * @param end
     *            the upper bound of the range of audis (not inclusive)
     * @param orderByComparator
     *            the comparator to order the results by (optionally <code>null</code>)
     * @param retrieveFromCache
     *            whether to retrieve from the finder cache
     * @return the ordered range of matching audis
     */
    public java.util.List<Audi> findByUuid(String uuid, int start, int end,
            com.liferay.portal.kernel.util.OrderByComparator<Audi> orderByComparator, boolean retrieveFromCache);

    /**
     * Returns the first audi in the ordered set where uuid = &#63;.
     *
     * @param uuid
     *            the uuid
     * @param orderByComparator
     *            the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching audi
     * @throws NoSuchAudiException
     *             if a matching audi could not be found
     */
    public Audi findByUuid_First(String uuid, com.liferay.portal.kernel.util.OrderByComparator<Audi> orderByComparator)
            throws NoSuchAudiException;

    /**
     * Returns the first audi in the ordered set where uuid = &#63;.
     *
     * @param uuid
     *            the uuid
     * @param orderByComparator
     *            the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching audi, or <code>null</code> if a matching audi could not be found
     */
    public Audi fetchByUuid_First(String uuid, com.liferay.portal.kernel.util.OrderByComparator<Audi> orderByComparator);

    /**
     * Returns the last audi in the ordered set where uuid = &#63;.
     *
     * @param uuid
     *            the uuid
     * @param orderByComparator
     *            the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching audi
     * @throws NoSuchAudiException
     *             if a matching audi could not be found
     */
    public Audi findByUuid_Last(String uuid, com.liferay.portal.kernel.util.OrderByComparator<Audi> orderByComparator)
            throws NoSuchAudiException;

    /**
     * Returns the last audi in the ordered set where uuid = &#63;.
     *
     * @param uuid
     *            the uuid
     * @param orderByComparator
     *            the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching audi, or <code>null</code> if a matching audi could not be found
     */
    public Audi fetchByUuid_Last(String uuid, com.liferay.portal.kernel.util.OrderByComparator<Audi> orderByComparator);

    /**
     * Returns the audis before and after the current audi in the ordered set where uuid = &#63;.
     *
     * @param audiId
     *            the primary key of the current audi
     * @param uuid
     *            the uuid
     * @param orderByComparator
     *            the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next audi
     * @throws NoSuchAudiException
     *             if a audi with the primary key could not be found
     */
    public Audi[] findByUuid_PrevAndNext(long audiId, String uuid,
            com.liferay.portal.kernel.util.OrderByComparator<Audi> orderByComparator) throws NoSuchAudiException;

    /**
     * Removes all the audis where uuid = &#63; from the database.
     *
     * @param uuid
     *            the uuid
     */
    public void removeByUuid(String uuid);

    /**
     * Returns the number of audis where uuid = &#63;.
     *
     * @param uuid
     *            the uuid
     * @return the number of matching audis
     */
    public int countByUuid(String uuid);

    /**
     * Returns the audi where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchAudiException} if it
     * could not be found.
     *
     * @param uuid
     *            the uuid
     * @param groupId
     *            the group ID
     * @return the matching audi
     * @throws NoSuchAudiException
     *             if a matching audi could not be found
     */
    public Audi findByUUID_G(String uuid, long groupId) throws NoSuchAudiException;

    /**
     * Returns the audi where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be
     * found. Uses the finder cache.
     *
     * @param uuid
     *            the uuid
     * @param groupId
     *            the group ID
     * @return the matching audi, or <code>null</code> if a matching audi could not be found
     */
    public Audi fetchByUUID_G(String uuid, long groupId);

    /**
     * Returns the audi where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be
     * found, optionally using the finder cache.
     *
     * @param uuid
     *            the uuid
     * @param groupId
     *            the group ID
     * @param retrieveFromCache
     *            whether to retrieve from the finder cache
     * @return the matching audi, or <code>null</code> if a matching audi could not be found
     */
    public Audi fetchByUUID_G(String uuid, long groupId, boolean retrieveFromCache);

    /**
     * Removes the audi where uuid = &#63; and groupId = &#63; from the database.
     *
     * @param uuid
     *            the uuid
     * @param groupId
     *            the group ID
     * @return the audi that was removed
     */
    public Audi removeByUUID_G(String uuid, long groupId) throws NoSuchAudiException;

    /**
     * Returns the number of audis where uuid = &#63; and groupId = &#63;.
     *
     * @param uuid
     *            the uuid
     * @param groupId
     *            the group ID
     * @return the number of matching audis
     */
    public int countByUUID_G(String uuid, long groupId);

    /**
     * Returns all the audis where uuid = &#63; and companyId = &#63;.
     *
     * @param uuid
     *            the uuid
     * @param companyId
     *            the company ID
     * @return the matching audis
     */
    public java.util.List<Audi> findByUuid_C(String uuid, long companyId);

    /**
     * Returns a range of all the audis where uuid = &#63; and companyId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances.
     * <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus,
     * <code>0</code> refers to the first result in the set. Setting both <code>start</code> and
     * <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If
     * <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If
     * <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and
     * <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY
     * logic from {@link AudiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for
     * performance reasons, the query will not have an ORDER BY clause and the returned result set will be
     * sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param uuid
     *            the uuid
     * @param companyId
     *            the company ID
     * @param start
     *            the lower bound of the range of audis
     * @param end
     *            the upper bound of the range of audis (not inclusive)
     * @return the range of matching audis
     */
    public java.util.List<Audi> findByUuid_C(String uuid, long companyId, int start, int end);

    /**
     * Returns an ordered range of all the audis where uuid = &#63; and companyId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances.
     * <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus,
     * <code>0</code> refers to the first result in the set. Setting both <code>start</code> and
     * <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If
     * <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If
     * <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and
     * <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY
     * logic from {@link AudiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for
     * performance reasons, the query will not have an ORDER BY clause and the returned result set will be
     * sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param uuid
     *            the uuid
     * @param companyId
     *            the company ID
     * @param start
     *            the lower bound of the range of audis
     * @param end
     *            the upper bound of the range of audis (not inclusive)
     * @param orderByComparator
     *            the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching audis
     */
    public java.util.List<Audi> findByUuid_C(String uuid, long companyId, int start, int end,
            com.liferay.portal.kernel.util.OrderByComparator<Audi> orderByComparator);

    /**
     * Returns an ordered range of all the audis where uuid = &#63; and companyId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances.
     * <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus,
     * <code>0</code> refers to the first result in the set. Setting both <code>start</code> and
     * <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If
     * <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If
     * <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and
     * <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY
     * logic from {@link AudiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for
     * performance reasons, the query will not have an ORDER BY clause and the returned result set will be
     * sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param uuid
     *            the uuid
     * @param companyId
     *            the company ID
     * @param start
     *            the lower bound of the range of audis
     * @param end
     *            the upper bound of the range of audis (not inclusive)
     * @param orderByComparator
     *            the comparator to order the results by (optionally <code>null</code>)
     * @param retrieveFromCache
     *            whether to retrieve from the finder cache
     * @return the ordered range of matching audis
     */
    public java.util.List<Audi> findByUuid_C(String uuid, long companyId, int start, int end,
            com.liferay.portal.kernel.util.OrderByComparator<Audi> orderByComparator, boolean retrieveFromCache);

    /**
     * Returns the first audi in the ordered set where uuid = &#63; and companyId = &#63;.
     *
     * @param uuid
     *            the uuid
     * @param companyId
     *            the company ID
     * @param orderByComparator
     *            the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching audi
     * @throws NoSuchAudiException
     *             if a matching audi could not be found
     */
    public Audi findByUuid_C_First(String uuid, long companyId,
            com.liferay.portal.kernel.util.OrderByComparator<Audi> orderByComparator) throws NoSuchAudiException;

    /**
     * Returns the first audi in the ordered set where uuid = &#63; and companyId = &#63;.
     *
     * @param uuid
     *            the uuid
     * @param companyId
     *            the company ID
     * @param orderByComparator
     *            the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching audi, or <code>null</code> if a matching audi could not be found
     */
    public Audi fetchByUuid_C_First(String uuid, long companyId,
            com.liferay.portal.kernel.util.OrderByComparator<Audi> orderByComparator);

    /**
     * Returns the last audi in the ordered set where uuid = &#63; and companyId = &#63;.
     *
     * @param uuid
     *            the uuid
     * @param companyId
     *            the company ID
     * @param orderByComparator
     *            the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching audi
     * @throws NoSuchAudiException
     *             if a matching audi could not be found
     */
    public Audi findByUuid_C_Last(String uuid, long companyId,
            com.liferay.portal.kernel.util.OrderByComparator<Audi> orderByComparator) throws NoSuchAudiException;

    /**
     * Returns the last audi in the ordered set where uuid = &#63; and companyId = &#63;.
     *
     * @param uuid
     *            the uuid
     * @param companyId
     *            the company ID
     * @param orderByComparator
     *            the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching audi, or <code>null</code> if a matching audi could not be found
     */
    public Audi fetchByUuid_C_Last(String uuid, long companyId,
            com.liferay.portal.kernel.util.OrderByComparator<Audi> orderByComparator);

    /**
     * Returns the audis before and after the current audi in the ordered set where uuid = &#63; and companyId
     * = &#63;.
     *
     * @param audiId
     *            the primary key of the current audi
     * @param uuid
     *            the uuid
     * @param companyId
     *            the company ID
     * @param orderByComparator
     *            the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next audi
     * @throws NoSuchAudiException
     *             if a audi with the primary key could not be found
     */
    public Audi[] findByUuid_C_PrevAndNext(long audiId, String uuid, long companyId,
            com.liferay.portal.kernel.util.OrderByComparator<Audi> orderByComparator) throws NoSuchAudiException;

    /**
     * Removes all the audis where uuid = &#63; and companyId = &#63; from the database.
     *
     * @param uuid
     *            the uuid
     * @param companyId
     *            the company ID
     */
    public void removeByUuid_C(String uuid, long companyId);

    /**
     * Returns the number of audis where uuid = &#63; and companyId = &#63;.
     *
     * @param uuid
     *            the uuid
     * @param companyId
     *            the company ID
     * @return the number of matching audis
     */
    public int countByUuid_C(String uuid, long companyId);

    /**
     * Returns all the audis where exteriorColor = &#63;.
     *
     * @param exteriorColor
     *            the exterior color
     * @return the matching audis
     */
    public java.util.List<Audi> findByexteriorColor(String exteriorColor);

    /**
     * Returns a range of all the audis where exteriorColor = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances.
     * <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus,
     * <code>0</code> refers to the first result in the set. Setting both <code>start</code> and
     * <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If
     * <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If
     * <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and
     * <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY
     * logic from {@link AudiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for
     * performance reasons, the query will not have an ORDER BY clause and the returned result set will be
     * sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param exteriorColor
     *            the exterior color
     * @param start
     *            the lower bound of the range of audis
     * @param end
     *            the upper bound of the range of audis (not inclusive)
     * @return the range of matching audis
     */
    public java.util.List<Audi> findByexteriorColor(String exteriorColor, int start, int end);

    /**
     * Returns an ordered range of all the audis where exteriorColor = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances.
     * <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus,
     * <code>0</code> refers to the first result in the set. Setting both <code>start</code> and
     * <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If
     * <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If
     * <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and
     * <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY
     * logic from {@link AudiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for
     * performance reasons, the query will not have an ORDER BY clause and the returned result set will be
     * sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param exteriorColor
     *            the exterior color
     * @param start
     *            the lower bound of the range of audis
     * @param end
     *            the upper bound of the range of audis (not inclusive)
     * @param orderByComparator
     *            the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching audis
     */
    public java.util.List<Audi> findByexteriorColor(String exteriorColor, int start, int end,
            com.liferay.portal.kernel.util.OrderByComparator<Audi> orderByComparator);

    /**
     * Returns an ordered range of all the audis where exteriorColor = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances.
     * <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus,
     * <code>0</code> refers to the first result in the set. Setting both <code>start</code> and
     * <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If
     * <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If
     * <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and
     * <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY
     * logic from {@link AudiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for
     * performance reasons, the query will not have an ORDER BY clause and the returned result set will be
     * sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param exteriorColor
     *            the exterior color
     * @param start
     *            the lower bound of the range of audis
     * @param end
     *            the upper bound of the range of audis (not inclusive)
     * @param orderByComparator
     *            the comparator to order the results by (optionally <code>null</code>)
     * @param retrieveFromCache
     *            whether to retrieve from the finder cache
     * @return the ordered range of matching audis
     */
    public java.util.List<Audi> findByexteriorColor(String exteriorColor, int start, int end,
            com.liferay.portal.kernel.util.OrderByComparator<Audi> orderByComparator, boolean retrieveFromCache);

    /**
     * Returns the first audi in the ordered set where exteriorColor = &#63;.
     *
     * @param exteriorColor
     *            the exterior color
     * @param orderByComparator
     *            the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching audi
     * @throws NoSuchAudiException
     *             if a matching audi could not be found
     */
    public Audi findByexteriorColor_First(String exteriorColor,
            com.liferay.portal.kernel.util.OrderByComparator<Audi> orderByComparator) throws NoSuchAudiException;

    /**
     * Returns the first audi in the ordered set where exteriorColor = &#63;.
     *
     * @param exteriorColor
     *            the exterior color
     * @param orderByComparator
     *            the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching audi, or <code>null</code> if a matching audi could not be found
     */
    public Audi fetchByexteriorColor_First(String exteriorColor,
            com.liferay.portal.kernel.util.OrderByComparator<Audi> orderByComparator);

    /**
     * Returns the last audi in the ordered set where exteriorColor = &#63;.
     *
     * @param exteriorColor
     *            the exterior color
     * @param orderByComparator
     *            the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching audi
     * @throws NoSuchAudiException
     *             if a matching audi could not be found
     */
    public Audi findByexteriorColor_Last(String exteriorColor,
            com.liferay.portal.kernel.util.OrderByComparator<Audi> orderByComparator) throws NoSuchAudiException;

    /**
     * Returns the last audi in the ordered set where exteriorColor = &#63;.
     *
     * @param exteriorColor
     *            the exterior color
     * @param orderByComparator
     *            the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching audi, or <code>null</code> if a matching audi could not be found
     */
    public Audi fetchByexteriorColor_Last(String exteriorColor,
            com.liferay.portal.kernel.util.OrderByComparator<Audi> orderByComparator);

    /**
     * Returns the audis before and after the current audi in the ordered set where exteriorColor = &#63;.
     *
     * @param audiId
     *            the primary key of the current audi
     * @param exteriorColor
     *            the exterior color
     * @param orderByComparator
     *            the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next audi
     * @throws NoSuchAudiException
     *             if a audi with the primary key could not be found
     */
    public Audi[] findByexteriorColor_PrevAndNext(long audiId, String exteriorColor,
            com.liferay.portal.kernel.util.OrderByComparator<Audi> orderByComparator) throws NoSuchAudiException;

    /**
     * Removes all the audis where exteriorColor = &#63; from the database.
     *
     * @param exteriorColor
     *            the exterior color
     */
    public void removeByexteriorColor(String exteriorColor);

    /**
     * Returns the number of audis where exteriorColor = &#63;.
     *
     * @param exteriorColor
     *            the exterior color
     * @return the number of matching audis
     */
    public int countByexteriorColor(String exteriorColor);

    /**
     * Returns all the audis where allWheelDrive = &#63;.
     *
     * @param allWheelDrive
     *            the all wheel drive
     * @return the matching audis
     */
    public java.util.List<Audi> findByallWheelDrive(boolean allWheelDrive);

    /**
     * Returns a range of all the audis where allWheelDrive = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances.
     * <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus,
     * <code>0</code> refers to the first result in the set. Setting both <code>start</code> and
     * <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If
     * <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If
     * <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and
     * <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY
     * logic from {@link AudiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for
     * performance reasons, the query will not have an ORDER BY clause and the returned result set will be
     * sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param allWheelDrive
     *            the all wheel drive
     * @param start
     *            the lower bound of the range of audis
     * @param end
     *            the upper bound of the range of audis (not inclusive)
     * @return the range of matching audis
     */
    public java.util.List<Audi> findByallWheelDrive(boolean allWheelDrive, int start, int end);

    /**
     * Returns an ordered range of all the audis where allWheelDrive = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances.
     * <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus,
     * <code>0</code> refers to the first result in the set. Setting both <code>start</code> and
     * <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If
     * <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If
     * <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and
     * <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY
     * logic from {@link AudiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for
     * performance reasons, the query will not have an ORDER BY clause and the returned result set will be
     * sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param allWheelDrive
     *            the all wheel drive
     * @param start
     *            the lower bound of the range of audis
     * @param end
     *            the upper bound of the range of audis (not inclusive)
     * @param orderByComparator
     *            the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching audis
     */
    public java.util.List<Audi> findByallWheelDrive(boolean allWheelDrive, int start, int end,
            com.liferay.portal.kernel.util.OrderByComparator<Audi> orderByComparator);

    /**
     * Returns an ordered range of all the audis where allWheelDrive = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances.
     * <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus,
     * <code>0</code> refers to the first result in the set. Setting both <code>start</code> and
     * <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If
     * <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If
     * <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and
     * <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY
     * logic from {@link AudiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for
     * performance reasons, the query will not have an ORDER BY clause and the returned result set will be
     * sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param allWheelDrive
     *            the all wheel drive
     * @param start
     *            the lower bound of the range of audis
     * @param end
     *            the upper bound of the range of audis (not inclusive)
     * @param orderByComparator
     *            the comparator to order the results by (optionally <code>null</code>)
     * @param retrieveFromCache
     *            whether to retrieve from the finder cache
     * @return the ordered range of matching audis
     */
    public java.util.List<Audi> findByallWheelDrive(boolean allWheelDrive, int start, int end,
            com.liferay.portal.kernel.util.OrderByComparator<Audi> orderByComparator, boolean retrieveFromCache);

    /**
     * Returns the first audi in the ordered set where allWheelDrive = &#63;.
     *
     * @param allWheelDrive
     *            the all wheel drive
     * @param orderByComparator
     *            the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching audi
     * @throws NoSuchAudiException
     *             if a matching audi could not be found
     */
    public Audi findByallWheelDrive_First(boolean allWheelDrive,
            com.liferay.portal.kernel.util.OrderByComparator<Audi> orderByComparator) throws NoSuchAudiException;

    /**
     * Returns the first audi in the ordered set where allWheelDrive = &#63;.
     *
     * @param allWheelDrive
     *            the all wheel drive
     * @param orderByComparator
     *            the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching audi, or <code>null</code> if a matching audi could not be found
     */
    public Audi fetchByallWheelDrive_First(boolean allWheelDrive,
            com.liferay.portal.kernel.util.OrderByComparator<Audi> orderByComparator);

    /**
     * Returns the last audi in the ordered set where allWheelDrive = &#63;.
     *
     * @param allWheelDrive
     *            the all wheel drive
     * @param orderByComparator
     *            the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching audi
     * @throws NoSuchAudiException
     *             if a matching audi could not be found
     */
    public Audi findByallWheelDrive_Last(boolean allWheelDrive,
            com.liferay.portal.kernel.util.OrderByComparator<Audi> orderByComparator) throws NoSuchAudiException;

    /**
     * Returns the last audi in the ordered set where allWheelDrive = &#63;.
     *
     * @param allWheelDrive
     *            the all wheel drive
     * @param orderByComparator
     *            the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching audi, or <code>null</code> if a matching audi could not be found
     */
    public Audi fetchByallWheelDrive_Last(boolean allWheelDrive,
            com.liferay.portal.kernel.util.OrderByComparator<Audi> orderByComparator);

    /**
     * Returns the audis before and after the current audi in the ordered set where allWheelDrive = &#63;.
     *
     * @param audiId
     *            the primary key of the current audi
     * @param allWheelDrive
     *            the all wheel drive
     * @param orderByComparator
     *            the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next audi
     * @throws NoSuchAudiException
     *             if a audi with the primary key could not be found
     */
    public Audi[] findByallWheelDrive_PrevAndNext(long audiId, boolean allWheelDrive,
            com.liferay.portal.kernel.util.OrderByComparator<Audi> orderByComparator) throws NoSuchAudiException;

    /**
     * Removes all the audis where allWheelDrive = &#63; from the database.
     *
     * @param allWheelDrive
     *            the all wheel drive
     */
    public void removeByallWheelDrive(boolean allWheelDrive);

    /**
     * Returns the number of audis where allWheelDrive = &#63;.
     *
     * @param allWheelDrive
     *            the all wheel drive
     * @return the number of matching audis
     */
    public int countByallWheelDrive(boolean allWheelDrive);

    /**
     * Caches the audi in the entity cache if it is enabled.
     *
     * @param audi
     *            the audi
     */
    public void cacheResult(Audi audi);

    /**
     * Caches the audis in the entity cache if it is enabled.
     *
     * @param audis
     *            the audis
     */
    public void cacheResult(java.util.List<Audi> audis);

    /**
     * Creates a new audi with the primary key. Does not add the audi to the database.
     *
     * @param audiId
     *            the primary key for the new audi
     * @return the new audi
     */
    public Audi create(long audiId);

    /**
     * Removes the audi with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param audiId
     *            the primary key of the audi
     * @return the audi that was removed
     * @throws NoSuchAudiException
     *             if a audi with the primary key could not be found
     */
    public Audi remove(long audiId) throws NoSuchAudiException;

    public Audi updateImpl(Audi audi);

    /**
     * Returns the audi with the primary key or throws a {@link NoSuchAudiException} if it could not be found.
     *
     * @param audiId
     *            the primary key of the audi
     * @return the audi
     * @throws NoSuchAudiException
     *             if a audi with the primary key could not be found
     */
    public Audi findByPrimaryKey(long audiId) throws NoSuchAudiException;

    /**
     * Returns the audi with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param audiId
     *            the primary key of the audi
     * @return the audi, or <code>null</code> if a audi with the primary key could not be found
     */
    public Audi fetchByPrimaryKey(long audiId);

    @Override
    public java.util.Map<java.io.Serializable, Audi> fetchByPrimaryKeys(java.util.Set<java.io.Serializable> primaryKeys);

    /**
     * Returns all the audis.
     *
     * @return the audis
     */
    public java.util.List<Audi> findAll();

    /**
     * Returns a range of all the audis.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances.
     * <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus,
     * <code>0</code> refers to the first result in the set. Setting both <code>start</code> and
     * <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If
     * <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If
     * <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and
     * <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY
     * logic from {@link AudiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for
     * performance reasons, the query will not have an ORDER BY clause and the returned result set will be
     * sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start
     *            the lower bound of the range of audis
     * @param end
     *            the upper bound of the range of audis (not inclusive)
     * @return the range of audis
     */
    public java.util.List<Audi> findAll(int start, int end);

    /**
     * Returns an ordered range of all the audis.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances.
     * <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus,
     * <code>0</code> refers to the first result in the set. Setting both <code>start</code> and
     * <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If
     * <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If
     * <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and
     * <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY
     * logic from {@link AudiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for
     * performance reasons, the query will not have an ORDER BY clause and the returned result set will be
     * sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start
     *            the lower bound of the range of audis
     * @param end
     *            the upper bound of the range of audis (not inclusive)
     * @param orderByComparator
     *            the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of audis
     */
    public java.util.List<Audi> findAll(int start, int end,
            com.liferay.portal.kernel.util.OrderByComparator<Audi> orderByComparator);

    /**
     * Returns an ordered range of all the audis.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances.
     * <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus,
     * <code>0</code> refers to the first result in the set. Setting both <code>start</code> and
     * <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If
     * <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If
     * <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and
     * <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY
     * logic from {@link AudiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for
     * performance reasons, the query will not have an ORDER BY clause and the returned result set will be
     * sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start
     *            the lower bound of the range of audis
     * @param end
     *            the upper bound of the range of audis (not inclusive)
     * @param orderByComparator
     *            the comparator to order the results by (optionally <code>null</code>)
     * @param retrieveFromCache
     *            whether to retrieve from the finder cache
     * @return the ordered range of audis
     */
    public java.util.List<Audi> findAll(int start, int end,
            com.liferay.portal.kernel.util.OrderByComparator<Audi> orderByComparator, boolean retrieveFromCache);

    /**
     * Removes all the audis from the database.
     */
    public void removeAll();

    /**
     * Returns the number of audis.
     *
     * @return the number of audis
     */
    public int countAll();

    @Override
    public java.util.Set<String> getBadColumnNames();
}
