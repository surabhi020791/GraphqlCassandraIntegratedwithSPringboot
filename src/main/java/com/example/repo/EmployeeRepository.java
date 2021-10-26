package com.example.repo;

import java.util.UUID;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.Entity.Employee;

@Repository
@Transactional
public interface EmployeeRepository extends CassandraRepository<Employee, UUID> {

}
