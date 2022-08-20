package com.hr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan("com.hr.controller")
public class HrProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrProjectApplication.class, args);
	}

}
