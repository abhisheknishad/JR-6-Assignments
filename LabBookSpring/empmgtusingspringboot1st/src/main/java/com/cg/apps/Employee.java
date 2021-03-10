package com.cg.apps;

import java.util.Objects;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Employee {
	@Value("${emp.id}")
	private int id;
	@Value("${emp.name}")
	private String name;
	@Value("${emp.salary}")
	private int salary;
	@Value("${emp.bu}")
	private String businessUnit;
	@Value("${emp.age}")
	private int age;
	
	public Employee() {}
	public Employee(String name,int salary,String businessUnit,int age) {
		this.name=name;
		this.salary=salary;
		this.businessUnit=businessUnit;
		this.age=age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getBusinessUnit() {
		return businessUnit;
	}
	public void setBusinessUnit(String businessUnit) {
		this.businessUnit = businessUnit;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public int hashCode() {
		return id;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		return true;
	}

}
