package com.employee.dao;

import java.util.List;

import com.employee.dto.Employee;

public interface IEmployeeDAO {

	void addEmployee(Employee emp);

	Integer deleteEmployee(String ssn);

	List<Employee> listAllEmployees();
}
