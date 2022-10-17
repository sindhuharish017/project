package com.example.demo.boot.service;

import java.util.List;

import com.example.demo.boot.entity.Car;

public interface CarService {

	Car createCar(Car car);

	Car updateCar(Car car);

	List<Car> getAll();

	Car getCar(int id);

	Car getAllCars();

	Car getAllCars(int id);

}