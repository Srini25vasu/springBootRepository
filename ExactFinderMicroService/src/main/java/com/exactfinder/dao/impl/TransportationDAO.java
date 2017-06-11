package com.exactfinder.dao.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

import com.exactfinder.dao.ITransportationDAO;
import com.exactfinder.domain.impl.Bus;
import com.exactfinder.domain.impl.Customer;
import com.exactfinder.domain.impl.Driver;

@Component
public class TransportationDAO implements ITransportationDAO{
	
	private List<Bus> buses = new ArrayList<Bus>(){
	{		
		add(new Bus(10,"Czech","Dusseldorf"));
		add(new Bus(10,"Hyderabad","Mumbai"));
		add(new Bus(10,"Czech","Herzo"));
		add(new Bus(10,"Delhi","Chennai"));
		add(new Bus(10,"Hyderabad","Bangalore"));
	}};
	
	private List<Driver> crew = new ArrayList<Driver>(){
	{		
		add(new Driver("John",13445,"Goods"));
		add(new Driver("Ricky",34556,"Lihgt weight"));
		add(new Driver("Shellock",34455,"Heavy weight"));
		add(new Driver("Osei",7889,"Passenger"));
		add(new Driver("Bob",5678,"Passenger"));
	}};
	
	private List<Customer> customers1 = new ArrayList<Customer>(){
		{		
			add(new Customer("Kakaraparti","Srinivasu",13445,"Telangana"));
			add(new Customer("Kakaraparti","Gayathri devi",13445,"Telangana"));
			add(new Customer("Kakaraparti","Mounisha",13445,"Telangana"));
			add(new Customer("Kakaraparti","Rishita",13445,"Telangana"));
			add(new Customer("Kakaraparti","Udhbav",13445,"Telangana"));
			
		}};
		
		private List<Customer> customers = new ArrayList<Customer>(){
			{		
				add(new Customer("John","wayne",13445,"Goods"));
				add(new Customer("Ricky","Moti",34556,"Lihgt weight"));
				add(new Customer("Shellock","Helmes",34455,"Heavy weight"));
				add(new Customer("Osei","wort",7889,"Passenger"));
				add(new Customer("Bob","wilson",5678,"Passenger"));
				
			}};

	@Override
	public List<Bus> getAllBuses() {
		// TODO Auto-generated method stub
		return buses;
	}

	@Override
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return customers;
	}

	@Override
	public List<Driver> getAllDrivers() {
		// TODO Auto-generated method stub
		return crew;
	}

	@Override
	public List<Bus> getBuses(List<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Bus> getDrivers(List<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateBuses(List<Bus> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateDrivers(List<Long> ids) {
		// TODO Auto-generated method stub
		
	}

}
