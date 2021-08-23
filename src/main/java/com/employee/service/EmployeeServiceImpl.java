package com.employee.service;

import java.util.List;

import com.employee.dao.EmployeeDAOImpl;
import com.employee.dao.IEmployeeDAO;
import com.employee.dto.Employee;

public class EmployeeServiceImpl implements IEmployee{


	private IEmployeeDAO empDao;
	
	
	public EmployeeServiceImpl() {
		empDao= new EmployeeDAOImpl();
	}
	//@Override
	public void addEmployee(Employee emp) {
		
		
	}

	//@Override
	public List<Employee> listAllEmployees() {
		
		return empDao.listAllEmployees();
	}

}
