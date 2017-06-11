package com.exactfinder;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.exactfinder.domain.impl.Bus;
import com.exactfinder.domain.impl.CrewManager;
import com.exactfinder.domain.impl.Customer;
import com.exactfinder.domain.impl.Driver;
import com.exactfinder.services.Transportation;

@Configuration
public class ExactFinderConfiguration {
	
	@Bean
	public Bus bus(){
		
		return new Bus();
	}
	@Bean
	public CrewManager crewManager(){
		
		return new CrewManager();
	}
	@Bean
	public Customer customer(){
		
		return new Customer();
	}
	@Bean
	public Driver Driver(){
		
		return new Driver();
	}
	@Bean
	public Transportation transportation(){
		
		return new Transportation();
	}
	
	
}
