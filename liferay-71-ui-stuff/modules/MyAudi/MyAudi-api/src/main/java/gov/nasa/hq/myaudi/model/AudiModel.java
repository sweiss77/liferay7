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

package gov.nasa.hq.myaudi.model;

import java.io.Serializable;
import java.util.Date;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.model.StagedAuditedModel;
import com.liferay.portal.kernel.service.ServiceContext;

import aQute.bnd.annotation.ProviderType;

/**
 * The base model interface for the Audi service. Represents a row in the &quot;myaudi_Audi&quot; database
 * table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link gov.nasa.hq.myaudi.model.impl.AudiModelImpl}
 * exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods
 * and all application logic should be put in {@link gov.nasa.hq.myaudi.model.impl.AudiImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Audi
 * @see gov.nasa.hq.myaudi.model.impl.AudiImpl
 * @see gov.nasa.hq.myaudi.model.impl.AudiModelImpl
 * @generated
 */
@ProviderType
public interface AudiModel extends BaseModel<Audi>, GroupedModel, ShardedModel, StagedAuditedModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a audi model instance should
     * use the {@link Audi} interface instead.
     */

    /**
     * Returns the primary key of this audi.
     *
     * @return the primary key of this audi
     */
    public long getPrimaryKey();

    /**
     * Sets the primary key of this audi.
     *
     * @param primaryKey
     *            the primary key of this audi
     */
    public void setPrimaryKey(long primaryKey);

    /**
     * Returns the uuid of this audi.
     *
     * @return the uuid of this audi
     */
    @AutoEscape
    @Override
    public String getUuid();

    /**
     * Sets the uuid of this audi.
     *
     * @param uuid
     *            the uuid of this audi
     */
    @Override
    public void setUuid(String uuid);

    /**
     * Returns the audi ID of this audi.
     *
     * @return the audi ID of this audi
     */
    public long getAudiId();

    /**
     * Sets the audi ID of this audi.
     *
     * @param audiId
     *            the audi ID of this audi
     */
    public void setAudiId(long audiId);

    /**
     * Returns the group ID of this audi.
     *
     * @return the group ID of this audi
     */
    @Override
    public long getGroupId();

    /**
     * Sets the group ID of this audi.
     *
     * @param groupId
     *            the group ID of this audi
     */
    @Override
    public void setGroupId(long groupId);

    /**
     * Returns the company ID of this audi.
     *
     * @return the company ID of this audi
     */
    @Override
    public long getCompanyId();

    /**
     * Sets the company ID of this audi.
     *
     * @param companyId
     *            the company ID of this audi
     */
    @Override
    public void setCompanyId(long companyId);

    /**
     * Returns the user ID of this audi.
     *
     * @return the user ID of this audi
     */
    @Override
    public long getUserId();

    /**
     * Sets the user ID of this audi.
     *
     * @param userId
     *            the user ID of this audi
     */
    @Override
    public void setUserId(long userId);

    /**
     * Returns the user uuid of this audi.
     *
     * @return the user uuid of this audi
     */
    @Override
    public String getUserUuid();

    /**
     * Sets the user uuid of this audi.
     *
     * @param userUuid
     *            the user uuid of this audi
     */
    @Override
    public void setUserUuid(String userUuid);

    /**
     * Returns the user name of this audi.
     *
     * @return the user name of this audi
     */
    @AutoEscape
    @Override
    public String getUserName();

    /**
     * Sets the user name of this audi.
     *
     * @param userName
     *            the user name of this audi
     */
    @Override
    public void setUserName(String userName);

    /**
     * Returns the create date of this audi.
     *
     * @return the create date of this audi
     */
    @Override
    public Date getCreateDate();

    /**
     * Sets the create date of this audi.
     *
     * @param createDate
     *            the create date of this audi
     */
    @Override
    public void setCreateDate(Date createDate);

    /**
     * Returns the modified date of this audi.
     *
     * @return the modified date of this audi
     */
    @Override
    public Date getModifiedDate();

    /**
     * Sets the modified date of this audi.
     *
     * @param modifiedDate
     *            the modified date of this audi
     */
    @Override
    public void setModifiedDate(Date modifiedDate);

    /**
     * Returns the model name of this audi.
     *
     * @return the model name of this audi
     */
    @AutoEscape
    public String getModelName();

    /**
     * Sets the model name of this audi.
     *
     * @param modelName
     *            the model name of this audi
     */
    public void setModelName(String modelName);

    /**
     * Returns the exterior color of this audi.
     *
     * @return the exterior color of this audi
     */
    @AutoEscape
    public String getExteriorColor();

    /**
     * Sets the exterior color of this audi.
     *
     * @param exteriorColor
     *            the exterior color of this audi
     */
    public void setExteriorColor(String exteriorColor);

    /**
     * Returns the interior color of this audi.
     *
     * @return the interior color of this audi
     */
    @AutoEscape
    public String getInteriorColor();

    /**
     * Sets the interior color of this audi.
     *
     * @param interiorColor
     *            the interior color of this audi
     */
    public void setInteriorColor(String interiorColor);

    /**
     * Returns the all wheel drive of this audi.
     *
     * @return the all wheel drive of this audi
     */
    public boolean getAllWheelDrive();

    /**
     * Returns <code>true</code> if this audi is all wheel drive.
     *
     * @return <code>true</code> if this audi is all wheel drive; <code>false</code> otherwise
     */
    public boolean isAllWheelDrive();

    /**
     * Sets whether this audi is all wheel drive.
     *
     * @param allWheelDrive
     *            the all wheel drive of this audi
     */
    public void setAllWheelDrive(boolean allWheelDrive);

    /**
     * Returns the technology package of this audi.
     *
     * @return the technology package of this audi
     */
    public boolean getTechnologyPackage();

    /**
     * Returns <code>true</code> if this audi is technology package.
     *
     * @return <code>true</code> if this audi is technology package; <code>false</code> otherwise
     */
    public boolean isTechnologyPackage();

    /**
     * Sets whether this audi is technology package.
     *
     * @param technologyPackage
     *            the technology package of this audi
     */
    public void setTechnologyPackage(boolean technologyPackage);

    /**
     * Returns the cold weather package of this audi.
     *
     * @return the cold weather package of this audi
     */
    public boolean getColdWeatherPackage();

    /**
     * Returns <code>true</code> if this audi is cold weather package.
     *
     * @return <code>true</code> if this audi is cold weather package; <code>false</code> otherwise
     */
    public boolean isColdWeatherPackage();

    /**
     * Sets whether this audi is cold weather package.
     *
     * @param coldWeatherPackage
     *            the cold weather package of this audi
     */
    public void setColdWeatherPackage(boolean coldWeatherPackage);

    @Override
    public boolean isNew();

    @Override
    public void setNew(boolean n);

    @Override
    public boolean isCachedModel();

    @Override
    public void setCachedModel(boolean cachedModel);

    @Override
    public boolean isEscapedModel();

    @Override
    public Serializable getPrimaryKeyObj();

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj);

    @Override
    public ExpandoBridge getExpandoBridge();

    @Override
    public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

    @Override
    public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext);

    @Override
    public Object clone();

    @Override
    public int compareTo(Audi audi);

    @Override
    public int hashCode();

    @Override
    public CacheModel<Audi> toCacheModel();

    @Override
    public Audi toEscapedModel();

    @Override
    public Audi toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}