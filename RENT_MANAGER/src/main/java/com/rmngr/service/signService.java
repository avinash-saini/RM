package com.rmngr.service;

import com.rmngr.bean.SingupPeson;

public interface signService {
	public void saveDetails(SingupPeson signup);
	public abstract boolean authenticateUser(SingupPeson userbean);

}
