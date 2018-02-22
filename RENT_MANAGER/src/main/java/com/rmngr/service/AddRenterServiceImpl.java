package com.rmngr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rmngr.bean.AddRenterDetails;
import com.rmngr.bean.Person;
import com.rmngr.dao.AddRenterDao;


@Service("AddRenterService")
public class AddRenterServiceImpl implements AddRenterService {

	private AddRenterDao addRenterDao;
	@Autowired
	public void setaddrenterdao(AddRenterDao addRenterDao) {
		this.addRenterDao = addRenterDao;
	}
	
	public void saveRenterDetails(AddRenterDetails addRenterDetails) {
		addRenterDao.saveRenterDetails(addRenterDetails);
		
	}
	
	
public	List<AddRenterDetails> RenterDetailsList(){
	System.out.println(" chltaaaa ");
	 return addRenterDao.RenterDetailsList();
	
	
}

@Override
public List < AddRenterDetails > findAll() {
	return addRenterDao.findAll();
}

	
}
