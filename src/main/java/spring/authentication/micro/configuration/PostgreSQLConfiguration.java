package spring.authentication.micro.configuration;

import javax.sql.DataSource;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PostgreSQLConfiguration {
	@Bean
	public DataSource getDataSource() {
		return DataSourceBuilder.create().url("jdbc:postgresql://localhost:5432/postgres")
				.username("postgres")
				.password("")
				.driverClassName("org.postgresql.Driver").build();
	}

}
