package com.cg.apps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Canvas {
	
	Employee employee;
	
	@Autowired
	public void setEmployee(Employee employee) {
		this.employee=employee;
	}
	
	public Employee getEmployee() {
		return employee;
	}
	
	void display(Employee employee) {
		System.out.println("Id:"+employee.getId()+"\nName:"+employee.getName()+"\nSalary:"+employee.getSalary()+"\nBusinessUnit:"+employee.getBusinessUnit()+
				"\nAge:"+employee.getAge());
	}

}
