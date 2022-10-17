package com.valtech.spring.boot.service;

import java.util.List;

import com.valtech.spring.boot.jpa.Employee;

public interface EmployeeService {

	Employee get(int id);

	List<Employee> getAll();

	Employee update(Employee emp);

	Employee save(Employee emp);

}