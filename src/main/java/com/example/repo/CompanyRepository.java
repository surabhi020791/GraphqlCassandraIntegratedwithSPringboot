package com.example.repo;

import java.util.UUID;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.Entity.Company;

@Repository
@Transactional
public interface CompanyRepository extends CassandraRepository<Company, UUID> {

}
