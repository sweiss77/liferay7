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

package gov.nasa.hq.dogshop.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.model.StagedAuditedModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the Leash service. Represents a row in the &quot;nasa_Leash&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link gov.nasa.hq.dogshop.model.impl.LeashModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link gov.nasa.hq.dogshop.model.impl.LeashImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Leash
 * @see gov.nasa.hq.dogshop.model.impl.LeashImpl
 * @see gov.nasa.hq.dogshop.model.impl.LeashModelImpl
 * @generated
 */
@ProviderType
public interface LeashModel extends BaseModel<Leash>, GroupedModel, ShardedModel,
	StagedAuditedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a leash model instance should use the {@link Leash} interface instead.
	 */

	/**
	 * Returns the primary key of this leash.
	 *
	 * @return the primary key of this leash
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this leash.
	 *
	 * @param primaryKey the primary key of this leash
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this leash.
	 *
	 * @return the uuid of this leash
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this leash.
	 *
	 * @param uuid the uuid of this leash
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the leash ID of this leash.
	 *
	 * @return the leash ID of this leash
	 */
	public long getLeashId();

	/**
	 * Sets the leash ID of this leash.
	 *
	 * @param leashId the leash ID of this leash
	 */
	public void setLeashId(long leashId);

	/**
	 * Returns the group ID of this leash.
	 *
	 * @return the group ID of this leash
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this leash.
	 *
	 * @param groupId the group ID of this leash
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this leash.
	 *
	 * @return the company ID of this leash
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this leash.
	 *
	 * @param companyId the company ID of this leash
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this leash.
	 *
	 * @return the user ID of this leash
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this leash.
	 *
	 * @param userId the user ID of this leash
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this leash.
	 *
	 * @return the user uuid of this leash
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this leash.
	 *
	 * @param userUuid the user uuid of this leash
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this leash.
	 *
	 * @return the user name of this leash
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this leash.
	 *
	 * @param userName the user name of this leash
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this leash.
	 *
	 * @return the create date of this leash
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this leash.
	 *
	 * @param createDate the create date of this leash
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this leash.
	 *
	 * @return the modified date of this leash
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this leash.
	 *
	 * @param modifiedDate the modified date of this leash
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the material of this leash.
	 *
	 * @return the material of this leash
	 */
	@AutoEscape
	public String getMaterial();

	/**
	 * Sets the material of this leash.
	 *
	 * @param material the material of this leash
	 */
	public void setMaterial(String material);

	/**
	 * Returns the color of this leash.
	 *
	 * @return the color of this leash
	 */
	@AutoEscape
	public String getColor();

	/**
	 * Sets the color of this leash.
	 *
	 * @param color the color of this leash
	 */
	public void setColor(String color);

	/**
	 * Returns the length of this leash.
	 *
	 * @return the length of this leash
	 */
	public int getLength();

	/**
	 * Sets the length of this leash.
	 *
	 * @param length the length of this leash
	 */
	public void setLength(int length);

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
	public int compareTo(gov.nasa.hq.dogshop.model.Leash leash);

	@Override
	public int hashCode();

	@Override
	public CacheModel<gov.nasa.hq.dogshop.model.Leash> toCacheModel();

	@Override
	public gov.nasa.hq.dogshop.model.Leash toEscapedModel();

	@Override
	public gov.nasa.hq.dogshop.model.Leash toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}