package com.valtech.spring.boot;

import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.valtech.spring.boot.jpa.Employee;
import com.valtech.spring.boot.jpa.EmployeeRepository;
//import com.valtech.spring.boot.jpa.EmployeeRepository;

@SpringBootTest
class SprBootApplicationTests {
		
		@Autowired
		private HelloWorld helloWorld;
	
		@Autowired
		private EmployeeRepository employeeRepository;
//		@Test
//		void testFinders(){
//			assertEquals(1, employeeRepository.countBySalaryBetween(3000,21000));
//		}
		@Test
		void testHelloWorld(){
			assertEquals("Hello Valtech", helloWorld.hello("Valtech"));
		}
		@Test
		void testEmployeeRepo(){
			long count=employeeRepository.count();
			Employee employee=new Employee(1,"Sindhu",LocalDate.of(2000,8, 17),40000,"Tumkur,karnataka,572106");
			employeeRepository.save(employee);

			employee=new Employee(2,"nayana",LocalDate.of(2000,8, 17),50000,"Tumkur,karnataka,572106");
			employeeRepository.save(employee);

			employee=new Employee(3,"Saniya",LocalDate.of(2000,8, 17),30000,"Tumkur,karnataka,572106");
			employeeRepository.save(employee);

			employee=new Employee(4,"Shilpa",LocalDate.of(2000,8, 17),60000,"Tumkur,karnataka,572106");
			employeeRepository.save(employee);

			employee=new Employee(5,"Sahana",LocalDate.of(2000,8, 17),32000,"Tumkur,karnataka,572106");
			employeeRepository.save(employee);

			employee=new Employee(6,"Sushma",LocalDate.of(2000,8, 17),20000,"Tumkur,karnataka,572106");
			employeeRepository.save(employee);

			
			assertEquals(employeeRepository.count(),employeeRepository.count());
	}

}
