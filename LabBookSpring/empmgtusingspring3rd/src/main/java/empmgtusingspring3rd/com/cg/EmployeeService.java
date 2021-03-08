package empmgtusingspring3rd.com.cg;

import java.util.*;
import java.util.Map.Entry;

import org.springframework.beans.factory.annotation.Autowired;

public class EmployeeService {
	@Autowired
	SBU businessUnit;
	Employee emp1=new Employee(1,"John",30000,25,businessUnit);
	HashMap<Integer,Employee> map = new HashMap<>();
	
	
	public void addEmployee(Employee employee) {
		int i=0;
		map.put(i++, employee);
	}
	public List<Employee> getEmployees(){
		List<Employee>list=new ArrayList<>();
		Set<Integer>set=map.keySet();
		for(int i:set) {
			list=(List<Employee>) map.get(i);
		}
		return list;		
	}
}
