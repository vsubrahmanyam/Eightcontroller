package com.sphibmvc.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sphibmvc.entities.ScfUser;
import com.sphibmvc.model.ScfUserBean;
import com.sphibmvc.services.ScfUserService;
@Controller
public class ScfUserController 
{
	@Autowired
	private ScfUserService scfUserService;

	public ScfUserService getScfUserService() 
	{
		return scfUserService;
	}

	public void setScfUserService(ScfUserService scfUserService) 
	{
		this.scfUserService = scfUserService;
	}
	
	@RequestMapping(value="/scfuserlistt")
	public ModelAndView list(HttpServletRequest request,HttpServletResponse response)throws Exception
	{
		List<ScfUser> listScfUsers = scfUserService.listScfUsers();
		return new ModelAndView("list","scfusers",listScfUsers);
	}
	
	@RequestMapping(value="/scfuserlist")
	public String listScfUsers( ModelMap model)throws Exception
	{
		List<ScfUser> listScfUsers = scfUserService.listScfUsers();
		model.addAttribute("scfusers", listScfUsers);
		model.addAttribute("message", " SCF Users List ");
		return  "list" ;
	}
	
	@RequestMapping(value="/scfuserreg")
	public String userReg(ModelMap modelMap)throws Exception
	{
		modelMap.addAttribute("scfUser",new ScfUserBean());
		return ("scfuserreg");
	}
	
	@RequestMapping(value="/savescfuser")
	public String saveScfuser(@ModelAttribute("scfUser") @Valid ScfUserBean scfUserBean,BindingResult result,ModelMap modelMap)throws Exception
	{
		if(result.hasErrors())
			return "editscfuser";
		else
			scfUserService.createScfUser(scfUserBean);
		List<ScfUser> listScfUsers = scfUserService.listScfUsers();
		modelMap.addAttribute("scfusers", listScfUsers);
		modelMap.addAttribute("message", " SCF Users List ");
		return  "list" ;		
	}
	
	@RequestMapping(value="/editscfuser")
	public String editScfUser(@RequestParam("id") int scfu_id,ModelMap modelMap )
	{
		ScfUserBean scfUserBean = scfUserService.getScfUser(scfu_id);
		modelMap.addAttribute("scfUser",scfUserBean);
		return "editscfuser";
	}
	
	
}