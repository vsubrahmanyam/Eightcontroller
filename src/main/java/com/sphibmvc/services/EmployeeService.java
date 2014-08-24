package com.sphibmvc.services;

import java.util.List;

import com.sphibmvc.entities.Employee;
import com.sphibmvc.entities.ScfUser;
import com.sphibmvc.entities.ScfUserInvestor;

public interface EmployeeService
{
	public void addEmployee(Employee employee);
	public List<Employee> listEmployees();
	public void deleteEmployee(Integer employeeId);
	public List<ScfUserInvestor>  listInvestInPortfolio();


}
