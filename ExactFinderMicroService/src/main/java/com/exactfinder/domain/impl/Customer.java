package com.exactfinder.domain.impl;
import com.exactfinder.domain.State;
import com.exactfinder.domain.User;

public class Customer {
	
	String firstName;
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getOrderCount() {
		return orderCount;
	}

	public void setOrderCount(int orderCount) {
		this.orderCount = orderCount;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	String lastName;
	int orderCount;
    State state;
	
	public Customer(){
		
	}
	
	public Customer(String firstName,String lastName,int orderCount,String stateName){
		state = new State();
		this.firstName = firstName;
		this.lastName = lastName;
		this.orderCount = orderCount;
		state.setName(stateName);
		
	}

}
