package com.example.learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication(scanBasePackages = "com.example.learning.*")
@EnableAutoConfiguration
//@ComponentScan(basePackages = "com.*")
public class LearnigApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(LearnigApplication.class, args);
	}

}
