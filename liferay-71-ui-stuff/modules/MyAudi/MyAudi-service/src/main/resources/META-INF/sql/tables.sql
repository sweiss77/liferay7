create table NASA_Audi (
	uuid_ VARCHAR(75) null,
	audiId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	modelName VARCHAR(75) null,
	exteriorColor VARCHAR(75) null,
	interiorColor VARCHAR(75) null,
	allWheelDrive BOOLEAN,
	technologyPackage BOOLEAN,
	coldWeatherPackage BOOLEAN
);

create table myaudi_Audi (
	uuid_ VARCHAR(75) null,
	audiId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	modelName VARCHAR(75) null,
	exteriorColor VARCHAR(75) null,
	interiorColor VARCHAR(75) null,
	allWheelDrive BOOLEAN,
	technologyPackage BOOLEAN,
	coldWeatherPackage BOOLEAN
);