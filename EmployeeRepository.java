package com.zrz.thymleaf.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zrz.thymleaf.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
        
	//sort by lastname
	public List<Employee> findAllByOrderByLastNameAsc();
}
