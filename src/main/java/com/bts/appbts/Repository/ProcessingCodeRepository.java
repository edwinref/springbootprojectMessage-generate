package com.bts.appbts.Repository;

import com.bts.appbts.Model.ProcessingCode;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProcessingCodeRepository extends JpaRepository<ProcessingCode, String> {

	ProcessingCode findByCode(String code);
	
}
