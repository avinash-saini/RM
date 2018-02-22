package com.rmngr.dao;

import com.rmngr.bean.SingupPeson;

public interface signupdao {

public void saveDetails(SingupPeson signup);

public abstract boolean authenticateUser(SingupPeson userbean);

}
