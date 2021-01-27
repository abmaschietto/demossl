package com.example.demoewerton;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class DemoewertonApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoewertonApplication.class, args);
	}

}
