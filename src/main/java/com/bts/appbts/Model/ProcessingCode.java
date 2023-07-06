package com.bts.appbts.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "processingcode")
public class ProcessingCode {
    @Id
    private String code;
    private String description;
    
    
    
   
    
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCode() {
		
		return code;
	}
	public void setCode(String code) {
		
		this.code = code;
	}

    // Constructors, getters, and setters
}
