package com.employee.ui;

import com.employee.service.EmployeeServiceImpl;
import com.employee.service.IEmployee;

public class EmployeeMainConsole {

	public static void main(String[] args) {
		IEmployee employee = new EmployeeServiceImpl();
		System.out.println(employee.listAllEmployees());
	}
}
