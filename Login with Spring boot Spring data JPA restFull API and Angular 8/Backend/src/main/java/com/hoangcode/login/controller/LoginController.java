package com.hoangcode.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.hoangcode.login.dto.Login001Dto;
import com.hoangcode.login.model.Login001InModel;
import com.hoangcode.login.model.Login001OutModel;
import com.hoangcode.login.service.Login001ServiceRemote;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class LoginController {
	
	@Autowired
	private Login001ServiceRemote login001ServiceRemote;
	
	@RequestMapping(path ="/welcome", method= RequestMethod.GET)
	public String welcome() {
		return "hello";
	}
	
	@RequestMapping(path="/login", method= RequestMethod.POST)
	@ResponseStatus(code = HttpStatus.CREATED)
	@ResponseBody
	public Login001OutModel loginInfo(@RequestBody Login001InModel login001InModel) {
		Login001OutModel login001OutModel = new Login001OutModel();
		Login001Dto login001Dto = login001ServiceRemote.loginCheck(login001InModel.getName(),login001InModel.getPassword(), 1);
		login001OutModel.setOutOpeName(login001Dto.getOutOpeName());
		login001OutModel.setOutRetCode(login001Dto.getOutRetCode());
		login001OutModel.setOutRetMessage(login001Dto.getOutRetMessage());
		
		if (login001OutModel.getOutRetCode() != 0) {
			return login001OutModel;
		}
		
		login001ServiceRemote.updateOperator(login001InModel.getName());
		
		return login001OutModel;
	}
	
	@RequestMapping(path="/operatorexit", method= RequestMethod.POST)
	@ResponseStatus(code = HttpStatus.CREATED)
	@ResponseBody
	public Login001OutModel operatorExit(@RequestBody Login001InModel login001InModel) {
		Login001OutModel login001OutModel = new Login001OutModel();
		Login001Dto login001Dto = login001ServiceRemote.loginCheck(login001InModel.getName(),login001InModel.getPassword(), 0);
		login001OutModel.setOutOpeName(login001Dto.getOutOpeName());
		login001OutModel.setOutRetCode(login001Dto.getOutRetCode());
		login001OutModel.setOutRetMessage(login001Dto.getOutRetMessage());
		return login001OutModel;
	}
	
	@RequestMapping(path="/passwordexit", method= RequestMethod.POST)
	@ResponseStatus(code = HttpStatus.CREATED)
	@ResponseBody
	public Login001OutModel passwordExit(@RequestBody Login001InModel login001InModel) {
		Login001OutModel login001OutModel = new Login001OutModel();
		Login001Dto login001Dto = login001ServiceRemote.loginCheck(login001InModel.getName(),login001InModel.getPassword(), 1);
		login001OutModel.setOutOpeName(login001Dto.getOutOpeName());
		login001OutModel.setOutRetCode(login001Dto.getOutRetCode());
		login001OutModel.setOutRetMessage(login001Dto.getOutRetMessage());
		return login001OutModel;
	}
	
}
