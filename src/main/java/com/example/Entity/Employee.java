package com.example.Entity;
import java.util.UUID;
import java.io.Serializable;

import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Table
public class Employee implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@PrimaryKey
	@Column(value = "eid")
	private UUID eid;
	@Column(value = "first_name")
    private String firstName;
	@Column(value = "last_name")
    private String lastName;
	@Column(value = "job_description")
	private int  jobLevel ;
	@Column(value = "company_id")
	private String companyId;
	@Column(value = "empcode")
	private String empcode;
	//private Company empcompany;
	
	public String getEmpcode() {
		return empcode;
	}
	public void setEmpcode(String empcode) {
		this.empcode = empcode;
	}
	
	public UUID getEid() {
		return eid;
	}
	public void setEid(UUID eid) {
		this.eid = eid;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getJobLevel() {
		return jobLevel;
	}
	public void setJobLevel(int jobLevel) {
		this.jobLevel = jobLevel;
	}
	public String getCompanyId() {
		return companyId;
	}
	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}
	
	
	

}
