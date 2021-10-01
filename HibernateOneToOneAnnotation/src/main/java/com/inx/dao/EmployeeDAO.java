package com.inx.dao;

import java.util.List;

import com.inx.model.Employee;

public interface EmployeeDAO {

	public void save(Employee employee);
	
	public List<Employee> getEmployee();
	
}
