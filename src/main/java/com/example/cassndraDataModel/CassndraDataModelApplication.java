package com.example.cassndraDataModel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;
@EnableCassandraRepositories(basePackages = {"com.example.repo"})
@ComponentScan({"com.example.*"})
@SpringBootApplication
public class CassndraDataModelApplication {

	public static void main(String[] args) {
		SpringApplication.run(CassndraDataModelApplication.class, args);
	}

}
