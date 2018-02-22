package com.rmngr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.rmngr.bean.AddRenterDetails;
import com.rmngr.bean.SingupPeson;
import com.rmngr.service.AddRenterService;
import com.rmngr.service.signService;

@Controller
public class AdminsaveController {

	
private	signService signservice;
private AddRenterService addRenterService;	
	
	
	@Autowired
	public void setsignService(signService signService) {
		this.signservice = signService;
	}
	
	@Autowired
	public void setAddRenterService(AddRenterService addRenterService) {
		this.addRenterService = addRenterService;
	}
	

	@RequestMapping(value="/saveAdmin",method=RequestMethod.POST)

	public ModelAndView saveadmin(@ModelAttribute SingupPeson  singupPeson ) {
		
		signservice.saveDetails(singupPeson);
		return new ModelAndView("redirect:/");
		
		
		
	}
	

	
	@RequestMapping(value="/saveRenter",method=RequestMethod.POST)

	public String saveRenterDetails(@ModelAttribute AddRenterDetails  addRenterDetails ) {
		System.err.println("clata h controller aviansh saini");
		addRenterService.saveRenterDetails(addRenterDetails);
		return "AddRenter";
		
		
		
	}

	
	
	
}
