package com.exactfinder.microservice.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.discovery.EurekaClient;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class ExactFinderMicroServiceApplication implements GreetingController{

	@Autowired
    @Lazy
    private EurekaClient eurekaClient;

    @Value("${spring.application.name}")
    private String appName;
    
	public static void main(String[] args) {
		SpringApplication.run(ExactFinderMicroServiceApplication.class, args);
	}

	@Override
	public String greeting() {
		// TODO Auto-generated method stub
		return String.format("Hello from '%s'!", eurekaClient.getApplication(appName).getName());
	}
}
