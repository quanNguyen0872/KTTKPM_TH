package com.se.SpringCloudServiceRegistrationEurekaClient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class SpringCloudServiceRegistrationEurekaClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudServiceRegistrationEurekaClientApplication.class, args);
	}

	@RequestMapping(value = "/")
	public String home() {
		return "Eureka Client application";
	}

}
