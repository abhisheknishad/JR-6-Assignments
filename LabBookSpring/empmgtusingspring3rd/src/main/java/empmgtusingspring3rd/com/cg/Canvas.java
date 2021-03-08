package empmgtusingspring3rd.com.cg;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Canvas {
	@Autowired
	EmployeeService emps;
	
	Employee employee;
	SBU sbu;
	
	@Autowired
	public SBU getSbu() {
		return sbu;
	}


	@Autowired
	public void setEmployee(Employee employee) {
		this.employee=employee;
	}
	
	public Employee getEmployee() {
		return employee;
	}
	public void printEmployees(List<Employee>list) {
		for(Employee e:list) {
			display(e);
		}
	}
	
	void display(Employee employee) {
		System.out.println("Id:"+employee.getId()+"\nName:"+employee.getName()+"\nSalary:"+employee.getSalary()+
				"\nAge:"+employee.getAge());
		System.out.println("\nSbu Class Name:"+employee.getBusinessUnit().getClass()+"\nSbu Id:"+employee.getBusinessUnit().getSbuId()+
				"\nSbu Name:"+employee.getBusinessUnit().getSbuName()+"\nSbu Head"+employee.getBusinessUnit().getSbuHead());
	}

}
