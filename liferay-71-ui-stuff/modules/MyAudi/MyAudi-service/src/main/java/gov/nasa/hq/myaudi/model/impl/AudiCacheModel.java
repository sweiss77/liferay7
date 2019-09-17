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

package gov.nasa.hq.myaudi.model.impl;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Date;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;

import aQute.bnd.annotation.ProviderType;
import gov.nasa.hq.myaudi.model.Audi;

/**
 * The cache model class for representing Audi in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Audi
 * @generated
 */
@ProviderType
public class AudiCacheModel implements CacheModel<Audi>, Externalizable {
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof AudiCacheModel)) {
            return false;
        }

        AudiCacheModel audiCacheModel = (AudiCacheModel) obj;

        if (audiId == audiCacheModel.audiId) {
            return true;
        }

        return false;
    }

    @Override
    public int hashCode() {
        return HashUtil.hash(0, audiId);
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(29);

        sb.append("{uuid=");
        sb.append(uuid);
        sb.append(", audiId=");
        sb.append(audiId);
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
        sb.append(", modelName=");
        sb.append(modelName);
        sb.append(", exteriorColor=");
        sb.append(exteriorColor);
        sb.append(", interiorColor=");
        sb.append(interiorColor);
        sb.append(", allWheelDrive=");
        sb.append(allWheelDrive);
        sb.append(", technologyPackage=");
        sb.append(technologyPackage);
        sb.append(", coldWeatherPackage=");
        sb.append(coldWeatherPackage);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Audi toEntityModel() {
        AudiImpl audiImpl = new AudiImpl();

        if (uuid == null) {
            audiImpl.setUuid("");
        } else {
            audiImpl.setUuid(uuid);
        }

        audiImpl.setAudiId(audiId);
        audiImpl.setGroupId(groupId);
        audiImpl.setCompanyId(companyId);
        audiImpl.setUserId(userId);

        if (userName == null) {
            audiImpl.setUserName("");
        } else {
            audiImpl.setUserName(userName);
        }

        if (createDate == Long.MIN_VALUE) {
            audiImpl.setCreateDate(null);
        } else {
            audiImpl.setCreateDate(new Date(createDate));
        }

        if (modifiedDate == Long.MIN_VALUE) {
            audiImpl.setModifiedDate(null);
        } else {
            audiImpl.setModifiedDate(new Date(modifiedDate));
        }

        if (modelName == null) {
            audiImpl.setModelName("");
        } else {
            audiImpl.setModelName(modelName);
        }

        if (exteriorColor == null) {
            audiImpl.setExteriorColor("");
        } else {
            audiImpl.setExteriorColor(exteriorColor);
        }

        if (interiorColor == null) {
            audiImpl.setInteriorColor("");
        } else {
            audiImpl.setInteriorColor(interiorColor);
        }

        audiImpl.setAllWheelDrive(allWheelDrive);
        audiImpl.setTechnologyPackage(technologyPackage);
        audiImpl.setColdWeatherPackage(coldWeatherPackage);

        audiImpl.resetOriginalValues();

        return audiImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        uuid = objectInput.readUTF();

        audiId = objectInput.readLong();

        groupId = objectInput.readLong();

        companyId = objectInput.readLong();

        userId = objectInput.readLong();
        userName = objectInput.readUTF();
        createDate = objectInput.readLong();
        modifiedDate = objectInput.readLong();
        modelName = objectInput.readUTF();
        exteriorColor = objectInput.readUTF();
        interiorColor = objectInput.readUTF();

        allWheelDrive = objectInput.readBoolean();

        technologyPackage = objectInput.readBoolean();

        coldWeatherPackage = objectInput.readBoolean();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        if (uuid == null) {
            objectOutput.writeUTF("");
        } else {
            objectOutput.writeUTF(uuid);
        }

        objectOutput.writeLong(audiId);

        objectOutput.writeLong(groupId);

        objectOutput.writeLong(companyId);

        objectOutput.writeLong(userId);

        if (userName == null) {
            objectOutput.writeUTF("");
        } else {
            objectOutput.writeUTF(userName);
        }

        objectOutput.writeLong(createDate);
        objectOutput.writeLong(modifiedDate);

        if (modelName == null) {
            objectOutput.writeUTF("");
        } else {
            objectOutput.writeUTF(modelName);
        }

        if (exteriorColor == null) {
            objectOutput.writeUTF("");
        } else {
            objectOutput.writeUTF(exteriorColor);
        }

        if (interiorColor == null) {
            objectOutput.writeUTF("");
        } else {
            objectOutput.writeUTF(interiorColor);
        }

        objectOutput.writeBoolean(allWheelDrive);

        objectOutput.writeBoolean(technologyPackage);

        objectOutput.writeBoolean(coldWeatherPackage);
    }

    public String uuid;
    public long audiId;
    public long groupId;
    public long companyId;
    public long userId;
    public String userName;
    public long createDate;
    public long modifiedDate;
    public String modelName;
    public String exteriorColor;
    public String interiorColor;
    public boolean allWheelDrive;
    public boolean technologyPackage;
    public boolean coldWeatherPackage;
}
