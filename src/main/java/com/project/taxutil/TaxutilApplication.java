package com.project.taxutil;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
public class TaxutilApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaxutilApplication.class, args);
	}

}
