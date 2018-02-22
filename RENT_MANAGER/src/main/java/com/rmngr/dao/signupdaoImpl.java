package com.rmngr.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.rmngr.bean.Person;
import com.rmngr.bean.SingupPeson;

@Repository
@Qualifier("personDao")

public class signupdaoImpl implements signupdao {

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public void saveDetails(SingupPeson signup) {
		System.err.println("chlta h");
		jdbcTemplate.update("INSERT INTO savedetails (adminid , email, fname, lname,password,cpassword) VALUES (?, ?, ?, ?,?,?)",
				signup.getAdminid(),signup.getEmail(),signup.getFname(),signup.getLname(),signup.getPassword(),signup.getCpassword());
		System.out.println("save admin Added!!");
	}
	
	
	
	
	public boolean authenticateUser(SingupPeson userBean){
		System.err.println("chli quesry ");
		boolean userExists = false;
		int rowcount = jdbcTemplate.update("select count(*) from savedetails " +
				" where fname = ? and password = ?",
				userBean.getAdminid(),userBean.getPassword());
		if(rowcount==1){
			userExists = true;
			System.err.println("chli quesry over ");
		}
		return userExists;
		
	}
		
	}
	
	

	

