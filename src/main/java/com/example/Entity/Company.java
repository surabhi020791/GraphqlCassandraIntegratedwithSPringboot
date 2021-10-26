package com.example.Entity;

import java.util.UUID;

import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Table
public class Company {
	
	@PrimaryKey
	@Column(value = "cid")
    private UUID cid;
	@Column(value = "company_name")
    private String name;
	@Column(value = "company_desc")
    private String description;
	@Column(value = "company_code")
    private String compcode;
	//private List<Employee> employees;
	
	
	public String getCompcode() {
		return compcode;
	}
	public void setCompcode(String compcode) {
		this.compcode = compcode;
	}
	
	public UUID getCid() {
		return cid;
	}
	public void setCid(UUID cid) {
		this.cid = cid;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
    
    

}
