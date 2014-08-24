package com.sphibmvc.controller;
import java.util.List;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.sphibmvc.dao.EmployeeDao;
import com.sphibmvc.entities.Employee;
import com.sphibmvc.services.EmployeeService;

//@Controller
public class EmployeeController  {
	
	private EmployeeService employeeService;
	
    public EmployeeService getEmployeeService() {
		return employeeService;
	}
    
	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	
	//	@RequestMapping("/employee/add.htm")
	public ModelAndView add(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
		Logger.getAnonymousLogger().info( "Employee Added");
		Employee employee = new Employee();
		employee.setEmpname("emp one");
		employee.setDeptno(new Integer("12"));
		employee.setJob("Mgr");
//		employeeService.addEmployee(employee);
		List<Employee> listEmployees = employeeService.listEmployees();
		/*for (Employee employee2 : listEmployees)
		{
			Logger.getAnonymousLogger().info( "Employee Name"+employee2.getEmpname());
			Logger.getAnonymousLogger().info( "Employee Number"+employee2.getEmpno());
			Logger.getAnonymousLogger().info( "Employee Deptno"+employee2.getEmpname());
		}*/
		return new ModelAndView("list", "emplist", listEmployees); 
	}
	
//	@RequestMapping("/employee/delete.htm")
	public ModelAndView delete(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		return new ModelAndView("employee", "message", "Employee Deleted"); 
	}
	
//	@RequestMapping("/employee/update.htm")
	public ModelAndView update(HttpServletRequest request, HttpServletResponse response) throws Exception 
	{
		return new ModelAndView("employee", "message", "Employee Updated"); 
	}
	
	public ModelAndView list(HttpServletRequest request, HttpServletResponse response) throws Exception 
	{
		List<Employee> listEmployees = employeeService.listEmployees();
		return new ModelAndView("employee", "emplist", listEmployees); 
	}
}