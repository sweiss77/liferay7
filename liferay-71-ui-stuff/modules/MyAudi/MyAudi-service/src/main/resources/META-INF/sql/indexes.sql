create index IX_92340F8 on NASA_Audi (exteriorColor[$COLUMN_LENGTH:75$]);
create index IX_DB9E3BC7 on NASA_Audi (modelName[$COLUMN_LENGTH:75$]);
create index IX_843EE4D1 on NASA_Audi (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_D72C6B93 on NASA_Audi (uuid_[$COLUMN_LENGTH:75$], groupId);