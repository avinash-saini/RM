package com.rmngr.dao;

import java.util.List;

import com.rmngr.bean.AddRenterDetails;
import com.rmngr.bean.Person;

public interface AddRenterDao {

public	void saveRenterDetails(AddRenterDetails addrenter);
 List<AddRenterDetails> RenterDetailsList();
List<AddRenterDetails> findAll();

}
