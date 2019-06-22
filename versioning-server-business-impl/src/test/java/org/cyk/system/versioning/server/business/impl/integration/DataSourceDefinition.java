package org.cyk.system.versioning.server.business.impl.integration;

@javax.annotation.sql.DataSourceDefinition(
		name="java:/versioning/server/dataSource",
		className="org.h2.jdbcx.JdbcDataSource",
		url="jdbc:h2:mem:test;DB_CLOSE_DELAY=-1;DB_CLOSE_ON_EXIT=FALSE",
		user="sa",
		password="sa"
)
public class DataSourceDefinition {}
