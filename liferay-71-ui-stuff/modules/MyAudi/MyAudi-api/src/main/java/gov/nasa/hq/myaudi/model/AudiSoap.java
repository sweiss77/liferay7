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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link gov.nasa.hq.myaudi.service.http.AudiServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see gov.nasa.hq.myaudi.service.http.AudiServiceSoap
 * @generated
 */
@ProviderType
public class AudiSoap implements Serializable {
	public static AudiSoap toSoapModel(Audi model) {
		AudiSoap soapModel = new AudiSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setAudiId(model.getAudiId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setModelName(model.getModelName());
		soapModel.setExteriorColor(model.getExteriorColor());
		soapModel.setInteriorColor(model.getInteriorColor());
		soapModel.setAllWheelDrive(model.isAllWheelDrive());
		soapModel.setTechnologyPackage(model.isTechnologyPackage());
		soapModel.setColdWeatherPackage(model.isColdWeatherPackage());

		return soapModel;
	}

	public static AudiSoap[] toSoapModels(Audi[] models) {
		AudiSoap[] soapModels = new AudiSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static AudiSoap[][] toSoapModels(Audi[][] models) {
		AudiSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new AudiSoap[models.length][models[0].length];
		}
		else {
			soapModels = new AudiSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static AudiSoap[] toSoapModels(List<Audi> models) {
		List<AudiSoap> soapModels = new ArrayList<AudiSoap>(models.size());

		for (Audi model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new AudiSoap[soapModels.size()]);
	}

	public AudiSoap() {
	}

	public long getPrimaryKey() {
		return _audiId;
	}

	public void setPrimaryKey(long pk) {
		setAudiId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getAudiId() {
		return _audiId;
	}

	public void setAudiId(long audiId) {
		_audiId = audiId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public String getModelName() {
		return _modelName;
	}

	public void setModelName(String modelName) {
		_modelName = modelName;
	}

	public String getExteriorColor() {
		return _exteriorColor;
	}

	public void setExteriorColor(String exteriorColor) {
		_exteriorColor = exteriorColor;
	}

	public String getInteriorColor() {
		return _interiorColor;
	}

	public void setInteriorColor(String interiorColor) {
		_interiorColor = interiorColor;
	}

	public boolean getAllWheelDrive() {
		return _allWheelDrive;
	}

	public boolean isAllWheelDrive() {
		return _allWheelDrive;
	}

	public void setAllWheelDrive(boolean allWheelDrive) {
		_allWheelDrive = allWheelDrive;
	}

	public boolean getTechnologyPackage() {
		return _technologyPackage;
	}

	public boolean isTechnologyPackage() {
		return _technologyPackage;
	}

	public void setTechnologyPackage(boolean technologyPackage) {
		_technologyPackage = technologyPackage;
	}

	public boolean getColdWeatherPackage() {
		return _coldWeatherPackage;
	}

	public boolean isColdWeatherPackage() {
		return _coldWeatherPackage;
	}

	public void setColdWeatherPackage(boolean coldWeatherPackage) {
		_coldWeatherPackage = coldWeatherPackage;
	}

	private String _uuid;
	private long _audiId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _modelName;
	private String _exteriorColor;
	private String _interiorColor;
	private boolean _allWheelDrive;
	private boolean _technologyPackage;
	private boolean _coldWeatherPackage;
}