package empmgtusinglayeredarchitecture.com.cg.dao;

import java.util.List;

import com.cg.empmgt.beans.Employee;

public interface IEmployeeDao {
	void add(Employee employee);
	Employee findById(int id);
	void removeById(int id);
	List<Employee>findAll();
}
