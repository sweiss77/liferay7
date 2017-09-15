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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link gov.nasa.hq.dogshop.service.http.LeashServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see gov.nasa.hq.dogshop.service.http.LeashServiceSoap
 * @generated
 */
@ProviderType
public class LeashSoap implements Serializable {
	public static LeashSoap toSoapModel(Leash model) {
		LeashSoap soapModel = new LeashSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setLeashId(model.getLeashId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setMaterial(model.getMaterial());
		soapModel.setColor(model.getColor());
		soapModel.setLength(model.getLength());

		return soapModel;
	}

	public static LeashSoap[] toSoapModels(Leash[] models) {
		LeashSoap[] soapModels = new LeashSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static LeashSoap[][] toSoapModels(Leash[][] models) {
		LeashSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new LeashSoap[models.length][models[0].length];
		}
		else {
			soapModels = new LeashSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static LeashSoap[] toSoapModels(List<Leash> models) {
		List<LeashSoap> soapModels = new ArrayList<LeashSoap>(models.size());

		for (Leash model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new LeashSoap[soapModels.size()]);
	}

	public LeashSoap() {
	}

	public long getPrimaryKey() {
		return _leashId;
	}

	public void setPrimaryKey(long pk) {
		setLeashId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getLeashId() {
		return _leashId;
	}

	public void setLeashId(long leashId) {
		_leashId = leashId;
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

	public String getMaterial() {
		return _material;
	}

	public void setMaterial(String material) {
		_material = material;
	}

	public String getColor() {
		return _color;
	}

	public void setColor(String color) {
		_color = color;
	}

	public int getLength() {
		return _length;
	}

	public void setLength(int length) {
		_length = length;
	}

	private String _uuid;
	private long _leashId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _material;
	private String _color;
	private int _length;
}