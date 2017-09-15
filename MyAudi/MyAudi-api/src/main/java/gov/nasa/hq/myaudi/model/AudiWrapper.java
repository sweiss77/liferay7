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

package gov.nasa.hq.myaudi.model;

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
 * This class is a wrapper for {@link Audi}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Audi
 * @generated
 */
@ProviderType
public class AudiWrapper implements Audi, ModelWrapper<Audi> {
	public AudiWrapper(Audi audi) {
		_audi = audi;
	}

	@Override
	public Class<?> getModelClass() {
		return Audi.class;
	}

	@Override
	public String getModelClassName() {
		return Audi.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("audiId", getAudiId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("modelName", getModelName());
		attributes.put("exteriorColor", getExteriorColor());
		attributes.put("interiorColor", getInteriorColor());
		attributes.put("allWheelDrive", getAllWheelDrive());
		attributes.put("technologyPackage", getTechnologyPackage());
		attributes.put("coldWeatherPackage", getColdWeatherPackage());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long audiId = (Long)attributes.get("audiId");

		if (audiId != null) {
			setAudiId(audiId);
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

		String modelName = (String)attributes.get("modelName");

		if (modelName != null) {
			setModelName(modelName);
		}

		String exteriorColor = (String)attributes.get("exteriorColor");

		if (exteriorColor != null) {
			setExteriorColor(exteriorColor);
		}

		String interiorColor = (String)attributes.get("interiorColor");

		if (interiorColor != null) {
			setInteriorColor(interiorColor);
		}

		Boolean allWheelDrive = (Boolean)attributes.get("allWheelDrive");

		if (allWheelDrive != null) {
			setAllWheelDrive(allWheelDrive);
		}

		Boolean technologyPackage = (Boolean)attributes.get("technologyPackage");

		if (technologyPackage != null) {
			setTechnologyPackage(technologyPackage);
		}

		Boolean coldWeatherPackage = (Boolean)attributes.get(
				"coldWeatherPackage");

		if (coldWeatherPackage != null) {
			setColdWeatherPackage(coldWeatherPackage);
		}
	}

	/**
	* Returns the all wheel drive of this audi.
	*
	* @return the all wheel drive of this audi
	*/
	@Override
	public boolean getAllWheelDrive() {
		return _audi.getAllWheelDrive();
	}

	/**
	* Returns the cold weather package of this audi.
	*
	* @return the cold weather package of this audi
	*/
	@Override
	public boolean getColdWeatherPackage() {
		return _audi.getColdWeatherPackage();
	}

	/**
	* Returns the technology package of this audi.
	*
	* @return the technology package of this audi
	*/
	@Override
	public boolean getTechnologyPackage() {
		return _audi.getTechnologyPackage();
	}

	/**
	* Returns <code>true</code> if this audi is all wheel drive.
	*
	* @return <code>true</code> if this audi is all wheel drive; <code>false</code> otherwise
	*/
	@Override
	public boolean isAllWheelDrive() {
		return _audi.isAllWheelDrive();
	}

	@Override
	public boolean isCachedModel() {
		return _audi.isCachedModel();
	}

	/**
	* Returns <code>true</code> if this audi is cold weather package.
	*
	* @return <code>true</code> if this audi is cold weather package; <code>false</code> otherwise
	*/
	@Override
	public boolean isColdWeatherPackage() {
		return _audi.isColdWeatherPackage();
	}

	@Override
	public boolean isEscapedModel() {
		return _audi.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _audi.isNew();
	}

	/**
	* Returns <code>true</code> if this audi is technology package.
	*
	* @return <code>true</code> if this audi is technology package; <code>false</code> otherwise
	*/
	@Override
	public boolean isTechnologyPackage() {
		return _audi.isTechnologyPackage();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _audi.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<gov.nasa.hq.myaudi.model.Audi> toCacheModel() {
		return _audi.toCacheModel();
	}

	@Override
	public gov.nasa.hq.myaudi.model.Audi toEscapedModel() {
		return new AudiWrapper(_audi.toEscapedModel());
	}

	@Override
	public gov.nasa.hq.myaudi.model.Audi toUnescapedModel() {
		return new AudiWrapper(_audi.toUnescapedModel());
	}

	@Override
	public int compareTo(gov.nasa.hq.myaudi.model.Audi audi) {
		return _audi.compareTo(audi);
	}

	@Override
	public int hashCode() {
		return _audi.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _audi.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new AudiWrapper((Audi)_audi.clone());
	}

	/**
	* Returns the exterior color of this audi.
	*
	* @return the exterior color of this audi
	*/
	@Override
	public java.lang.String getExteriorColor() {
		return _audi.getExteriorColor();
	}

	/**
	* Returns the interior color of this audi.
	*
	* @return the interior color of this audi
	*/
	@Override
	public java.lang.String getInteriorColor() {
		return _audi.getInteriorColor();
	}

	/**
	* Returns the model name of this audi.
	*
	* @return the model name of this audi
	*/
	@Override
	public java.lang.String getModelName() {
		return _audi.getModelName();
	}

	/**
	* Returns the user name of this audi.
	*
	* @return the user name of this audi
	*/
	@Override
	public java.lang.String getUserName() {
		return _audi.getUserName();
	}

	/**
	* Returns the user uuid of this audi.
	*
	* @return the user uuid of this audi
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _audi.getUserUuid();
	}

	/**
	* Returns the uuid of this audi.
	*
	* @return the uuid of this audi
	*/
	@Override
	public java.lang.String getUuid() {
		return _audi.getUuid();
	}

	@Override
	public java.lang.String toString() {
		return _audi.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _audi.toXmlString();
	}

	/**
	* Returns the create date of this audi.
	*
	* @return the create date of this audi
	*/
	@Override
	public Date getCreateDate() {
		return _audi.getCreateDate();
	}

	/**
	* Returns the modified date of this audi.
	*
	* @return the modified date of this audi
	*/
	@Override
	public Date getModifiedDate() {
		return _audi.getModifiedDate();
	}

	/**
	* Returns the audi ID of this audi.
	*
	* @return the audi ID of this audi
	*/
	@Override
	public long getAudiId() {
		return _audi.getAudiId();
	}

	/**
	* Returns the company ID of this audi.
	*
	* @return the company ID of this audi
	*/
	@Override
	public long getCompanyId() {
		return _audi.getCompanyId();
	}

	/**
	* Returns the group ID of this audi.
	*
	* @return the group ID of this audi
	*/
	@Override
	public long getGroupId() {
		return _audi.getGroupId();
	}

	/**
	* Returns the primary key of this audi.
	*
	* @return the primary key of this audi
	*/
	@Override
	public long getPrimaryKey() {
		return _audi.getPrimaryKey();
	}

	/**
	* Returns the user ID of this audi.
	*
	* @return the user ID of this audi
	*/
	@Override
	public long getUserId() {
		return _audi.getUserId();
	}

	@Override
	public void persist() {
		_audi.persist();
	}

	/**
	* Sets whether this audi is all wheel drive.
	*
	* @param allWheelDrive the all wheel drive of this audi
	*/
	@Override
	public void setAllWheelDrive(boolean allWheelDrive) {
		_audi.setAllWheelDrive(allWheelDrive);
	}

	/**
	* Sets the audi ID of this audi.
	*
	* @param audiId the audi ID of this audi
	*/
	@Override
	public void setAudiId(long audiId) {
		_audi.setAudiId(audiId);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_audi.setCachedModel(cachedModel);
	}

	/**
	* Sets whether this audi is cold weather package.
	*
	* @param coldWeatherPackage the cold weather package of this audi
	*/
	@Override
	public void setColdWeatherPackage(boolean coldWeatherPackage) {
		_audi.setColdWeatherPackage(coldWeatherPackage);
	}

	/**
	* Sets the company ID of this audi.
	*
	* @param companyId the company ID of this audi
	*/
	@Override
	public void setCompanyId(long companyId) {
		_audi.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this audi.
	*
	* @param createDate the create date of this audi
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_audi.setCreateDate(createDate);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_audi.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_audi.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_audi.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the exterior color of this audi.
	*
	* @param exteriorColor the exterior color of this audi
	*/
	@Override
	public void setExteriorColor(java.lang.String exteriorColor) {
		_audi.setExteriorColor(exteriorColor);
	}

	/**
	* Sets the group ID of this audi.
	*
	* @param groupId the group ID of this audi
	*/
	@Override
	public void setGroupId(long groupId) {
		_audi.setGroupId(groupId);
	}

	/**
	* Sets the interior color of this audi.
	*
	* @param interiorColor the interior color of this audi
	*/
	@Override
	public void setInteriorColor(java.lang.String interiorColor) {
		_audi.setInteriorColor(interiorColor);
	}

	/**
	* Sets the model name of this audi.
	*
	* @param modelName the model name of this audi
	*/
	@Override
	public void setModelName(java.lang.String modelName) {
		_audi.setModelName(modelName);
	}

	/**
	* Sets the modified date of this audi.
	*
	* @param modifiedDate the modified date of this audi
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_audi.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_audi.setNew(n);
	}

	/**
	* Sets the primary key of this audi.
	*
	* @param primaryKey the primary key of this audi
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_audi.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_audi.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets whether this audi is technology package.
	*
	* @param technologyPackage the technology package of this audi
	*/
	@Override
	public void setTechnologyPackage(boolean technologyPackage) {
		_audi.setTechnologyPackage(technologyPackage);
	}

	/**
	* Sets the user ID of this audi.
	*
	* @param userId the user ID of this audi
	*/
	@Override
	public void setUserId(long userId) {
		_audi.setUserId(userId);
	}

	/**
	* Sets the user name of this audi.
	*
	* @param userName the user name of this audi
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_audi.setUserName(userName);
	}

	/**
	* Sets the user uuid of this audi.
	*
	* @param userUuid the user uuid of this audi
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_audi.setUserUuid(userUuid);
	}

	/**
	* Sets the uuid of this audi.
	*
	* @param uuid the uuid of this audi
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_audi.setUuid(uuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof AudiWrapper)) {
			return false;
		}

		AudiWrapper audiWrapper = (AudiWrapper)obj;

		if (Objects.equals(_audi, audiWrapper._audi)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _audi.getStagedModelType();
	}

	@Override
	public Audi getWrappedModel() {
		return _audi;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _audi.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _audi.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_audi.resetOriginalValues();
	}

	private final Audi _audi;
}