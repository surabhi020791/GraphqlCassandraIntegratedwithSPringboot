package com.example.resolver;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;

import com.datastax.driver.core.utils.UUIDs;
import com.example.Entity.Company;
import com.example.Entity.Employee;
import com.example.service.CompanyService;
import com.example.service.EmployeeService;

import graphql.kickstart.tools.GraphQLMutationResolver;

@Component
public class TECMutation implements GraphQLMutationResolver {
	
	@Autowired
	private EmployeeService employeeService;
	@Autowired
	private CompanyService companyService;
	
	public Employee addEmployee(String firstName, String lastName, int jobLevel, String empcode) {
		Employee emp = new Employee();
		emp.setEid(UUIDs.timeBased());
		emp.setFirstName(firstName);
		emp.setLastName(lastName);
		emp.setJobLevel(jobLevel);
		emp.setEmpcode(empcode);
		return employeeService.addEmployee(emp);
	}
	
	public Company addCompany(String name, String description, String compcode) {
		Company tec = new Company();
		tec.setCid(UUIDs.timeBased());
		tec.setName(name);
		tec.setDescription(description);
		tec.setCompcode(compcode);
		return companyService.addCompany(tec);
	}

}
