package com.employee.service;

import java.util.List;

import com.employee.dto.Employee;

public interface IEmployee {

	void addEmployee(Employee emp);

	Integer deleteEmployee(String ssn);

	List<Employee> listAllEmployees();
}
