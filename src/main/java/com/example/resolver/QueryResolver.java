package com.example.resolver;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Entity.Company;
import com.example.Entity.Employee;
import com.example.service.CompanyService;
import com.example.service.EmployeeService;

import graphql.kickstart.tools.GraphQLQueryResolver;

@Service
public class QueryResolver implements GraphQLQueryResolver {
	
	@Autowired
	private EmployeeService employeeService;
	@Autowired
	private CompanyService companyService;
	
	public String getMessage( ) {
        return employeeService.getMessage();
    }
	
	
	public List<Employee> employees( ) {
        return employeeService.getAllEmployees();
    }
	

	public Employee employeeById(UUID employeeId)
	{
		return employeeService.getEmployeeById(employeeId);
	}
	
	public List<Company> companies( ) {
        return companyService.getAllCompany();
    }
	

	public Company companyById(UUID companyId)
	{
		return companyService.getCompanyById(companyId);
	}

}
