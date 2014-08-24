package com.sphibmvc.dao;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.sphibmvc.entities.Employee;
import com.sphibmvc.entities.ScfUserInvestor;
@Transactional
public interface EmployeeDao 
{
	public void addEmployee(Employee employee);
	public List<Employee> listEmployees();
	public void deleteEmployee(Integer employeeId);
	public List<ScfUserInvestor>  listInvestInPortfolio();
}
