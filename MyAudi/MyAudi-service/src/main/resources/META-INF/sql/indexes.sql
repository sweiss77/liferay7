create index IX_FA3F8E1C on myaudi_Audi (exteriorColor[$COLUMN_LENGTH:75$]);
create index IX_D0B3D52D on myaudi_Audi (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_999C2EF on myaudi_Audi (uuid_[$COLUMN_LENGTH:75$], groupId);