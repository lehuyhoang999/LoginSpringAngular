package com.hoangcode.login.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="OPERATOR")
public class OperatorEntity {
	
	@Id
	@Column(name = "operator_code")
	private String operatorCode;
	
	@Column(name = "operator_name")
	private String operatorName;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "agent_id")
	private String agentId;
	
	@Column(name = "employ_division")
	private String employDivision;
	
	@Column(name = "management_level")
	private String managementLevel;
	
	@Column(name = "skill_level")
	private String skillLevel;
	
	@Column(name = "qualified_flag")
	private String qualifiedFlag;
	
	@Column(name = "LASTOPERATION_CLASS")
	private String lastClass;
	
	@Column(name = "LASTOPERATION_NO")
	private String lastNo;
	
	@Column(name = "INPUT_OPERATOR")
	private String inOpe;
	
	@Column(name = "DELETE_FLAG")
	private String deleteFlag;
	
	@Column(name = "TIMESTAMP")
	private String time;
	
	@Column(name = "INVALID_FLAG")
	private String invalidFlag;
	
	@Column(name = "UNUSED_FLAG")
	private String unuseFlag;
	
	@Column(name = "ERROR_COUNT")
	private String errorCount;
	
	@Column(name = "LOCK_DATE")
	private String lockDate;
	
	@Column(name = "PWCHANGE_DATE")
	private String pwchangeDate;
	
	@Column(name = "TERMINAL_ID")
	private String termId;
	
	@Column(name = "LASTLOGIN_DATE")
	private String lastLoginDate;
	
	@Column(name = "PASSWORD_BEFORE1")
	private String pwBefor1;
	
	@Column(name = "PASSWORD_BEFORE2")
	private String pwBefor2;
	
	@Column(name = "PASSWORD_BEFORE3")
	private String pwBefor3;
	
	@Column(name = "PASSWORD_BEFORE4")
	private String pwBefor4;
	
	@Column(name = "PASSING_DATE")
	private String passingDate;

	public String getOperatorCode() {
		return operatorCode;
	}

	public void setOperatorCode(String operatorCode) {
		this.operatorCode = operatorCode;
	}

	public String getOperatorName() {
		return operatorName;
	}

	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAgentId() {
		return agentId;
	}

	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}

	public String getEmployDivision() {
		return employDivision;
	}

	public void setEmployDivision(String employDivision) {
		this.employDivision = employDivision;
	}

	public String getManagementLevel() {
		return managementLevel;
	}

	public void setManagementLevel(String managementLevel) {
		this.managementLevel = managementLevel;
	}

	public String getSkillLevel() {
		return skillLevel;
	}

	public void setSkillLevel(String skillLevel) {
		this.skillLevel = skillLevel;
	}

	public String getQualifiedFlag() {
		return qualifiedFlag;
	}

	public void setQualifiedFlag(String qualifiedFlag) {
		this.qualifiedFlag = qualifiedFlag;
	}

	public String getLastClass() {
		return lastClass;
	}

	public void setLastClass(String lastClass) {
		this.lastClass = lastClass;
	}

	public String getLastNo() {
		return lastNo;
	}

	public void setLastNo(String lastNo) {
		this.lastNo = lastNo;
	}

	public String getInOpe() {
		return inOpe;
	}

	public void setInOpe(String inOpe) {
		this.inOpe = inOpe;
	}

	public String getDeleteFlag() {
		return deleteFlag;
	}

	public void setDeleteFlag(String deleteFlag) {
		this.deleteFlag = deleteFlag;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getInvalidFlag() {
		return invalidFlag;
	}

	public void setInvalidFlag(String invalidFlag) {
		this.invalidFlag = invalidFlag;
	}

	public String getUnuseFlag() {
		return unuseFlag;
	}

	public void setUnuseFlag(String unuseFlag) {
		this.unuseFlag = unuseFlag;
	}

	public String getErrorCount() {
		return errorCount;
	}

	public void setErrorCount(String errorCount) {
		this.errorCount = errorCount;
	}

	public String getLockDate() {
		return lockDate;
	}

	public void setLockDate(String lockDate) {
		this.lockDate = lockDate;
	}

	public String getPwchangeDate() {
		return pwchangeDate;
	}

	public void setPwchangeDate(String pwchangeDate) {
		this.pwchangeDate = pwchangeDate;
	}

	public String getTermId() {
		return termId;
	}

	public void setTermId(String termId) {
		this.termId = termId;
	}

	public String getLastLoginDate() {
		return lastLoginDate;
	}

	public void setLastLoginDate(String lastLoginDate) {
		this.lastLoginDate = lastLoginDate;
	}

	public String getPwBefor1() {
		return pwBefor1;
	}

	public void setPwBefor1(String pwBefor1) {
		this.pwBefor1 = pwBefor1;
	}

	public String getPwBefor2() {
		return pwBefor2;
	}

	public void setPwBefor2(String pwBefor2) {
		this.pwBefor2 = pwBefor2;
	}

	public String getPwBefor3() {
		return pwBefor3;
	}

	public void setPwBefor3(String pwBefor3) {
		this.pwBefor3 = pwBefor3;
	}

	public String getPwBefor4() {
		return pwBefor4;
	}

	public void setPwBefor4(String pwBefor4) {
		this.pwBefor4 = pwBefor4;
	}

	public String getPassingDate() {
		return passingDate;
	}

	public void setPassingDate(String passingDate) {
		this.passingDate = passingDate;
	}

}
