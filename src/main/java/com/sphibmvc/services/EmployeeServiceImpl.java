package com.sphibmvc.services;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.sphibmvc.dao.EmployeeDao;
import com.sphibmvc.entities.Employee;
import com.sphibmvc.entities.ScfUser;
import com.sphibmvc.entities.ScfUserInvestor;

public class EmployeeServiceImpl implements EmployeeService {
	EmployeeDao employeeDao;

	 
	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

	@Override	
	@Transactional
	public void addEmployee(Employee employee) {
		employeeDao.addEmployee(employee);

	}

	@Override
	public List<Employee> listEmployees() {
		return employeeDao.listEmployees();
	}

	@Override
	public void deleteEmployee(Integer employeeId) {
		employeeDao.deleteEmployee(employeeId);
	}

	@Override
	public List<ScfUserInvestor> listInvestInPortfolio() {
		// TODO Auto-generated method stub
		return employeeDao.listInvestInPortfolio();
	}



}
