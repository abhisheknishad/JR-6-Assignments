package com.empmgt.ui;

import java.util.*;

import com.empmgt.entities.*;

public class EmployeeMain {
	private Map<Integer, Employee> employees= new HashMap<>();								//HashMap

	public static void main(String[] args) {
		EmployeeMain project = new EmployeeMain();
		project.run();
	}

	public Employee findEmployee(int id)  { 												// Find Employee Method
		validateId(id);
		if(employees.containsKey(id)==false) {
			throw new EmployeeNotFoundException("Employee Not Found for id "+id);
		}
		Employee employee =employees.get(id);
		return employee;
		}
	public void removeEmployeeById(int id) {
		validateId(id);
		employees.remove(id);
	}

	public void run() {
		try {
			Department empDept1 = new Department("101", "Developer");
			Department empDept2 = new Department("201", "Tester");
			addDeveloperEmployee(1, "John", empDept1, "Java");
			addDeveloperEmployee(2, "Anil", empDept1, "C++");
			addTesterEmployee(3, "Raghav", empDept2, "Selenium");
			addTesterEmployee(4, "Abhishek", empDept2, "TestingWhiz");
			int inputId = 3; 																	// Id taken from user
			Employee employee = findEmployee(inputId);											// find employee called
			if(employee instanceof Developer) {
				displayEmployeeDetails((Developer) employee);
			}
			if(employee instanceof Tester) {
				displayEmployeeDetails((Tester) employee);
			}
			removeEmployeeById(inputId);
		} catch (InvalidIdException e) {
			System.out.println("You have given wrong id");
			System.out.println(e.getMessage());
		} catch (EmployeeNotFoundException e) {
			System.out.println(e.getMessage());
		}
		displayAll();
	}

	
		public void addDeveloperEmployee(int id,String name,Department department,String language) {
			Developer developer = new Developer(id,name,department,language);
			employees.put(id, developer);
		}
		public void addTesterEmployee(int id,String name,Department department,String language) {
			Tester tester = new Tester(id,name,department,language);
			employees.put(id, tester);
		}
		public void validateId(int id) {
			if(id<0) {
				throw new InvalidIdException("Please Enter Correct Id");
			}
		}
		public void displayAll() {
			Collection<Employee>emp=employees.values();
			System.out.println("Printing Information of All Employee");
			for(Employee employ:emp) {
				if(employ instanceof Developer) {
					displayEmployeeDetails((Developer) employ);
				}
				if(employ instanceof Tester) {
					displayEmployeeDetails((Tester) employ);
				}
				
			}
		}

	

	void displayBaseEmployeeDetails(Employee employee) {
		System.out.println("ID :" + employee.getId() + "\nName :" + employee.getName() + "\nEmpDept :"
				+ employee.getDepartment().getDeptId() + "\nEmp Dept Name: " + employee.getDepartment().getDeptName());
	}

	void displayEmployeeDetails(Developer developer) {
		displayBaseEmployeeDetails(developer);
		System.out.println("Language : " + developer.getLanguage() + "\n\n");
	}

	void displayEmployeeDetails(Tester tester) {
		displayBaseEmployeeDetails(tester);
		System.out.println("Tools : " + tester.getTools() + "\n\n");
	}

	public void checkTwoCustomers(Employee employee1, Employee employee2) { 							// check two customers
		boolean isEqual = employee1.equals(employee2);
		if (isEqual) {
			System.out.println("Employee1 And Employee2 are Same as their id is " + employee1.getId());
		} else {
			System.out.println("Employee1 and Employee2 are not Equal");
		}
	}
}
