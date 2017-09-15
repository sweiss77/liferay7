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

import com.liferay.exportimport.kernel.lar.StagedModelType;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link Leash}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Leash
 * @generated
 */
@ProviderType
public class LeashWrapper implements Leash, ModelWrapper<Leash> {
	public LeashWrapper(Leash leash) {
		_leash = leash;
	}

	@Override
	public Class<?> getModelClass() {
		return Leash.class;
	}

	@Override
	public String getModelClassName() {
		return Leash.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("leashId", getLeashId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("material", getMaterial());
		attributes.put("color", getColor());
		attributes.put("length", getLength());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long leashId = (Long)attributes.get("leashId");

		if (leashId != null) {
			setLeashId(leashId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String material = (String)attributes.get("material");

		if (material != null) {
			setMaterial(material);
		}

		String color = (String)attributes.get("color");

		if (color != null) {
			setColor(color);
		}

		Integer length = (Integer)attributes.get("length");

		if (length != null) {
			setLength(length);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _leash.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _leash.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _leash.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _leash.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<gov.nasa.hq.dogshop.model.Leash> toCacheModel() {
		return _leash.toCacheModel();
	}

	@Override
	public gov.nasa.hq.dogshop.model.Leash toEscapedModel() {
		return new LeashWrapper(_leash.toEscapedModel());
	}

	@Override
	public gov.nasa.hq.dogshop.model.Leash toUnescapedModel() {
		return new LeashWrapper(_leash.toUnescapedModel());
	}

	@Override
	public int compareTo(gov.nasa.hq.dogshop.model.Leash leash) {
		return _leash.compareTo(leash);
	}

	/**
	* Returns the length of this leash.
	*
	* @return the length of this leash
	*/
	@Override
	public int getLength() {
		return _leash.getLength();
	}

	@Override
	public int hashCode() {
		return _leash.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _leash.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new LeashWrapper((Leash)_leash.clone());
	}

	/**
	* Returns the color of this leash.
	*
	* @return the color of this leash
	*/
	@Override
	public java.lang.String getColor() {
		return _leash.getColor();
	}

	/**
	* Returns the material of this leash.
	*
	* @return the material of this leash
	*/
	@Override
	public java.lang.String getMaterial() {
		return _leash.getMaterial();
	}

	/**
	* Returns the user name of this leash.
	*
	* @return the user name of this leash
	*/
	@Override
	public java.lang.String getUserName() {
		return _leash.getUserName();
	}

	/**
	* Returns the user uuid of this leash.
	*
	* @return the user uuid of this leash
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _leash.getUserUuid();
	}

	/**
	* Returns the uuid of this leash.
	*
	* @return the uuid of this leash
	*/
	@Override
	public java.lang.String getUuid() {
		return _leash.getUuid();
	}

	@Override
	public java.lang.String toString() {
		return _leash.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _leash.toXmlString();
	}

	/**
	* Returns the create date of this leash.
	*
	* @return the create date of this leash
	*/
	@Override
	public Date getCreateDate() {
		return _leash.getCreateDate();
	}

	/**
	* Returns the modified date of this leash.
	*
	* @return the modified date of this leash
	*/
	@Override
	public Date getModifiedDate() {
		return _leash.getModifiedDate();
	}

	/**
	* Returns the company ID of this leash.
	*
	* @return the company ID of this leash
	*/
	@Override
	public long getCompanyId() {
		return _leash.getCompanyId();
	}

	/**
	* Returns the group ID of this leash.
	*
	* @return the group ID of this leash
	*/
	@Override
	public long getGroupId() {
		return _leash.getGroupId();
	}

	/**
	* Returns the leash ID of this leash.
	*
	* @return the leash ID of this leash
	*/
	@Override
	public long getLeashId() {
		return _leash.getLeashId();
	}

	/**
	* Returns the primary key of this leash.
	*
	* @return the primary key of this leash
	*/
	@Override
	public long getPrimaryKey() {
		return _leash.getPrimaryKey();
	}

	/**
	* Returns the user ID of this leash.
	*
	* @return the user ID of this leash
	*/
	@Override
	public long getUserId() {
		return _leash.getUserId();
	}

	@Override
	public void persist() {
		_leash.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_leash.setCachedModel(cachedModel);
	}

	/**
	* Sets the color of this leash.
	*
	* @param color the color of this leash
	*/
	@Override
	public void setColor(java.lang.String color) {
		_leash.setColor(color);
	}

	/**
	* Sets the company ID of this leash.
	*
	* @param companyId the company ID of this leash
	*/
	@Override
	public void setCompanyId(long companyId) {
		_leash.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this leash.
	*
	* @param createDate the create date of this leash
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_leash.setCreateDate(createDate);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_leash.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_leash.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_leash.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the group ID of this leash.
	*
	* @param groupId the group ID of this leash
	*/
	@Override
	public void setGroupId(long groupId) {
		_leash.setGroupId(groupId);
	}

	/**
	* Sets the leash ID of this leash.
	*
	* @param leashId the leash ID of this leash
	*/
	@Override
	public void setLeashId(long leashId) {
		_leash.setLeashId(leashId);
	}

	/**
	* Sets the length of this leash.
	*
	* @param length the length of this leash
	*/
	@Override
	public void setLength(int length) {
		_leash.setLength(length);
	}

	/**
	* Sets the material of this leash.
	*
	* @param material the material of this leash
	*/
	@Override
	public void setMaterial(java.lang.String material) {
		_leash.setMaterial(material);
	}

	/**
	* Sets the modified date of this leash.
	*
	* @param modifiedDate the modified date of this leash
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_leash.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_leash.setNew(n);
	}

	/**
	* Sets the primary key of this leash.
	*
	* @param primaryKey the primary key of this leash
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_leash.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_leash.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the user ID of this leash.
	*
	* @param userId the user ID of this leash
	*/
	@Override
	public void setUserId(long userId) {
		_leash.setUserId(userId);
	}

	/**
	* Sets the user name of this leash.
	*
	* @param userName the user name of this leash
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_leash.setUserName(userName);
	}

	/**
	* Sets the user uuid of this leash.
	*
	* @param userUuid the user uuid of this leash
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_leash.setUserUuid(userUuid);
	}

	/**
	* Sets the uuid of this leash.
	*
	* @param uuid the uuid of this leash
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_leash.setUuid(uuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof LeashWrapper)) {
			return false;
		}

		LeashWrapper leashWrapper = (LeashWrapper)obj;

		if (Objects.equals(_leash, leashWrapper._leash)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _leash.getStagedModelType();
	}

	@Override
	public Leash getWrappedModel() {
		return _leash;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _leash.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _leash.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_leash.resetOriginalValues();
	}

	private final Leash _leash;
}