package com.rmngr.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import com.rmngr.bean.AddRenterDetails;
import com.rmngr.bean.Person;
import com.rmngr.bean.SingupPeson;

@Repository
@Qualifier("AddRenterDao")

public class AddRenterDaoImpl implements AddRenterDao {
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public void saveRenterDetails(AddRenterDetails addrenter) {
		try {
		System.err.println("chlta h");
		jdbcTemplate.update("INSERT INTO addrenterdetail1 (datetime, roomnoid , frname , lrname ,company ,email ,address ,state ,pincode,roomamount  ) VALUES (?,?,?,?,?,?,?,?,?,?)",
				addrenter.getDatetime()	,addrenter.getRoomnoid(),addrenter.getFrname(),addrenter.getLrname(),addrenter.getCompany(),addrenter.getEmail(),addrenter.getAddress(),addrenter.getState(),addrenter.getPincode(),addrenter.getRoomamount());
		System.out.println("save Renter Added!!"+ addrenter.getDatetime());
		System.out.println("save Renter Added!!"+ addrenter.getFrname());
		
		}
		catch(Exception e)
		{
			System.out.println(e);
			
		}
	}
	
	
	
	@Override
	public List<AddRenterDetails> RenterDetailsList() {
	
		
		System.err.println("hello controller query");
		List<AddRenterDetails> list =jdbcTemplate.query("select * from addrenterdetail1",new ResultSetExtractor<List<AddRenterDetails>>() {
		
		
		public List<AddRenterDetails> extractData(ResultSet rs)throws SQLException, DataAccessException
		{
		
		List<AddRenterDetails> l=new ArrayList<AddRenterDetails>();
		System.err.println("hello controller query");
		while(rs.next()) {
			AddRenterDetails ad=new AddRenterDetails();
			ad.setDatetime(rs.getDate(1));
			ad.setRoomnoid(rs.getInt(2));
			ad.setFrname(rs.getString(2));
			ad.setLrname(rs.getString(4));
			ad.setAddress(rs.getString(5));
			ad.setRoomamount(rs.getInt(6));
			
		l.add(ad);
		}
		return l;
	}

	
	
	});
	
		return list;
				
	}
	
	
	
	@Override
	public List < AddRenterDetails > findAll() {
		System.out.println("in findall dao");
		List < AddRenterDetails > addRenterDetails = jdbcTemplate.query("select * from addrenterdetail1", new BeanPropertyRowMapper(AddRenterDetails.class));
		return addRenterDetails;
	}
	
	
	
	
}
