package com.rmngr.controller;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.rmngr.bean.AddRenterDetails;
import com.rmngr.bean.SingupPeson;
import com.rmngr.service.AddRenterService;
import com.rmngr.service.PersonService;
import com.rmngr.service.signService;

@Controller
@RequestMapping("/")
public class LoginController {


	private PersonService personService;
	private	signService signservice;
	private AddRenterService addRenterService;
	@Autowired
	public void setPersonService(PersonService personService) {
		this.personService = personService;
	}
	@Autowired
	public void setsignService(signService signService) {
		this.signservice = signService;
	}

	@Autowired
	public void setAddRenterService(AddRenterService addRenterService) {
		this.addRenterService = addRenterService;
	}


	@RequestMapping(method = RequestMethod.GET)
	public String sayHello(ModelMap model) {
		return "welcome";
	}


/**
 * Login Controller
 * @param singupPeson
 * @return
 */
	@RequestMapping(value="/login")
	public String loginPage(@ModelAttribute SingupPeson  singupPeson) {
		if(!signservice.authenticateUser(singupPeson)) {
			return  "welcome";
		}
		else {

			return "homePage";
		}

	}
	@RequestMapping(value="/createAcc")
	public String createAcc(ModelMap model) {


		return "AccountForm";
	}



	@RequestMapping(value="/AddRenter")
	public String AddRenter(ModelMap model) {
		return "AddRenter";
	}


	@RequestMapping(value="/RenterList")
	public ModelAndView  RenterList(ModelMap model) {

		ModelAndView m=new ModelAndView("RenterDetails");
		List < AddRenterDetails > l=addRenterService.findAll();
		System.out.println("renter list:"+l.toString());
		Iterator itr = l.iterator();
		while(itr.hasNext()) {

			AddRenterDetails rntr=	(AddRenterDetails)itr.next();
			System.out.println(":"+rntr.getFrname());
}
		m.addObject("renterlist",l);
		return m;

		//return "RenterDetails";
	}





	@RequestMapping(value="/Payment")
	public String AddPayment(ModelMap model) {


		return "Payment";
	}




	/*@RequestMapping(value="/renterlistdata")
	public ModelAndView Listrenter(@ModelAttribute("renterlistdata") AddRenterDetails addRenterDetails )
	{





	}*/
}
