package com.goutham.springdata.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.goutham.springdata.jpa.repository")
@EntityScan(basePackages = "com.goutham.springdata.jpa.Entity")
public class SpringdataJpaApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringdataJpaApplication.class, args);
	}

}
