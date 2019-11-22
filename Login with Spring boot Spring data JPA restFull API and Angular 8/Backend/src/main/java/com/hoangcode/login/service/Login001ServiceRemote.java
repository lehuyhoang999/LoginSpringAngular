package com.hoangcode.login.service;

import com.hoangcode.login.dto.Login001Dto;

public interface Login001ServiceRemote {
	
	Login001Dto loginCheck(String name, String pass, int mode);
	
	void updateOperator(String opeCode);
}
