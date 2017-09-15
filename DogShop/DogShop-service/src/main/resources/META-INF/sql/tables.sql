create table nasa_Leash (
	uuid_ VARCHAR(75) null,
	leashId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	material VARCHAR(75) null,
	color VARCHAR(75) null,
	length INTEGER
);