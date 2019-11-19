package com.mango.service;

import com.mango.utils.OAResult;

public interface UserService {
	
	public OAResult getDataByUserData(String username, String password);
	
}
