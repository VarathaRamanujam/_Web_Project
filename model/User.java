package com.example.demo.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;


@Configuration
@ConfigurationProperties
public class User {

	Integer Employee_ID;
	String Employee_Name;
	
	public User(Integer employee_ID, String employee_Name) {
		Employee_ID = employee_ID;
		Employee_Name = employee_Name;
	}
	
	public Integer getEmployee_ID() {
		return Employee_ID;
	}
	public void setEmployee_ID(Integer employee_ID) {
		Employee_ID = employee_ID;
	}
	public String getEmployee_Name() {
		return Employee_Name;
	}
	public void setEmployee_Name(String employee_Name) {
		Employee_Name = employee_Name;
	}

	@Override
	public String toString() {
		return "User [Employee_ID=" + Employee_ID + ", Employee_Name=" + Employee_Name + "]";
	}
	
}
