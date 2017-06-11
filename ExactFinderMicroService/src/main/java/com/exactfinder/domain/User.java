package com.exactfinder.domain;

public abstract class User {
	
	String usrName;
	long usrId;
	String dept;
	
	public User(){
		
	}
	public User(String usrName,long usrId,String dept){
		this.usrName = usrName;
		this.usrId = usrId;
		this.dept = dept;		
	}
	
	public String getUsrName() {
		return usrName;
	}
	public void setUsrName(String usrName) {
		this.usrName = usrName;
	}
	public long getUsrId() {
		return usrId;
	}
	public void setUsrId(long usrId) {
		this.usrId = usrId;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	
	

}
