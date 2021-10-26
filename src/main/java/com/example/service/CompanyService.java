package com.example.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Entity.Company;
import com.example.repo.CompanyRepository;

@Service
public class CompanyService {

	@Autowired
    private CompanyRepository companyRepository ;
	
    private String message = "Simple Company Schema!";
	
	public Company getCompanyById(UUID comapnyId)
	{
		Company company = null;
		Optional<Company> comapnyOptional = companyRepository.findById(comapnyId);
		if(comapnyOptional.isPresent())
			company = comapnyOptional.get();
		return company;
	}
	
	public List<Company> getAllCompany( ) {
        return this.companyRepository.findAll();
    }
    
    public String getMessage()
    {
    	return message;
    }
    public Company addCompany(Company company)
    {
    	return companyRepository.insert(company);
    }
}
