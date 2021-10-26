package com.example.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Entity.Employee;
import com.example.repo.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
    private EmployeeRepository employeeRepository ;
	
    private String message = "Simple Employee Schema!";
	
	public Employee getEmployeeById(UUID employeeId)
	{
		Employee employee = null;
		Optional<Employee> employeeOptional = employeeRepository.findById(employeeId);
		if(employeeOptional.isPresent())
			employee = employeeOptional.get();
		return employee;
	}
	
	public List<Employee> getAllEmployees( ) {
        return this.employeeRepository.findAll();
    }
    
    public String getMessage()
    {
    	return message;
    }
    public Employee addEmployee(Employee employee)
    {
    	return employeeRepository.insert(employee);
    }
}
