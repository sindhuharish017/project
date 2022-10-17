package com.example.demo.boot.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.boot.entity.Car;

@Repository
public interface CarRepository extends JpaRepository<Car, Integer> {

	List<Car> findByColor(String color);
	List<Car> findByPriceLessThan(float minPrice);
	List<Car> findByColorAndPriceLessThan(String color,float minPrice);
	
}
