package com.example.hsa5hw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories("com.example.hsa5hw")
@SpringBootApplication
public class Hsa5HwApplication {

	public static void main(String[] args) {
		SpringApplication.run(Hsa5HwApplication.class, args);
	}

}
