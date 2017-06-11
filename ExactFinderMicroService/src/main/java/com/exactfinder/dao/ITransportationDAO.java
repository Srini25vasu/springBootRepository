package com.exactfinder.dao;
import java.util.List;

import com.exactfinder.domain.impl.Bus;
import com.exactfinder.domain.impl.Driver;
import com.exactfinder.domain.impl.Customer;

public interface ITransportationDAO {
	
	public List<Bus> getAllBuses();
	public List<Customer> getAllCustomers();
	public List<Driver> getAllDrivers();	
	public List<Bus> getBuses(List<Long> ids);	
	public List<Bus> getDrivers(List<Long> ids);
	public void updateBuses(List<Bus> ids);
	public void updateDrivers(List<Long> ids);

}
