package com.rmngr.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rmngr.bean.SingupPeson;

import com.rmngr.dao.signupdao;

@Service("signService")
public class signServiceImpl implements signService {

	private signupdao signupdao;
	
	@Autowired
	public void setsignupdao(signupdao signupdao) {
		this.signupdao = signupdao;
	}
	
	
	
	public void saveDetails(SingupPeson signup) {
		signupdao.saveDetails(signup);
		
	}

	public boolean authenticateUser(SingupPeson userbean) {
	return	signupdao.authenticateUser(userbean);
		
	}
	
	
	
	
}
