package com.hoangcode.login.service;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hoangcode.login.dto.Login001Dto;
import com.hoangcode.login.repository.Login001Repository;

@Service
public class Login001Service implements Login001ServiceRemote{
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Autowired
	private Login001Repository login001Repository;

	@Override
	public Login001Dto loginCheck(String name, String pass, int mode) {
		StoredProcedureQuery procedureQuery = null;
		Login001Dto login001Dto = null;
		try {
		procedureQuery = entityManager.createStoredProcedureQuery("JPRC_LOGIN_CHECK_OPERATOR");
		int i = 0;
		
		procedureQuery.registerStoredProcedureParameter(i++, Integer.class, ParameterMode.IN);
		procedureQuery.registerStoredProcedureParameter(i++, String.class, ParameterMode.IN);
		procedureQuery.registerStoredProcedureParameter(i++, String.class, ParameterMode.IN);
		procedureQuery.registerStoredProcedureParameter(i++, String.class, ParameterMode.IN);
		procedureQuery.registerStoredProcedureParameter(i++, String.class, ParameterMode.IN);
		
		procedureQuery.registerStoredProcedureParameter(i++, String.class, ParameterMode.OUT);
		procedureQuery.registerStoredProcedureParameter(i++, String.class, ParameterMode.OUT);
		procedureQuery.registerStoredProcedureParameter(i++, String.class, ParameterMode.OUT);
		procedureQuery.registerStoredProcedureParameter(i++, String.class, ParameterMode.OUT);
		procedureQuery.registerStoredProcedureParameter(i++, Integer.class, ParameterMode.OUT);
		procedureQuery.registerStoredProcedureParameter(i++, Integer.class, ParameterMode.OUT);
		procedureQuery.registerStoredProcedureParameter(i++, Integer.class, ParameterMode.OUT);
		procedureQuery.registerStoredProcedureParameter(i++, String.class, ParameterMode.OUT);
		
		i = 0;
		procedureQuery.setParameter(i++, mode);
		procedureQuery.setParameter(i++, name);
		procedureQuery.setParameter(i++, pass);
		procedureQuery.setParameter(i++, "");
		procedureQuery.setParameter(i++, "");
		
		procedureQuery.execute();
		
		login001Dto = new Login001Dto();
		
		i = 5;
		
		login001Dto.setOutOpeName((String)procedureQuery.getOutputParameterValue(i++));
		login001Dto.setOutPass((String)procedureQuery.getOutputParameterValue(i++));
		login001Dto.setOutSkillLevel((String)procedureQuery.getOutputParameterValue(i++));
		login001Dto.setOutManagermentLevel((String)procedureQuery.getOutputParameterValue(i++));
		login001Dto.setOutTermCode((Integer)procedureQuery.getOutputParameterValue(i++));
		login001Dto.setOutScreenColor((Integer)procedureQuery.getOutputParameterValue(i++));
		login001Dto.setOutRetCode((Integer)procedureQuery.getOutputParameterValue(i++));
		login001Dto.setOutRetMessage((String)procedureQuery.getOutputParameterValue(i++));
		
		
		} finally {
	      if (procedureQuery != null) {
	        try {
	        	procedureQuery.unwrap(StoredProcedureQuery.class);
	        } finally {
	        	procedureQuery = null;
	        }
	      }
	    }
		return login001Dto;
	}

	@Override
	public void updateOperator(String opeCode) {
		login001Repository.updateOperator(opeCode);
	}

}
