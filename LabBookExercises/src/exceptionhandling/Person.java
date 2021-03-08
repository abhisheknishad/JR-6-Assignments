package exceptionhandling;

import exceptionhandling.com.cg.eis.exception.EmployeeException;

public class Person {
	String firstName;
	String lastname;
	int age;
	int salary;

	public Person(String firstName,String lastName, int age,int salary) throws InvalidAgeException {
		validateAge(age);
		validateLastNameException(lastName);
		validateEmployeeSalary(salary);
		this.firstName = firstName;
		this.age=age;
		this.lastname=lastName;
		this.salary=salary;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	void validateAge(int age){
		if(age<15) {
			throw new InvalidAgeException("Age should be above 15");
		}
	}
	void validateLastNameException(String lastName) {
		if(lastName.isEmpty()||lastName==null||lastName.trim().isEmpty()) {
			throw new InvalidPersonLastNameException("Last name can't be null");
		}
	}
	void validateEmployeeSalary(int salary) {
		if(salary<3000) {
			throw new EmployeeException("salary should be greater than 3000");
		}
	}

}
