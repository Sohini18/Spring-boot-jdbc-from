package com.cognizant.hope;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages="com.cognizant")
public class HopeApplication {

	public static void main(String[] args) {
		SpringApplication.run(HopeApplication.class, args);
	}

}
