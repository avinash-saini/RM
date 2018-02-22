package com.rmngr.bean;

import java.sql.Date;


public class AddRenterDetails {
	
	private Date datetime ;
	private int roomnoid ;
	private String frname  ;
	private String lrname;
	private String company ;
	private String email;
	private String address ;
	private String state ;
	private int pincode  ;
	private int roomamount  ;
	private byte[] image1  ;
	private byte[] image2  ;
	
	
	
	public int getRoomnoid() {
		return roomnoid;
	}
	public void setRoomnoid(int roomnoid) {
		this.roomnoid = roomnoid;
	}
	
	
		public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public int getRoomamount() {
		return roomamount;
	}
	public void setRoomamount(int roomamount) {
		this.roomamount = roomamount;
	}
	public byte[] getImage1() {
		return image1;
	}
	public void setImage1(byte[] image1) {
		this.image1 = image1;
	}
	public byte[] getImage2() {
		return image2;
	}
	public void setImage2(byte[] image2) {
		this.image2 = image2;
	}
	public String getFrname() {
		return frname;
	}
	public void setFrname(String frname) {
		this.frname = frname;
	}
	public String getLrname() {
		return lrname;
	}
	public void setLrname(String lrname) {
		this.lrname = lrname;
	}
	public Date getDatetime() {
		return datetime;
	}
	public void setDatetime(Date datetime) {
		this.datetime = datetime;
	}
	
	

}
