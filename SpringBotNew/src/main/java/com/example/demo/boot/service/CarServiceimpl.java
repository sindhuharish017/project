package com.example.demo.boot.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.boot.entity.Car;
import com.example.demo.boot.repo.CarRepository;


@Service
@Transactional(propagation=Propagation.SUPPORTS)
public class CarServiceimpl implements CarService{

	@Autowired
	private CarRepository carRepository;
	
	/* (non-Javadoc)
	 * @see com.example.demo.boot.service.CarService#createCar(com.example.demo.boot.entity.Car)
	 */
	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public Car createCar(Car car){
		return carRepository.save(car);
	}
	/* (non-Javadoc)
	 * @see com.example.demo.boot.service.CarService#updateCar(com.example.demo.boot.entity.Car)
	 */
	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public Car updateCar(Car car){
		return carRepository.save(car);
	}
	@Override
	public Car getCar(int id){
        return carRepository.getReferenceById(id);
    }
	
	
	/* (non-Javadoc)
	 * @see com.example.demo.boot.service.CarService#getAll()
	 */
	@Override
	public List<Car> getAll(){
	return carRepository.findAll();
	}
	@Override
	public Car getAllCars(int id) {
	
		return carRepository.getReferenceById(id);
	}
	@Override
	public Car getAllCars() {
		// TODO Auto-generated method stub
		return null;
	}
}
