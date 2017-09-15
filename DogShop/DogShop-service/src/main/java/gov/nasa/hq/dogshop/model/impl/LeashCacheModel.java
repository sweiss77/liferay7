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

package gov.nasa.hq.dogshop.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import gov.nasa.hq.dogshop.model.Leash;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Leash in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Leash
 * @generated
 */
@ProviderType
public class LeashCacheModel implements CacheModel<Leash>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof LeashCacheModel)) {
			return false;
		}

		LeashCacheModel leashCacheModel = (LeashCacheModel)obj;

		if (leashId == leashCacheModel.leashId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, leashId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", leashId=");
		sb.append(leashId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", material=");
		sb.append(material);
		sb.append(", color=");
		sb.append(color);
		sb.append(", length=");
		sb.append(length);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Leash toEntityModel() {
		LeashImpl leashImpl = new LeashImpl();

		if (uuid == null) {
			leashImpl.setUuid(StringPool.BLANK);
		}
		else {
			leashImpl.setUuid(uuid);
		}

		leashImpl.setLeashId(leashId);
		leashImpl.setGroupId(groupId);
		leashImpl.setCompanyId(companyId);
		leashImpl.setUserId(userId);

		if (userName == null) {
			leashImpl.setUserName(StringPool.BLANK);
		}
		else {
			leashImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			leashImpl.setCreateDate(null);
		}
		else {
			leashImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			leashImpl.setModifiedDate(null);
		}
		else {
			leashImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (material == null) {
			leashImpl.setMaterial(StringPool.BLANK);
		}
		else {
			leashImpl.setMaterial(material);
		}

		if (color == null) {
			leashImpl.setColor(StringPool.BLANK);
		}
		else {
			leashImpl.setColor(color);
		}

		leashImpl.setLength(length);

		leashImpl.resetOriginalValues();

		return leashImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		leashId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		material = objectInput.readUTF();
		color = objectInput.readUTF();

		length = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(leashId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (material == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(material);
		}

		if (color == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(color);
		}

		objectOutput.writeInt(length);
	}

	public String uuid;
	public long leashId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String material;
	public String color;
	public int length;
}