package exceptionhandling;

import exceptionhandling.com.cg.eis.exception.EmployeeException;

public class PersonMain {

	public static void main(String[] args)  {
		PersonMain app = new PersonMain();
		app.start();

	}
	void start() {
		try {
			Person person1 = new Person("Anil","Kumar",23,45000);
			display(person1);
			Person person2= new Person("Vishal"," Singh",16,4000);
			display(person2);
			
		}catch(InvalidAgeException e) {
			System.out.println(e.getMessage());
		}
		catch(InvalidPersonLastNameException e) {
			System.out.println(e.getMessage());
		}
		catch(EmployeeException e) {
			System.out.println(e.getMessage());
		}
		
	}
	void display(Person person) {
		System.out.println("PersonName:"+person.firstName+" PersonLastName:"+person.lastname+" Person Age:"+person.age+" Salary :"+person.salary);
	}

}
