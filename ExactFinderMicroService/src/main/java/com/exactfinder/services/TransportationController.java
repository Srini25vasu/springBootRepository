package com.exactfinder.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransportationController {	
	
	Transportation transportationManager;	
	
	@Autowired
	public void setTransportationManager(Transportation transportationManager) {
		this.transportationManager = transportationManager;
	}

	@GetMapping("/buses")
	public List getBuses(){		 
		return transportationManager.getAllBuses();		
	}
	@GetMapping("/crew")
	public List getCrew(){		 
		return transportationManager.getAllDrivers();		
	}
	@GetMapping("/customersSummary")
	public List getCustomers(){		 
		return transportationManager.getAllCustomers();		
	}
	
}
