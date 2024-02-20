package com.linkedin.employees;

public class EmployeesExceptionHandler extends Exception {
	String message;
	
	public EmployeesExceptionHandler(String errMessage){
		message = errMessage;
	}
	
	public String getMessage() {
		return message;
	}
}
