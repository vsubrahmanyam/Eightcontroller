package com.sphibmvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;

public class LoginController
{
	public ModelAndView login(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		return new ModelAndView("employee", "message", "Employee Deleted"); 
	}
}
