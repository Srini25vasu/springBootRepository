/**
 * 
 */
package com.exactfinder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Srinivasu
 *
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.exactfinder"})
@EnableEurekaClient
public class ExactFinderApplication {
	
	public static void main(String args[]){
	
	   SpringApplication.run(ExactFinderApplication.class,args);
	
	}

}
