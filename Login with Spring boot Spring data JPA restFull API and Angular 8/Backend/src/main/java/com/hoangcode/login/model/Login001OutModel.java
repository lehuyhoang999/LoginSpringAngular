package com.hoangcode.login.model;

public class Login001OutModel {
	
	private String outOpeName;
	private int outRetCode;
	private String outRetMessage;
	
	public String getOutOpeName() {
		return outOpeName;
	}
	public void setOutOpeName(String outOpeName) {
		this.outOpeName = outOpeName;
	}
	public int getOutRetCode() {
		return outRetCode;
	}
	public void setOutRetCode(int outRetCode) {
		this.outRetCode = outRetCode;
	}
	public String getOutRetMessage() {
		return outRetMessage;
	}
	public void setOutRetMessage(String outRetMessage) {
		this.outRetMessage = outRetMessage;
	}
	
	@Override
	public String toString() {
		return "Login001OutModel [outOpeName=" + outOpeName + ", outRetCode=" + outRetCode + ", outRetMessage="
				+ outRetMessage + "]";
	}
	
}
