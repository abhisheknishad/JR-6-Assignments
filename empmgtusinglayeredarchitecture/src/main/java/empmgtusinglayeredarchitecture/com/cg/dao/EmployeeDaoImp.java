package empmgtusinglayeredarchitecture.com.cg.dao;

import java.util.List;
import java.util.*;

import com.cg.empmgt.beans.Employee;

public class EmployeeDaoImp implements IEmployeeDao{
	private int generateId=0;
	public int generateId() {
		generateId++;
		return generateId;
	}

	@Override
	public void add(Employee employee) {
		Map<Integer,Employee>store=StoreHolder.store;
		int id=generateId();
		employee.setId(id);
		store.put(id, employee);
		
	}

	@Override
	public Employee findById(int id) {
		Map<Integer,Employee>store=StoreHolder.store;
		Employee emp=store.get(id);
		return emp;
	}

	@Override
	public void removeById(int id) {
		Map<Integer,Employee>store=StoreHolder.store;
		store.remove(id);
		
	}

	@Override
	public List<Employee> findAll() {
		Map<Integer,Employee>store=StoreHolder.store;
		Collection<Employee>employee=store.values();
		List<Employee>list=new ArrayList<>(employee);
		//List<Employee>list=(ArrayList)store.values();
		return list;
	}

}
