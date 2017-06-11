package com.exactfinder.domain.impl;

public class Bus {
	int busNumber;
	String from;
	String to;
	
	public Bus(){
		
	}	
	public Bus(int busNumber,String from,String to){
		this.busNumber = busNumber;
		this.from = from;
		this.to = to;
		
	}
	public int getBusNumber() {
		return busNumber;
	}
	public void setBusNumber(int busNumber) {
		this.busNumber = busNumber;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	
}
