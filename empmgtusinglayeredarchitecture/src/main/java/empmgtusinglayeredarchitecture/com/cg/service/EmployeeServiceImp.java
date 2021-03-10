package empmgtusinglayeredarchitecture.com.cg.service;

import java.util.List;

import com.cg.empmgt.beans.Employee;
import com.cg.empmgt.dao.EmployeeDaoImp;
import com.cg.empmgt.dao.IEmployeeDao;
import com.cg.empmgt.dao.StoreHolder;
import com.cg.empmgt.exceptions.*;

public class EmployeeServiceImp implements IEmployeeService{
	private IEmployeeDao dao= new EmployeeDaoImp();

	@Override
	public Employee addEmployee(String name, String department) {				//add method 
		validateName(name);
		vaidateDepartment(department);
		Employee emp = new Employee(name,department);
		dao.add(emp);
		return emp;
	}


	@Override
	public Employee findById(int id) {											//Find by id method
		validateId(id);
		if(!(StoreHolder.store.containsKey(id))) {
			 throw new EmployeeNotFoundException("Employee not found for id :"+id);
		}
		Employee emp=dao.findById(id);
		return emp;
	}

	@Override
	public void removeById(int id) {											//remove employee by id
		if(StoreHolder.store.containsKey(id)) {
			dao.removeById(id);
		}
		else {
			throw new EmployeeNotFoundException("Employee not found for id :"+id);
		}
		
		
	}

	@Override
	public List<Employee> findAll() {
		List<Employee>employees=dao.findAll();
		return employees;
	}
	private void vaidateDepartment(String department) {
		if(department.isEmpty()||department==null) {
			throw new InvalidDepartmentNameException("Department can't be null or empty");
		}
		
	}

	private void validateName(String name) {
		if(name.isEmpty()||name==null||name.trim().isEmpty()) {
			throw new InvalidEmployeeNameException("Name can't be null or emptyor greater than length 10");
		}
		else if(name.length()>10){
				throw new NameGreaterThanLength10Exception("Name can't be greater than length 10");
		}
		
	}

	private void validateId(int id) {
		if(id<0) {
			throw new InvalidIdException("id can't be negative");
		}
		
	}



}
