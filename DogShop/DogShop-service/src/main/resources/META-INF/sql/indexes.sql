create index IX_163E09EE on nasa_Leash (color[$COLUMN_LENGTH:75$]);
create index IX_EC181279 on nasa_Leash (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_E344E33B on nasa_Leash (uuid_[$COLUMN_LENGTH:75$], groupId);