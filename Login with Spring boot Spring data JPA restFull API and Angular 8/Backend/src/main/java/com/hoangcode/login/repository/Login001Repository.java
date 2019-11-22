package com.hoangcode.login.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.hoangcode.login.Entity.OperatorEntity;

@Repository
public interface Login001Repository extends JpaRepository<OperatorEntity, String>{
	
	OperatorEntity findByOperatorCode(String ope);
	
	@Transactional
	@Modifying
	@Query(value ="UPDATE OPERATOR SET LASTLOGIN_DATE = SYSDATE, TIMESTAMP = SYSDATE WHERE OPERATOR_CODE = ?1", nativeQuery = true)
	void updateOperator(String opeCode);
}
