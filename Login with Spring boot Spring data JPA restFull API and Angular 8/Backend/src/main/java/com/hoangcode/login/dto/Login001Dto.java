package com.hoangcode.login.dto;

public class Login001Dto {
	private String inCheckMode;
	private String inOpeCode;
	private String inNowPass;
	private String inNewPass1;
	private String inNewPass2;
	
	private String outOpeName;
	private String outPass;
	private String outSkillLevel;
	private String outManagermentLevel;
	private int outTermCode;
	private int outScreenColor;
	private int outRetCode;
	private String outRetMessage;
	
	public String getInCheckMode() {
		return inCheckMode;
	}
	public void setInCheckMode(String inCheckMode) {
		this.inCheckMode = inCheckMode;
	}
	public String getInOpeCode() {
		return inOpeCode;
	}
	public void setInOpeCode(String inOpeCode) {
		this.inOpeCode = inOpeCode;
	}
	public String getInNowPass() {
		return inNowPass;
	}
	public void setInNowPass(String inNowPass) {
		this.inNowPass = inNowPass;
	}
	public String getInNewPass1() {
		return inNewPass1;
	}
	public void setInNewPass1(String inNewPass1) {
		this.inNewPass1 = inNewPass1;
	}
	public String getInNewPass2() {
		return inNewPass2;
	}
	public void setInNewPass2(String inNewPass2) {
		this.inNewPass2 = inNewPass2;
	}
	public String getOutOpeName() {
		return outOpeName;
	}
	public void setOutOpeName(String outOpeName) {
		this.outOpeName = outOpeName;
	}
	public String getOutPass() {
		return outPass;
	}
	public void setOutPass(String outPass) {
		this.outPass = outPass;
	}
	public String getOutSkillLevel() {
		return outSkillLevel;
	}
	public void setOutSkillLevel(String outSkillLevel) {
		this.outSkillLevel = outSkillLevel;
	}
	public String getOutManagermentLevel() {
		return outManagermentLevel;
	}
	public void setOutManagermentLevel(String outManagermentLevel) {
		this.outManagermentLevel = outManagermentLevel;
	}
	public int getOutTermCode() {
		return outTermCode;
	}
	public void setOutTermCode(int outTermCode) {
		this.outTermCode = outTermCode;
	}
	public int getOutScreenColor() {
		return outScreenColor;
	}
	public void setOutScreenColor(int outScreenColor) {
		this.outScreenColor = outScreenColor;
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
		return "Login001Dto [inCheckMode=" + inCheckMode + ", inOpeCode=" + inOpeCode + ", inNowPass=" + inNowPass
				+ ", inNewPass1=" + inNewPass1 + ", inNewPass2=" + inNewPass2 + ", outOpeName=" + outOpeName
				+ ", outPass=" + outPass + ", outSkillLevel=" + outSkillLevel + ", outManagermentLevel="
				+ outManagermentLevel + ", outTermCode=" + outTermCode + ", outScreenColor=" + outScreenColor
				+ ", outRetCode=" + outRetCode + ", outRetMessage=" + outRetMessage + "]";
	}
	
}
