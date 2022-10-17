package com.valtech.spring.boot.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

	
	List<Employee> findByName(String name);
	List<Employee> findById(int id);
	List<Employee> findByNameAndId(String name,int id);
	List<Employee> findByNameOrId(String name,int id);
	List<Employee> findBySalaryBetween(float minsal,float maxsal);
	
	long countByName(String name);
	long countByNameOrId(String name,int id);
	long countByNameAndId(String name,int id);
	long countBySalaryBetween(float minsal,float maxsal);
}
