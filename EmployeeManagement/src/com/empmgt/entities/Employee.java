package com.empmgt.entities;

public class Employee {
	private int id;
	private String name;
	private Department department;
	
	public Employee(int id,String name,Department department) {
		this.id=id;
		this.name=name;
		this.department=department;
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
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	@Override
	public boolean equals(Object arg) {								//equals method overriden
		if(arg==this) {
			return true;
		}
		if(arg==null || !(arg instanceof Employee)) {
			return false;
		}
		Employee that=(Employee)arg;
		return this.id==that.id;
			
		
	}

}
