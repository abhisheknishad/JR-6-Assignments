package com.cg.apps.employeemswithoutjpa.exceptions;

public class EmployeeNotFoundException extends RuntimeException{
	public EmployeeNotFoundException(String msg){
		super(msg);
	}

}
