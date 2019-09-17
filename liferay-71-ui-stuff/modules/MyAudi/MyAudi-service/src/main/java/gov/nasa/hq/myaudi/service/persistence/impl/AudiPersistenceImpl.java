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

package gov.nasa.hq.myaudi.service.persistence.impl;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.service.persistence.CompanyProvider;
import com.liferay.portal.kernel.service.persistence.CompanyProviderWrapper;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;
import com.liferay.portal.spring.extender.service.ServiceReference;

import aQute.bnd.annotation.ProviderType;
import gov.nasa.hq.myaudi.exception.NoSuchAudiException;
import gov.nasa.hq.myaudi.model.Audi;
import gov.nasa.hq.myaudi.model.impl.AudiImpl;
import gov.nasa.hq.myaudi.model.impl.AudiModelImpl;
import gov.nasa.hq.myaudi.service.persistence.AudiPersistence;

/**
 * The persistence implementation for the audi service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AudiPersistence
 * @see gov.nasa.hq.myaudi.service.persistence.AudiUtil
 * @generated
 */
@ProviderType
public class AudiPersistenceImpl extends BasePersistenceImpl<Audi> implements AudiPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link AudiUtil} to access the audi
     * persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = AudiImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY + ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY + ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(AudiModelImpl.ENTITY_CACHE_ENABLED,
            AudiModelImpl.FINDER_CACHE_ENABLED, AudiImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll",
            new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(
            AudiModelImpl.ENTITY_CACHE_ENABLED, AudiModelImpl.FINDER_CACHE_ENABLED, AudiImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(AudiModelImpl.ENTITY_CACHE_ENABLED,
            AudiModelImpl.FINDER_CACHE_ENABLED, Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
            new String[0]);
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID = new FinderPath(
            AudiModelImpl.ENTITY_CACHE_ENABLED, AudiModelImpl.FINDER_CACHE_ENABLED, AudiImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid", new String[] {
                    String.class.getName(),

                    Integer.class.getName(),
                    Integer.class.getName(),
                    OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID = new FinderPath(
            AudiModelImpl.ENTITY_CACHE_ENABLED, AudiModelImpl.FINDER_CACHE_ENABLED, AudiImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid", new String[] {
                    String.class.getName()
            }, AudiModelImpl.UUID_COLUMN_BITMASK | AudiModelImpl.EXTERIORCOLOR_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_UUID = new FinderPath(AudiModelImpl.ENTITY_CACHE_ENABLED,
            AudiModelImpl.FINDER_CACHE_ENABLED, Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
            new String[] {
                    String.class.getName()
            });

    /**
     * Returns all the audis where uuid = &#63;.
     *
     * @param uuid
     *            the uuid
     * @return the matching audis
     */
    @Override
    public List<Audi> findByUuid(String uuid) {
        return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

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
    @Override
    public List<Audi> findByUuid(String uuid, int start, int end) {
        return findByUuid(uuid, start, end, null);
    }

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
    @Override
    public List<Audi> findByUuid(String uuid, int start, int end, OrderByComparator<Audi> orderByComparator) {
        return findByUuid(uuid, start, end, orderByComparator, true);
    }

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
    @Override
    public List<Audi> findByUuid(String uuid, int start, int end, OrderByComparator<Audi> orderByComparator,
            boolean retrieveFromCache) {
        uuid = Objects.toString(uuid, "");

        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) && (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID;
            finderArgs = new Object[] {
                    uuid
            };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID;
            finderArgs = new Object[] {
                    uuid,
                    start,
                    end,
                    orderByComparator
            };
        }

        List<Audi> list = null;

        if (retrieveFromCache) {
            list = (List<Audi>) finderCache.getResult(finderPath, finderArgs, this);

            if ((list != null) && !list.isEmpty()) {
                for (Audi audi : list) {
                    if (!uuid.equals(audi.getUuid())) {
                        list = null;

                        break;
                    }
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(3 + (orderByComparator.getOrderByFields().length * 2));
            } else {
                query = new StringBundler(3);
            }

            query.append(_SQL_SELECT_AUDI_WHERE);

            boolean bindUuid = false;

            if (uuid.isEmpty()) {
                query.append(_FINDER_COLUMN_UUID_UUID_3);
            } else {
                bindUuid = true;

                query.append(_FINDER_COLUMN_UUID_UUID_2);
            }

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
            } else if (pagination) {
                query.append(AudiModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindUuid) {
                    qPos.add(uuid);
                }

                if (!pagination) {
                    list = (List<Audi>) QueryUtil.list(q, getDialect(), start, end, false);

                    Collections.sort(list);

                    list = Collections.unmodifiableList(list);
                } else {
                    list = (List<Audi>) QueryUtil.list(q, getDialect(), start, end);
                }

                cacheResult(list);

                finderCache.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                finderCache.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

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
    @Override
    public Audi findByUuid_First(String uuid, OrderByComparator<Audi> orderByComparator) throws NoSuchAudiException {
        Audi audi = fetchByUuid_First(uuid, orderByComparator);

        if (audi != null) {
            return audi;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("uuid=");
        msg.append(uuid);

        msg.append("}");

        throw new NoSuchAudiException(msg.toString());
    }

    /**
     * Returns the first audi in the ordered set where uuid = &#63;.
     *
     * @param uuid
     *            the uuid
     * @param orderByComparator
     *            the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching audi, or <code>null</code> if a matching audi could not be found
     */
    @Override
    public Audi fetchByUuid_First(String uuid, OrderByComparator<Audi> orderByComparator) {
        List<Audi> list = findByUuid(uuid, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

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
    @Override
    public Audi findByUuid_Last(String uuid, OrderByComparator<Audi> orderByComparator) throws NoSuchAudiException {
        Audi audi = fetchByUuid_Last(uuid, orderByComparator);

        if (audi != null) {
            return audi;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("uuid=");
        msg.append(uuid);

        msg.append("}");

        throw new NoSuchAudiException(msg.toString());
    }

    /**
     * Returns the last audi in the ordered set where uuid = &#63;.
     *
     * @param uuid
     *            the uuid
     * @param orderByComparator
     *            the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching audi, or <code>null</code> if a matching audi could not be found
     */
    @Override
    public Audi fetchByUuid_Last(String uuid, OrderByComparator<Audi> orderByComparator) {
        int count = countByUuid(uuid);

        if (count == 0) {
            return null;
        }

        List<Audi> list = findByUuid(uuid, count - 1, count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

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
    @Override
    public Audi[] findByUuid_PrevAndNext(long audiId, String uuid, OrderByComparator<Audi> orderByComparator)
            throws NoSuchAudiException {
        uuid = Objects.toString(uuid, "");

        Audi audi = findByPrimaryKey(audiId);

        Session session = null;

        try {
            session = openSession();

            Audi[] array = new AudiImpl[3];

            array[0] = getByUuid_PrevAndNext(session, audi, uuid, orderByComparator, true);

            array[1] = audi;

            array[2] = getByUuid_PrevAndNext(session, audi, uuid, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Audi getByUuid_PrevAndNext(Session session, Audi audi, String uuid, OrderByComparator<Audi> orderByComparator,
            boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(4 + (orderByComparator.getOrderByConditionFields().length * 3)
                    + (orderByComparator.getOrderByFields().length * 3));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_AUDI_WHERE);

        boolean bindUuid = false;

        if (uuid.isEmpty()) {
            query.append(_FINDER_COLUMN_UUID_UUID_3);
        } else {
            bindUuid = true;

            query.append(_FINDER_COLUMN_UUID_UUID_2);
        }

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        } else {
            query.append(AudiModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        if (bindUuid) {
            qPos.add(uuid);
        }

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(audi);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Audi> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the audis where uuid = &#63; from the database.
     *
     * @param uuid
     *            the uuid
     */
    @Override
    public void removeByUuid(String uuid) {
        for (Audi audi : findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(audi);
        }
    }

    /**
     * Returns the number of audis where uuid = &#63;.
     *
     * @param uuid
     *            the uuid
     * @return the number of matching audis
     */
    @Override
    public int countByUuid(String uuid) {
        uuid = Objects.toString(uuid, "");

        FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID;

        Object[] finderArgs = new Object[] {
                uuid
        };

        Long count = (Long) finderCache.getResult(finderPath, finderArgs, this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_AUDI_WHERE);

            boolean bindUuid = false;

            if (uuid.isEmpty()) {
                query.append(_FINDER_COLUMN_UUID_UUID_3);
            } else {
                bindUuid = true;

                query.append(_FINDER_COLUMN_UUID_UUID_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindUuid) {
                    qPos.add(uuid);
                }

                count = (Long) q.uniqueResult();

                finderCache.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                finderCache.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    private static final String _FINDER_COLUMN_UUID_UUID_1 = "audi.uuid IS NULL";
    private static final String _FINDER_COLUMN_UUID_UUID_2 = "audi.uuid = ?";
    private static final String _FINDER_COLUMN_UUID_UUID_3 = "(audi.uuid IS NULL OR audi.uuid = '')";
    public static final FinderPath FINDER_PATH_FETCH_BY_UUID_G = new FinderPath(AudiModelImpl.ENTITY_CACHE_ENABLED,
            AudiModelImpl.FINDER_CACHE_ENABLED, AudiImpl.class, FINDER_CLASS_NAME_ENTITY, "fetchByUUID_G", new String[] {
                    String.class.getName(),
                    Long.class.getName()
            }, AudiModelImpl.UUID_COLUMN_BITMASK | AudiModelImpl.GROUPID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_UUID_G = new FinderPath(AudiModelImpl.ENTITY_CACHE_ENABLED,
            AudiModelImpl.FINDER_CACHE_ENABLED, Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUUID_G",
            new String[] {
                    String.class.getName(),
                    Long.class.getName()
            });

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
    @Override
    public Audi findByUUID_G(String uuid, long groupId) throws NoSuchAudiException {
        Audi audi = fetchByUUID_G(uuid, groupId);

        if (audi == null) {
            StringBundler msg = new StringBundler(6);

            msg.append(_NO_SUCH_ENTITY_WITH_KEY);

            msg.append("uuid=");
            msg.append(uuid);

            msg.append(", groupId=");
            msg.append(groupId);

            msg.append("}");

            if (_log.isDebugEnabled()) {
                _log.debug(msg.toString());
            }

            throw new NoSuchAudiException(msg.toString());
        }

        return audi;
    }

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
    @Override
    public Audi fetchByUUID_G(String uuid, long groupId) {
        return fetchByUUID_G(uuid, groupId, true);
    }

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
    @Override
    public Audi fetchByUUID_G(String uuid, long groupId, boolean retrieveFromCache) {
        uuid = Objects.toString(uuid, "");

        Object[] finderArgs = new Object[] {
                uuid,
                groupId
        };

        Object result = null;

        if (retrieveFromCache) {
            result = finderCache.getResult(FINDER_PATH_FETCH_BY_UUID_G, finderArgs, this);
        }

        if (result instanceof Audi) {
            Audi audi = (Audi) result;

            if (!Objects.equals(uuid, audi.getUuid()) || (groupId != audi.getGroupId())) {
                result = null;
            }
        }

        if (result == null) {
            StringBundler query = new StringBundler(4);

            query.append(_SQL_SELECT_AUDI_WHERE);

            boolean bindUuid = false;

            if (uuid.isEmpty()) {
                query.append(_FINDER_COLUMN_UUID_G_UUID_3);
            } else {
                bindUuid = true;

                query.append(_FINDER_COLUMN_UUID_G_UUID_2);
            }

            query.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindUuid) {
                    qPos.add(uuid);
                }

                qPos.add(groupId);

                List<Audi> list = q.list();

                if (list.isEmpty()) {
                    finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G, finderArgs, list);
                } else {
                    Audi audi = list.get(0);

                    result = audi;

                    cacheResult(audi);
                }
            } catch (Exception e) {
                finderCache.removeResult(FINDER_PATH_FETCH_BY_UUID_G, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        if (result instanceof List<?>) {
            return null;
        } else {
            return (Audi) result;
        }
    }

    /**
     * Removes the audi where uuid = &#63; and groupId = &#63; from the database.
     *
     * @param uuid
     *            the uuid
     * @param groupId
     *            the group ID
     * @return the audi that was removed
     */
    @Override
    public Audi removeByUUID_G(String uuid, long groupId) throws NoSuchAudiException {
        Audi audi = findByUUID_G(uuid, groupId);

        return remove(audi);
    }

    /**
     * Returns the number of audis where uuid = &#63; and groupId = &#63;.
     *
     * @param uuid
     *            the uuid
     * @param groupId
     *            the group ID
     * @return the number of matching audis
     */
    @Override
    public int countByUUID_G(String uuid, long groupId) {
        uuid = Objects.toString(uuid, "");

        FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_G;

        Object[] finderArgs = new Object[] {
                uuid,
                groupId
        };

        Long count = (Long) finderCache.getResult(finderPath, finderArgs, this);

        if (count == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_COUNT_AUDI_WHERE);

            boolean bindUuid = false;

            if (uuid.isEmpty()) {
                query.append(_FINDER_COLUMN_UUID_G_UUID_3);
            } else {
                bindUuid = true;

                query.append(_FINDER_COLUMN_UUID_G_UUID_2);
            }

            query.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindUuid) {
                    qPos.add(uuid);
                }

                qPos.add(groupId);

                count = (Long) q.uniqueResult();

                finderCache.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                finderCache.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    private static final String _FINDER_COLUMN_UUID_G_UUID_1 = "audi.uuid IS NULL AND ";
    private static final String _FINDER_COLUMN_UUID_G_UUID_2 = "audi.uuid = ? AND ";
    private static final String _FINDER_COLUMN_UUID_G_UUID_3 = "(audi.uuid IS NULL OR audi.uuid = '') AND ";
    private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 = "audi.groupId = ?";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C = new FinderPath(
            AudiModelImpl.ENTITY_CACHE_ENABLED, AudiModelImpl.FINDER_CACHE_ENABLED, AudiImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid_C", new String[] {
                    String.class.getName(),
                    Long.class.getName(),

                    Integer.class.getName(),
                    Integer.class.getName(),
                    OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C = new FinderPath(
            AudiModelImpl.ENTITY_CACHE_ENABLED, AudiModelImpl.FINDER_CACHE_ENABLED, AudiImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid_C", new String[] {
                    String.class.getName(),
                    Long.class.getName()
            }, AudiModelImpl.UUID_COLUMN_BITMASK | AudiModelImpl.COMPANYID_COLUMN_BITMASK
                    | AudiModelImpl.EXTERIORCOLOR_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_UUID_C = new FinderPath(AudiModelImpl.ENTITY_CACHE_ENABLED,
            AudiModelImpl.FINDER_CACHE_ENABLED, Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid_C",
            new String[] {
                    String.class.getName(),
                    Long.class.getName()
            });

    /**
     * Returns all the audis where uuid = &#63; and companyId = &#63;.
     *
     * @param uuid
     *            the uuid
     * @param companyId
     *            the company ID
     * @return the matching audis
     */
    @Override
    public List<Audi> findByUuid_C(String uuid, long companyId) {
        return findByUuid_C(uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

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
    @Override
    public List<Audi> findByUuid_C(String uuid, long companyId, int start, int end) {
        return findByUuid_C(uuid, companyId, start, end, null);
    }

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
    @Override
    public List<Audi> findByUuid_C(String uuid, long companyId, int start, int end,
            OrderByComparator<Audi> orderByComparator) {
        return findByUuid_C(uuid, companyId, start, end, orderByComparator, true);
    }

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
    @Override
    public List<Audi> findByUuid_C(String uuid, long companyId, int start, int end,
            OrderByComparator<Audi> orderByComparator, boolean retrieveFromCache) {
        uuid = Objects.toString(uuid, "");

        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) && (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C;
            finderArgs = new Object[] {
                    uuid,
                    companyId
            };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C;
            finderArgs = new Object[] {
                    uuid,
                    companyId,

                    start,
                    end,
                    orderByComparator
            };
        }

        List<Audi> list = null;

        if (retrieveFromCache) {
            list = (List<Audi>) finderCache.getResult(finderPath, finderArgs, this);

            if ((list != null) && !list.isEmpty()) {
                for (Audi audi : list) {
                    if (!uuid.equals(audi.getUuid()) || (companyId != audi.getCompanyId())) {
                        list = null;

                        break;
                    }
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(4 + (orderByComparator.getOrderByFields().length * 2));
            } else {
                query = new StringBundler(4);
            }

            query.append(_SQL_SELECT_AUDI_WHERE);

            boolean bindUuid = false;

            if (uuid.isEmpty()) {
                query.append(_FINDER_COLUMN_UUID_C_UUID_3);
            } else {
                bindUuid = true;

                query.append(_FINDER_COLUMN_UUID_C_UUID_2);
            }

            query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
            } else if (pagination) {
                query.append(AudiModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindUuid) {
                    qPos.add(uuid);
                }

                qPos.add(companyId);

                if (!pagination) {
                    list = (List<Audi>) QueryUtil.list(q, getDialect(), start, end, false);

                    Collections.sort(list);

                    list = Collections.unmodifiableList(list);
                } else {
                    list = (List<Audi>) QueryUtil.list(q, getDialect(), start, end);
                }

                cacheResult(list);

                finderCache.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                finderCache.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

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
    @Override
    public Audi findByUuid_C_First(String uuid, long companyId, OrderByComparator<Audi> orderByComparator)
            throws NoSuchAudiException {
        Audi audi = fetchByUuid_C_First(uuid, companyId, orderByComparator);

        if (audi != null) {
            return audi;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("uuid=");
        msg.append(uuid);

        msg.append(", companyId=");
        msg.append(companyId);

        msg.append("}");

        throw new NoSuchAudiException(msg.toString());
    }

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
    @Override
    public Audi fetchByUuid_C_First(String uuid, long companyId, OrderByComparator<Audi> orderByComparator) {
        List<Audi> list = findByUuid_C(uuid, companyId, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

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
    @Override
    public Audi findByUuid_C_Last(String uuid, long companyId, OrderByComparator<Audi> orderByComparator)
            throws NoSuchAudiException {
        Audi audi = fetchByUuid_C_Last(uuid, companyId, orderByComparator);

        if (audi != null) {
            return audi;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("uuid=");
        msg.append(uuid);

        msg.append(", companyId=");
        msg.append(companyId);

        msg.append("}");

        throw new NoSuchAudiException(msg.toString());
    }

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
    @Override
    public Audi fetchByUuid_C_Last(String uuid, long companyId, OrderByComparator<Audi> orderByComparator) {
        int count = countByUuid_C(uuid, companyId);

        if (count == 0) {
            return null;
        }

        List<Audi> list = findByUuid_C(uuid, companyId, count - 1, count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

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
    @Override
    public Audi[] findByUuid_C_PrevAndNext(long audiId, String uuid, long companyId,
            OrderByComparator<Audi> orderByComparator) throws NoSuchAudiException {
        uuid = Objects.toString(uuid, "");

        Audi audi = findByPrimaryKey(audiId);

        Session session = null;

        try {
            session = openSession();

            Audi[] array = new AudiImpl[3];

            array[0] = getByUuid_C_PrevAndNext(session, audi, uuid, companyId, orderByComparator, true);

            array[1] = audi;

            array[2] = getByUuid_C_PrevAndNext(session, audi, uuid, companyId, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Audi getByUuid_C_PrevAndNext(Session session, Audi audi, String uuid, long companyId,
            OrderByComparator<Audi> orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(5 + (orderByComparator.getOrderByConditionFields().length * 3)
                    + (orderByComparator.getOrderByFields().length * 3));
        } else {
            query = new StringBundler(4);
        }

        query.append(_SQL_SELECT_AUDI_WHERE);

        boolean bindUuid = false;

        if (uuid.isEmpty()) {
            query.append(_FINDER_COLUMN_UUID_C_UUID_3);
        } else {
            bindUuid = true;

            query.append(_FINDER_COLUMN_UUID_C_UUID_2);
        }

        query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        } else {
            query.append(AudiModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        if (bindUuid) {
            qPos.add(uuid);
        }

        qPos.add(companyId);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(audi);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Audi> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the audis where uuid = &#63; and companyId = &#63; from the database.
     *
     * @param uuid
     *            the uuid
     * @param companyId
     *            the company ID
     */
    @Override
    public void removeByUuid_C(String uuid, long companyId) {
        for (Audi audi : findByUuid_C(uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(audi);
        }
    }

    /**
     * Returns the number of audis where uuid = &#63; and companyId = &#63;.
     *
     * @param uuid
     *            the uuid
     * @param companyId
     *            the company ID
     * @return the number of matching audis
     */
    @Override
    public int countByUuid_C(String uuid, long companyId) {
        uuid = Objects.toString(uuid, "");

        FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_C;

        Object[] finderArgs = new Object[] {
                uuid,
                companyId
        };

        Long count = (Long) finderCache.getResult(finderPath, finderArgs, this);

        if (count == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_COUNT_AUDI_WHERE);

            boolean bindUuid = false;

            if (uuid.isEmpty()) {
                query.append(_FINDER_COLUMN_UUID_C_UUID_3);
            } else {
                bindUuid = true;

                query.append(_FINDER_COLUMN_UUID_C_UUID_2);
            }

            query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindUuid) {
                    qPos.add(uuid);
                }

                qPos.add(companyId);

                count = (Long) q.uniqueResult();

                finderCache.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                finderCache.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    private static final String _FINDER_COLUMN_UUID_C_UUID_1 = "audi.uuid IS NULL AND ";
    private static final String _FINDER_COLUMN_UUID_C_UUID_2 = "audi.uuid = ? AND ";
    private static final String _FINDER_COLUMN_UUID_C_UUID_3 = "(audi.uuid IS NULL OR audi.uuid = '') AND ";
    private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 = "audi.companyId = ?";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_EXTERIORCOLOR = new FinderPath(
            AudiModelImpl.ENTITY_CACHE_ENABLED, AudiModelImpl.FINDER_CACHE_ENABLED, AudiImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByexteriorColor", new String[] {
                    String.class.getName(),

                    Integer.class.getName(),
                    Integer.class.getName(),
                    OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EXTERIORCOLOR = new FinderPath(
            AudiModelImpl.ENTITY_CACHE_ENABLED, AudiModelImpl.FINDER_CACHE_ENABLED, AudiImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByexteriorColor", new String[] {
                    String.class.getName()
            }, AudiModelImpl.EXTERIORCOLOR_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_EXTERIORCOLOR = new FinderPath(AudiModelImpl.ENTITY_CACHE_ENABLED,
            AudiModelImpl.FINDER_CACHE_ENABLED, Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "countByexteriorColor", new String[] {
                    String.class.getName()
            });

    /**
     * Returns all the audis where exteriorColor = &#63;.
     *
     * @param exteriorColor
     *            the exterior color
     * @return the matching audis
     */
    @Override
    public List<Audi> findByexteriorColor(String exteriorColor) {
        return findByexteriorColor(exteriorColor, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

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
    @Override
    public List<Audi> findByexteriorColor(String exteriorColor, int start, int end) {
        return findByexteriorColor(exteriorColor, start, end, null);
    }

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
    @Override
    public List<Audi> findByexteriorColor(String exteriorColor, int start, int end,
            OrderByComparator<Audi> orderByComparator) {
        return findByexteriorColor(exteriorColor, start, end, orderByComparator, true);
    }

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
    @Override
    public List<Audi> findByexteriorColor(String exteriorColor, int start, int end,
            OrderByComparator<Audi> orderByComparator, boolean retrieveFromCache) {
        exteriorColor = Objects.toString(exteriorColor, "");

        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) && (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EXTERIORCOLOR;
            finderArgs = new Object[] {
                    exteriorColor
            };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_EXTERIORCOLOR;
            finderArgs = new Object[] {
                    exteriorColor,

                    start,
                    end,
                    orderByComparator
            };
        }

        List<Audi> list = null;

        if (retrieveFromCache) {
            list = (List<Audi>) finderCache.getResult(finderPath, finderArgs, this);

            if ((list != null) && !list.isEmpty()) {
                for (Audi audi : list) {
                    if (!exteriorColor.equals(audi.getExteriorColor())) {
                        list = null;

                        break;
                    }
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(3 + (orderByComparator.getOrderByFields().length * 2));
            } else {
                query = new StringBundler(3);
            }

            query.append(_SQL_SELECT_AUDI_WHERE);

            boolean bindExteriorColor = false;

            if (exteriorColor.isEmpty()) {
                query.append(_FINDER_COLUMN_EXTERIORCOLOR_EXTERIORCOLOR_3);
            } else {
                bindExteriorColor = true;

                query.append(_FINDER_COLUMN_EXTERIORCOLOR_EXTERIORCOLOR_2);
            }

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
            } else if (pagination) {
                query.append(AudiModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindExteriorColor) {
                    qPos.add(exteriorColor);
                }

                if (!pagination) {
                    list = (List<Audi>) QueryUtil.list(q, getDialect(), start, end, false);

                    Collections.sort(list);

                    list = Collections.unmodifiableList(list);
                } else {
                    list = (List<Audi>) QueryUtil.list(q, getDialect(), start, end);
                }

                cacheResult(list);

                finderCache.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                finderCache.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

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
    @Override
    public Audi findByexteriorColor_First(String exteriorColor, OrderByComparator<Audi> orderByComparator)
            throws NoSuchAudiException {
        Audi audi = fetchByexteriorColor_First(exteriorColor, orderByComparator);

        if (audi != null) {
            return audi;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("exteriorColor=");
        msg.append(exteriorColor);

        msg.append("}");

        throw new NoSuchAudiException(msg.toString());
    }

    /**
     * Returns the first audi in the ordered set where exteriorColor = &#63;.
     *
     * @param exteriorColor
     *            the exterior color
     * @param orderByComparator
     *            the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching audi, or <code>null</code> if a matching audi could not be found
     */
    @Override
    public Audi fetchByexteriorColor_First(String exteriorColor, OrderByComparator<Audi> orderByComparator) {
        List<Audi> list = findByexteriorColor(exteriorColor, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

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
    @Override
    public Audi findByexteriorColor_Last(String exteriorColor, OrderByComparator<Audi> orderByComparator)
            throws NoSuchAudiException {
        Audi audi = fetchByexteriorColor_Last(exteriorColor, orderByComparator);

        if (audi != null) {
            return audi;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("exteriorColor=");
        msg.append(exteriorColor);

        msg.append("}");

        throw new NoSuchAudiException(msg.toString());
    }

    /**
     * Returns the last audi in the ordered set where exteriorColor = &#63;.
     *
     * @param exteriorColor
     *            the exterior color
     * @param orderByComparator
     *            the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching audi, or <code>null</code> if a matching audi could not be found
     */
    @Override
    public Audi fetchByexteriorColor_Last(String exteriorColor, OrderByComparator<Audi> orderByComparator) {
        int count = countByexteriorColor(exteriorColor);

        if (count == 0) {
            return null;
        }

        List<Audi> list = findByexteriorColor(exteriorColor, count - 1, count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

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
    @Override
    public Audi[] findByexteriorColor_PrevAndNext(long audiId, String exteriorColor,
            OrderByComparator<Audi> orderByComparator) throws NoSuchAudiException {
        exteriorColor = Objects.toString(exteriorColor, "");

        Audi audi = findByPrimaryKey(audiId);

        Session session = null;

        try {
            session = openSession();

            Audi[] array = new AudiImpl[3];

            array[0] = getByexteriorColor_PrevAndNext(session, audi, exteriorColor, orderByComparator, true);

            array[1] = audi;

            array[2] = getByexteriorColor_PrevAndNext(session, audi, exteriorColor, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Audi getByexteriorColor_PrevAndNext(Session session, Audi audi, String exteriorColor,
            OrderByComparator<Audi> orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(4 + (orderByComparator.getOrderByConditionFields().length * 3)
                    + (orderByComparator.getOrderByFields().length * 3));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_AUDI_WHERE);

        boolean bindExteriorColor = false;

        if (exteriorColor.isEmpty()) {
            query.append(_FINDER_COLUMN_EXTERIORCOLOR_EXTERIORCOLOR_3);
        } else {
            bindExteriorColor = true;

            query.append(_FINDER_COLUMN_EXTERIORCOLOR_EXTERIORCOLOR_2);
        }

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        } else {
            query.append(AudiModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        if (bindExteriorColor) {
            qPos.add(exteriorColor);
        }

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(audi);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Audi> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the audis where exteriorColor = &#63; from the database.
     *
     * @param exteriorColor
     *            the exterior color
     */
    @Override
    public void removeByexteriorColor(String exteriorColor) {
        for (Audi audi : findByexteriorColor(exteriorColor, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(audi);
        }
    }

    /**
     * Returns the number of audis where exteriorColor = &#63;.
     *
     * @param exteriorColor
     *            the exterior color
     * @return the number of matching audis
     */
    @Override
    public int countByexteriorColor(String exteriorColor) {
        exteriorColor = Objects.toString(exteriorColor, "");

        FinderPath finderPath = FINDER_PATH_COUNT_BY_EXTERIORCOLOR;

        Object[] finderArgs = new Object[] {
                exteriorColor
        };

        Long count = (Long) finderCache.getResult(finderPath, finderArgs, this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_AUDI_WHERE);

            boolean bindExteriorColor = false;

            if (exteriorColor.isEmpty()) {
                query.append(_FINDER_COLUMN_EXTERIORCOLOR_EXTERIORCOLOR_3);
            } else {
                bindExteriorColor = true;

                query.append(_FINDER_COLUMN_EXTERIORCOLOR_EXTERIORCOLOR_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindExteriorColor) {
                    qPos.add(exteriorColor);
                }

                count = (Long) q.uniqueResult();

                finderCache.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                finderCache.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    private static final String _FINDER_COLUMN_EXTERIORCOLOR_EXTERIORCOLOR_1 = "audi.exteriorColor IS NULL";
    private static final String _FINDER_COLUMN_EXTERIORCOLOR_EXTERIORCOLOR_2 = "audi.exteriorColor = ?";
    private static final String _FINDER_COLUMN_EXTERIORCOLOR_EXTERIORCOLOR_3 = "(audi.exteriorColor IS NULL OR audi.exteriorColor = '')";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ALLWHEELDRIVE = new FinderPath(
            AudiModelImpl.ENTITY_CACHE_ENABLED, AudiModelImpl.FINDER_CACHE_ENABLED, AudiImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByallWheelDrive", new String[] {
                    Boolean.class.getName(),

                    Integer.class.getName(),
                    Integer.class.getName(),
                    OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ALLWHEELDRIVE = new FinderPath(
            AudiModelImpl.ENTITY_CACHE_ENABLED, AudiModelImpl.FINDER_CACHE_ENABLED, AudiImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByallWheelDrive", new String[] {
                    Boolean.class.getName()
            }, AudiModelImpl.ALLWHEELDRIVE_COLUMN_BITMASK | AudiModelImpl.EXTERIORCOLOR_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_ALLWHEELDRIVE = new FinderPath(AudiModelImpl.ENTITY_CACHE_ENABLED,
            AudiModelImpl.FINDER_CACHE_ENABLED, Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "countByallWheelDrive", new String[] {
                    Boolean.class.getName()
            });

    /**
     * Returns all the audis where allWheelDrive = &#63;.
     *
     * @param allWheelDrive
     *            the all wheel drive
     * @return the matching audis
     */
    @Override
    public List<Audi> findByallWheelDrive(boolean allWheelDrive) {
        return findByallWheelDrive(allWheelDrive, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

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
    @Override
    public List<Audi> findByallWheelDrive(boolean allWheelDrive, int start, int end) {
        return findByallWheelDrive(allWheelDrive, start, end, null);
    }

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
    @Override
    public List<Audi> findByallWheelDrive(boolean allWheelDrive, int start, int end,
            OrderByComparator<Audi> orderByComparator) {
        return findByallWheelDrive(allWheelDrive, start, end, orderByComparator, true);
    }

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
    @Override
    public List<Audi> findByallWheelDrive(boolean allWheelDrive, int start, int end,
            OrderByComparator<Audi> orderByComparator, boolean retrieveFromCache) {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) && (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ALLWHEELDRIVE;
            finderArgs = new Object[] {
                    allWheelDrive
            };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_ALLWHEELDRIVE;
            finderArgs = new Object[] {
                    allWheelDrive,

                    start,
                    end,
                    orderByComparator
            };
        }

        List<Audi> list = null;

        if (retrieveFromCache) {
            list = (List<Audi>) finderCache.getResult(finderPath, finderArgs, this);

            if ((list != null) && !list.isEmpty()) {
                for (Audi audi : list) {
                    if ((allWheelDrive != audi.isAllWheelDrive())) {
                        list = null;

                        break;
                    }
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(3 + (orderByComparator.getOrderByFields().length * 2));
            } else {
                query = new StringBundler(3);
            }

            query.append(_SQL_SELECT_AUDI_WHERE);

            query.append(_FINDER_COLUMN_ALLWHEELDRIVE_ALLWHEELDRIVE_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
            } else if (pagination) {
                query.append(AudiModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(allWheelDrive);

                if (!pagination) {
                    list = (List<Audi>) QueryUtil.list(q, getDialect(), start, end, false);

                    Collections.sort(list);

                    list = Collections.unmodifiableList(list);
                } else {
                    list = (List<Audi>) QueryUtil.list(q, getDialect(), start, end);
                }

                cacheResult(list);

                finderCache.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                finderCache.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

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
    @Override
    public Audi findByallWheelDrive_First(boolean allWheelDrive, OrderByComparator<Audi> orderByComparator)
            throws NoSuchAudiException {
        Audi audi = fetchByallWheelDrive_First(allWheelDrive, orderByComparator);

        if (audi != null) {
            return audi;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("allWheelDrive=");
        msg.append(allWheelDrive);

        msg.append("}");

        throw new NoSuchAudiException(msg.toString());
    }

    /**
     * Returns the first audi in the ordered set where allWheelDrive = &#63;.
     *
     * @param allWheelDrive
     *            the all wheel drive
     * @param orderByComparator
     *            the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching audi, or <code>null</code> if a matching audi could not be found
     */
    @Override
    public Audi fetchByallWheelDrive_First(boolean allWheelDrive, OrderByComparator<Audi> orderByComparator) {
        List<Audi> list = findByallWheelDrive(allWheelDrive, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

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
    @Override
    public Audi findByallWheelDrive_Last(boolean allWheelDrive, OrderByComparator<Audi> orderByComparator)
            throws NoSuchAudiException {
        Audi audi = fetchByallWheelDrive_Last(allWheelDrive, orderByComparator);

        if (audi != null) {
            return audi;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("allWheelDrive=");
        msg.append(allWheelDrive);

        msg.append("}");

        throw new NoSuchAudiException(msg.toString());
    }

    /**
     * Returns the last audi in the ordered set where allWheelDrive = &#63;.
     *
     * @param allWheelDrive
     *            the all wheel drive
     * @param orderByComparator
     *            the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching audi, or <code>null</code> if a matching audi could not be found
     */
    @Override
    public Audi fetchByallWheelDrive_Last(boolean allWheelDrive, OrderByComparator<Audi> orderByComparator) {
        int count = countByallWheelDrive(allWheelDrive);

        if (count == 0) {
            return null;
        }

        List<Audi> list = findByallWheelDrive(allWheelDrive, count - 1, count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

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
    @Override
    public Audi[] findByallWheelDrive_PrevAndNext(long audiId, boolean allWheelDrive,
            OrderByComparator<Audi> orderByComparator) throws NoSuchAudiException {
        Audi audi = findByPrimaryKey(audiId);

        Session session = null;

        try {
            session = openSession();

            Audi[] array = new AudiImpl[3];

            array[0] = getByallWheelDrive_PrevAndNext(session, audi, allWheelDrive, orderByComparator, true);

            array[1] = audi;

            array[2] = getByallWheelDrive_PrevAndNext(session, audi, allWheelDrive, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Audi getByallWheelDrive_PrevAndNext(Session session, Audi audi, boolean allWheelDrive,
            OrderByComparator<Audi> orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(4 + (orderByComparator.getOrderByConditionFields().length * 3)
                    + (orderByComparator.getOrderByFields().length * 3));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_AUDI_WHERE);

        query.append(_FINDER_COLUMN_ALLWHEELDRIVE_ALLWHEELDRIVE_2);

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        } else {
            query.append(AudiModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(allWheelDrive);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(audi);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Audi> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the audis where allWheelDrive = &#63; from the database.
     *
     * @param allWheelDrive
     *            the all wheel drive
     */
    @Override
    public void removeByallWheelDrive(boolean allWheelDrive) {
        for (Audi audi : findByallWheelDrive(allWheelDrive, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(audi);
        }
    }

    /**
     * Returns the number of audis where allWheelDrive = &#63;.
     *
     * @param allWheelDrive
     *            the all wheel drive
     * @return the number of matching audis
     */
    @Override
    public int countByallWheelDrive(boolean allWheelDrive) {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_ALLWHEELDRIVE;

        Object[] finderArgs = new Object[] {
                allWheelDrive
        };

        Long count = (Long) finderCache.getResult(finderPath, finderArgs, this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_AUDI_WHERE);

            query.append(_FINDER_COLUMN_ALLWHEELDRIVE_ALLWHEELDRIVE_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(allWheelDrive);

                count = (Long) q.uniqueResult();

                finderCache.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                finderCache.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    private static final String _FINDER_COLUMN_ALLWHEELDRIVE_ALLWHEELDRIVE_2 = "audi.allWheelDrive = ?";

    public AudiPersistenceImpl() {
        setModelClass(Audi.class);

        try {
            Field field = BasePersistenceImpl.class.getDeclaredField("_dbColumnNames");

            field.setAccessible(true);

            Map<String, String> dbColumnNames = new HashMap<String, String>();

            dbColumnNames.put("uuid", "uuid_");

            field.set(this, dbColumnNames);
        } catch (Exception e) {
            if (_log.isDebugEnabled()) {
                _log.debug(e, e);
            }
        }
    }

    /**
     * Caches the audi in the entity cache if it is enabled.
     *
     * @param audi
     *            the audi
     */
    @Override
    public void cacheResult(Audi audi) {
        entityCache.putResult(AudiModelImpl.ENTITY_CACHE_ENABLED, AudiImpl.class, audi.getPrimaryKey(), audi);

        finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G, new Object[] {
                audi.getUuid(),
                audi.getGroupId()
        }, audi);

        audi.resetOriginalValues();
    }

    /**
     * Caches the audis in the entity cache if it is enabled.
     *
     * @param audis
     *            the audis
     */
    @Override
    public void cacheResult(List<Audi> audis) {
        for (Audi audi : audis) {
            if (entityCache.getResult(AudiModelImpl.ENTITY_CACHE_ENABLED, AudiImpl.class, audi.getPrimaryKey()) == null) {
                cacheResult(audi);
            } else {
                audi.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all audis.
     *
     * <p>
     * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        entityCache.clearCache(AudiImpl.class);

        finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
        finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the audi.
     *
     * <p>
     * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(Audi audi) {
        entityCache.removeResult(AudiModelImpl.ENTITY_CACHE_ENABLED, AudiImpl.class, audi.getPrimaryKey());

        finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        clearUniqueFindersCache((AudiModelImpl) audi, true);
    }

    @Override
    public void clearCache(List<Audi> audis) {
        finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (Audi audi : audis) {
            entityCache.removeResult(AudiModelImpl.ENTITY_CACHE_ENABLED, AudiImpl.class, audi.getPrimaryKey());

            clearUniqueFindersCache((AudiModelImpl) audi, true);
        }
    }

    protected void cacheUniqueFindersCache(AudiModelImpl audiModelImpl) {
        Object[] args = new Object[] {
                audiModelImpl.getUuid(),
                audiModelImpl.getGroupId()
        };

        finderCache.putResult(FINDER_PATH_COUNT_BY_UUID_G, args, Long.valueOf(1), false);
        finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G, args, audiModelImpl, false);
    }

    protected void clearUniqueFindersCache(AudiModelImpl audiModelImpl, boolean clearCurrent) {
        if (clearCurrent) {
            Object[] args = new Object[] {
                    audiModelImpl.getUuid(),
                    audiModelImpl.getGroupId()
            };

            finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
            finderCache.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);
        }

        if ((audiModelImpl.getColumnBitmask() & FINDER_PATH_FETCH_BY_UUID_G.getColumnBitmask()) != 0) {
            Object[] args = new Object[] {
                    audiModelImpl.getOriginalUuid(),
                    audiModelImpl.getOriginalGroupId()
            };

            finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
            finderCache.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);
        }
    }

    /**
     * Creates a new audi with the primary key. Does not add the audi to the database.
     *
     * @param audiId
     *            the primary key for the new audi
     * @return the new audi
     */
    @Override
    public Audi create(long audiId) {
        Audi audi = new AudiImpl();

        audi.setNew(true);
        audi.setPrimaryKey(audiId);

        String uuid = PortalUUIDUtil.generate();

        audi.setUuid(uuid);

        audi.setCompanyId(companyProvider.getCompanyId());

        return audi;
    }

    /**
     * Removes the audi with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param audiId
     *            the primary key of the audi
     * @return the audi that was removed
     * @throws NoSuchAudiException
     *             if a audi with the primary key could not be found
     */
    @Override
    public Audi remove(long audiId) throws NoSuchAudiException {
        return remove((Serializable) audiId);
    }

    /**
     * Removes the audi with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey
     *            the primary key of the audi
     * @return the audi that was removed
     * @throws NoSuchAudiException
     *             if a audi with the primary key could not be found
     */
    @Override
    public Audi remove(Serializable primaryKey) throws NoSuchAudiException {
        Session session = null;

        try {
            session = openSession();

            Audi audi = (Audi) session.get(AudiImpl.class, primaryKey);

            if (audi == null) {
                if (_log.isDebugEnabled()) {
                    _log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchAudiException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            return remove(audi);
        } catch (NoSuchAudiException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected Audi removeImpl(Audi audi) {
        Session session = null;

        try {
            session = openSession();

            if (!session.contains(audi)) {
                audi = (Audi) session.get(AudiImpl.class, audi.getPrimaryKeyObj());
            }

            if (audi != null) {
                session.delete(audi);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (audi != null) {
            clearCache(audi);
        }

        return audi;
    }

    @Override
    public Audi updateImpl(Audi audi) {
        boolean isNew = audi.isNew();

        if (!(audi instanceof AudiModelImpl)) {
            InvocationHandler invocationHandler = null;

            if (ProxyUtil.isProxyClass(audi.getClass())) {
                invocationHandler = ProxyUtil.getInvocationHandler(audi);

                throw new IllegalArgumentException("Implement ModelWrapper in audi proxy " + invocationHandler.getClass());
            }

            throw new IllegalArgumentException("Implement ModelWrapper in custom Audi implementation " + audi.getClass());
        }

        AudiModelImpl audiModelImpl = (AudiModelImpl) audi;

        if (Validator.isNull(audi.getUuid())) {
            String uuid = PortalUUIDUtil.generate();

            audi.setUuid(uuid);
        }

        ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();

        Date now = new Date();

        if (isNew && (audi.getCreateDate() == null)) {
            if (serviceContext == null) {
                audi.setCreateDate(now);
            } else {
                audi.setCreateDate(serviceContext.getCreateDate(now));
            }
        }

        if (!audiModelImpl.hasSetModifiedDate()) {
            if (serviceContext == null) {
                audi.setModifiedDate(now);
            } else {
                audi.setModifiedDate(serviceContext.getModifiedDate(now));
            }
        }

        Session session = null;

        try {
            session = openSession();

            if (audi.isNew()) {
                session.save(audi);

                audi.setNew(false);
            } else {
                audi = (Audi) session.merge(audi);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (!AudiModelImpl.COLUMN_BITMASK_ENABLED) {
            finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        } else if (isNew) {
            Object[] args = new Object[] {
                    audiModelImpl.getUuid()
            };

            finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
            finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID, args);

            args = new Object[] {
                    audiModelImpl.getUuid(),
                    audiModelImpl.getCompanyId()
            };

            finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
            finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C, args);

            args = new Object[] {
                    audiModelImpl.getExteriorColor()
            };

            finderCache.removeResult(FINDER_PATH_COUNT_BY_EXTERIORCOLOR, args);
            finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EXTERIORCOLOR, args);

            args = new Object[] {
                    audiModelImpl.isAllWheelDrive()
            };

            finderCache.removeResult(FINDER_PATH_COUNT_BY_ALLWHEELDRIVE, args);
            finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ALLWHEELDRIVE, args);

            finderCache.removeResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY);
            finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL, FINDER_ARGS_EMPTY);
        }

        else {
            if ((audiModelImpl.getColumnBitmask() & FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        audiModelImpl.getOriginalUuid()
                };

                finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
                finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID, args);

                args = new Object[] {
                        audiModelImpl.getUuid()
                };

                finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
                finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID, args);
            }

            if ((audiModelImpl.getColumnBitmask() & FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        audiModelImpl.getOriginalUuid(),
                        audiModelImpl.getOriginalCompanyId()
                };

                finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
                finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C, args);

                args = new Object[] {
                        audiModelImpl.getUuid(),
                        audiModelImpl.getCompanyId()
                };

                finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
                finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C, args);
            }

            if ((audiModelImpl.getColumnBitmask()
                    & FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EXTERIORCOLOR.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        audiModelImpl.getOriginalExteriorColor()
                };

                finderCache.removeResult(FINDER_PATH_COUNT_BY_EXTERIORCOLOR, args);
                finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EXTERIORCOLOR, args);

                args = new Object[] {
                        audiModelImpl.getExteriorColor()
                };

                finderCache.removeResult(FINDER_PATH_COUNT_BY_EXTERIORCOLOR, args);
                finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EXTERIORCOLOR, args);
            }

            if ((audiModelImpl.getColumnBitmask()
                    & FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ALLWHEELDRIVE.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        audiModelImpl.getOriginalAllWheelDrive()
                };

                finderCache.removeResult(FINDER_PATH_COUNT_BY_ALLWHEELDRIVE, args);
                finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ALLWHEELDRIVE, args);

                args = new Object[] {
                        audiModelImpl.isAllWheelDrive()
                };

                finderCache.removeResult(FINDER_PATH_COUNT_BY_ALLWHEELDRIVE, args);
                finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ALLWHEELDRIVE, args);
            }
        }

        entityCache.putResult(AudiModelImpl.ENTITY_CACHE_ENABLED, AudiImpl.class, audi.getPrimaryKey(), audi, false);

        clearUniqueFindersCache(audiModelImpl, false);
        cacheUniqueFindersCache(audiModelImpl);

        audi.resetOriginalValues();

        return audi;
    }

    /**
     * Returns the audi with the primary key or throws a
     * {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey
     *            the primary key of the audi
     * @return the audi
     * @throws NoSuchAudiException
     *             if a audi with the primary key could not be found
     */
    @Override
    public Audi findByPrimaryKey(Serializable primaryKey) throws NoSuchAudiException {
        Audi audi = fetchByPrimaryKey(primaryKey);

        if (audi == null) {
            if (_log.isDebugEnabled()) {
                _log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchAudiException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
        }

        return audi;
    }

    /**
     * Returns the audi with the primary key or throws a {@link NoSuchAudiException} if it could not be found.
     *
     * @param audiId
     *            the primary key of the audi
     * @return the audi
     * @throws NoSuchAudiException
     *             if a audi with the primary key could not be found
     */
    @Override
    public Audi findByPrimaryKey(long audiId) throws NoSuchAudiException {
        return findByPrimaryKey((Serializable) audiId);
    }

    /**
     * Returns the audi with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey
     *            the primary key of the audi
     * @return the audi, or <code>null</code> if a audi with the primary key could not be found
     */
    @Override
    public Audi fetchByPrimaryKey(Serializable primaryKey) {
        Serializable serializable = entityCache.getResult(AudiModelImpl.ENTITY_CACHE_ENABLED, AudiImpl.class, primaryKey);

        if (serializable == nullModel) {
            return null;
        }

        Audi audi = (Audi) serializable;

        if (audi == null) {
            Session session = null;

            try {
                session = openSession();

                audi = (Audi) session.get(AudiImpl.class, primaryKey);

                if (audi != null) {
                    cacheResult(audi);
                } else {
                    entityCache.putResult(AudiModelImpl.ENTITY_CACHE_ENABLED, AudiImpl.class, primaryKey, nullModel);
                }
            } catch (Exception e) {
                entityCache.removeResult(AudiModelImpl.ENTITY_CACHE_ENABLED, AudiImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return audi;
    }

    /**
     * Returns the audi with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param audiId
     *            the primary key of the audi
     * @return the audi, or <code>null</code> if a audi with the primary key could not be found
     */
    @Override
    public Audi fetchByPrimaryKey(long audiId) {
        return fetchByPrimaryKey((Serializable) audiId);
    }

    @Override
    public Map<Serializable, Audi> fetchByPrimaryKeys(Set<Serializable> primaryKeys) {
        if (primaryKeys.isEmpty()) {
            return Collections.emptyMap();
        }

        Map<Serializable, Audi> map = new HashMap<Serializable, Audi>();

        if (primaryKeys.size() == 1) {
            Iterator<Serializable> iterator = primaryKeys.iterator();

            Serializable primaryKey = iterator.next();

            Audi audi = fetchByPrimaryKey(primaryKey);

            if (audi != null) {
                map.put(primaryKey, audi);
            }

            return map;
        }

        Set<Serializable> uncachedPrimaryKeys = null;

        for (Serializable primaryKey : primaryKeys) {
            Serializable serializable = entityCache.getResult(AudiModelImpl.ENTITY_CACHE_ENABLED, AudiImpl.class,
                    primaryKey);

            if (serializable != nullModel) {
                if (serializable == null) {
                    if (uncachedPrimaryKeys == null) {
                        uncachedPrimaryKeys = new HashSet<Serializable>();
                    }

                    uncachedPrimaryKeys.add(primaryKey);
                } else {
                    map.put(primaryKey, (Audi) serializable);
                }
            }
        }

        if (uncachedPrimaryKeys == null) {
            return map;
        }

        StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) + 1);

        query.append(_SQL_SELECT_AUDI_WHERE_PKS_IN);

        for (Serializable primaryKey : uncachedPrimaryKeys) {
            query.append((long) primaryKey);

            query.append(",");
        }

        query.setIndex(query.index() - 1);

        query.append(")");

        String sql = query.toString();

        Session session = null;

        try {
            session = openSession();

            Query q = session.createQuery(sql);

            for (Audi audi : (List<Audi>) q.list()) {
                map.put(audi.getPrimaryKeyObj(), audi);

                cacheResult(audi);

                uncachedPrimaryKeys.remove(audi.getPrimaryKeyObj());
            }

            for (Serializable primaryKey : uncachedPrimaryKeys) {
                entityCache.putResult(AudiModelImpl.ENTITY_CACHE_ENABLED, AudiImpl.class, primaryKey, nullModel);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        return map;
    }

    /**
     * Returns all the audis.
     *
     * @return the audis
     */
    @Override
    public List<Audi> findAll() {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

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
    @Override
    public List<Audi> findAll(int start, int end) {
        return findAll(start, end, null);
    }

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
    @Override
    public List<Audi> findAll(int start, int end, OrderByComparator<Audi> orderByComparator) {
        return findAll(start, end, orderByComparator, true);
    }

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
    @Override
    public List<Audi> findAll(int start, int end, OrderByComparator<Audi> orderByComparator, boolean retrieveFromCache) {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) && (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
            finderArgs = FINDER_ARGS_EMPTY;
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
            finderArgs = new Object[] {
                    start,
                    end,
                    orderByComparator
            };
        }

        List<Audi> list = null;

        if (retrieveFromCache) {
            list = (List<Audi>) finderCache.getResult(finderPath, finderArgs, this);
        }

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 + (orderByComparator.getOrderByFields().length * 2));

                query.append(_SQL_SELECT_AUDI);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_AUDI;

                if (pagination) {
                    sql = sql.concat(AudiModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<Audi>) QueryUtil.list(q, getDialect(), start, end, false);

                    Collections.sort(list);

                    list = Collections.unmodifiableList(list);
                } else {
                    list = (List<Audi>) QueryUtil.list(q, getDialect(), start, end);
                }

                cacheResult(list);

                finderCache.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                finderCache.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Removes all the audis from the database.
     *
     */
    @Override
    public void removeAll() {
        for (Audi audi : findAll()) {
            remove(audi);
        }
    }

    /**
     * Returns the number of audis.
     *
     * @return the number of audis
     */
    @Override
    public int countAll() {
        Long count = (Long) finderCache.getResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY, this);

        if (count == null) {
            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(_SQL_COUNT_AUDI);

                count = (Long) q.uniqueResult();

                finderCache.putResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY, count);
            } catch (Exception e) {
                finderCache.removeResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    @Override
    public Set<String> getBadColumnNames() {
        return _badColumnNames;
    }

    @Override
    protected Map<String, Integer> getTableColumnsMap() {
        return AudiModelImpl.TABLE_COLUMNS_MAP;
    }

    /**
     * Initializes the audi persistence.
     */
    public void afterPropertiesSet() {
    }

    public void destroy() {
        entityCache.removeCache(AudiImpl.class.getName());
        finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
        finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @ServiceReference(type = CompanyProviderWrapper.class)
    protected CompanyProvider companyProvider;
    @ServiceReference(type = EntityCache.class)
    protected EntityCache entityCache;
    @ServiceReference(type = FinderCache.class)
    protected FinderCache finderCache;
    private static final String _SQL_SELECT_AUDI = "SELECT audi FROM Audi audi";
    private static final String _SQL_SELECT_AUDI_WHERE_PKS_IN = "SELECT audi FROM Audi audi WHERE audiId IN (";
    private static final String _SQL_SELECT_AUDI_WHERE = "SELECT audi FROM Audi audi WHERE ";
    private static final String _SQL_COUNT_AUDI = "SELECT COUNT(audi) FROM Audi audi";
    private static final String _SQL_COUNT_AUDI_WHERE = "SELECT COUNT(audi) FROM Audi audi WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "audi.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Audi exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Audi exists with the key {";
    private static final Log _log = LogFactoryUtil.getLog(AudiPersistenceImpl.class);
    private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
            "uuid"
    });
}
