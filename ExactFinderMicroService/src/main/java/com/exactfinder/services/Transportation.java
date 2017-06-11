package com.exactfinder.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.exactfinder.dao.impl.TransportationDAO;
import com.exactfinder.domain.impl.Bus;
import com.exactfinder.domain.impl.Driver;

@Service
public class Transportation {

	@Autowired
	TransportationDAO transportationDAO;
	
	public List getAllBuses(){
		return transportationDAO.getAllBuses();
	}
	public List getAllDrivers(){
		return transportationDAO.getAllDrivers();
	}
	public List getAllCustomers(){
		return transportationDAO.getAllCustomers();
	}
	
}
