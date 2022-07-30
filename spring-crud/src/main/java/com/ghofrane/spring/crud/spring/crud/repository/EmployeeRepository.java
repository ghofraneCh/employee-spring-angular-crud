package com.ghofrane.spring.crud.spring.crud.repository;

import com.ghofrane.spring.crud.spring.crud.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
}
