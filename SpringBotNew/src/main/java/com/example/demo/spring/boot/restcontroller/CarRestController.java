package com.example.demo.spring.boot.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.boot.entity.Car;
import com.example.demo.boot.service.CarService;

@RestController
public class CarRestController {

	@Autowired
	private CarService carService;
	
	@PutMapping("/api/cars/{id}")
	public Car updateCar(@RequestBody Car car,@PathVariable("id") int id){
		car.setId(id);
		carService.updateCar(car);
		return carService.getCar(id);
	}
	@PostMapping("/api/cars")
	public Car createCar(@RequestBody Car car){
		return carService.createCar(car);
	}
	@GetMapping("/api/cars")
	public List<Car> getCars(){
		return carService.getAll();
	}
	
	@GetMapping("/api/cars/{id}")
	public Car getCar(@PathVariable("id") int id) {
		return carService.getCar(id);
		
	}
	
}
