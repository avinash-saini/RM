package com.rmngr.bean;

public class SingupPeson {
	
	private int adminid;
	private String email;
	private String fname;
	private String lname;
	private String password;
	private String cpassword;
	
	public SingupPeson(){
		
		super();
		
	}
	
SingupPeson(int adminid,String email,String fname,String lname,String password,String cpassword){
		this.adminid=adminid;
		this.email=email;
		this.lname=lname;
		this.password=password;
		this.cpassword=cpassword;
		
	}
	
	
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCpassword() {
		return cpassword;
	}
	public void setCpassword(String cpassword) {
		this.cpassword = cpassword;
	}
	public int getAdminid() {
		return adminid;
	}
	public void setAdminid(int adminid) {
		this.adminid = adminid;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Admin Id:- " + getAdminid() + " First Name:- " + getFname() + " Last Name:- " +
				getLname() + "password:- " + getPassword()   +  "cpassword:" + getCpassword());
		return builder.toString();
	}
	
	
	
}
