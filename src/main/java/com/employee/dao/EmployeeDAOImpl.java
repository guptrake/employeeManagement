package com.employee.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.employee.datasource.DataSource;
import com.employee.dto.Employee;

public class EmployeeDAOImpl implements IEmployeeDAO {

	// @Override
	public void addEmployee(Employee emp) {

	}

	public Integer deleteEmployee(String ssn) {
		DataSource dataSource = new DataSource();
		Connection con = dataSource.createConnection();
		Statement stmt = null;
		ResultSet rs = null;
		Integer deleteCount = 0;
		try {
			String query = "DELETE FROM EMPLOYEE WHERE SSN =" + ssn;
			stmt = con.createStatement();
			deleteCount = stmt.executeUpdate(query);
			return deleteCount;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (con != null) {
					con.close();
				}
				if (stmt != null) {
					stmt.close();
				}
				if (rs != null) {
					rs.close();
				}
			} catch (Exception exe) {
				exe.printStackTrace();
			}

		}
		return deleteCount;

	}

	// @Override
	public List<Employee> listAllEmployees() {
		DataSource dataSource = new DataSource();
		Connection con = dataSource.createConnection();
		Statement stmt = null;
		ResultSet rs = null;
		List<Employee> employeeList = new ArrayList<Employee>();
		try {
			String query = "SELECT * FROM employee";
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);
			while (rs.next()) {
				Employee employee = new Employee();
				employee.setSsn(rs.getString("ssn"));

				employeeList.add(employee);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		finally {
			try {
				if (con != null) {
					con.close();
				}
				if (stmt != null) {
					stmt.close();
				}
				if (rs != null) {
					rs.close();
				}
			} catch (Exception exe) {
				exe.printStackTrace();
			}

		}
		return employeeList;
	}

}
