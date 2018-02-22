package com.rmngr.service;

import java.util.List;

import com.rmngr.bean.AddRenterDetails;
import com.rmngr.bean.Person;

public interface AddRenterService {
	public void saveRenterDetails(AddRenterDetails addRenterDetails);
	public List<AddRenterDetails> RenterDetailsList();
	List<AddRenterDetails> findAll();
 
	
}
