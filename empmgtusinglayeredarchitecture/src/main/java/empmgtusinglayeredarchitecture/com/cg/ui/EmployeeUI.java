package empmgtusinglayeredarchitecture.com.cg.ui;

import java.util.Collection;
import java.util.List;

import empmgtusinglayeredarchitecture.com.cg.enitities.Employee;
import empmgtusinglayeredarchitecture.com.cg.service.EmployeeServiceImp;
import empmgtusinglayeredarchitecture.com.cg.service.IEmployeeService;



public class EmployeeUI {
	private IEmployeeService service=new EmployeeServiceImp();
	public static void main(String [] args) {
		EmployeeUI project = new EmployeeUI();
		project.start();
	}
	void start() {
		try {
		Employee abhishek=service.addEmployee("Abhishek","Developer");
		Employee john = service.addEmployee("John", "Tester");
		Employee  raghav=service.addEmployee("Raghav", "Developer");
		Employee  peter=service.addEmployee("peter", "Developer");
		
		
		System.out.println("*****DISPLAY SINGLE EMPLOYEE*****");				//Displaying Single Employee
		display(abhishek);
		
		
		System.out.println("\n*****DISPLAY BY ID******");						//Displaying Employee By id
		Employee employeeFetched=service.findById(3);
		display(employeeFetched);
		
		int inputId=2;
		service.removeById(inputId);
		
		System.out.println("\n****DISPLAY ALL EMPLOYEE*****");					//Displaying All Employee
		List<Employee>employees=service.findAll();
		displayAll(employees);
		
		}catch(InvalidIdException e) {
			System.out.println(e.getMessage());
		}
		catch(InvalidDepartmentNameException e) {
			System.out.println(e.getMessage());
		}
		catch(InvalidEmployeeNameException e) {
			System.out.println(e.getMessage());
		}
		catch(EmployeeNotFoundException e) {
			System.out.println(e.getMessage());
		}
		catch(NameGreaterThanLength10Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}
	void displayAll(Collection<Employee>employees) {
		for(Employee emp:employees) {
			display(emp);
		}
		
	}
	void display(Employee employee) {
		System.out.println("Id:"+employee.getId()+"\nName:"+employee.getName()+"\nDepartment:"+employee.getDepartment());
	}

}
