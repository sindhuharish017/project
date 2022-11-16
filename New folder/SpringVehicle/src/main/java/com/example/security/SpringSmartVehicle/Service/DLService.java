package com.example.security.SpringSmartVehicle.Service;

import java.util.List;

import org.springframework.validation.Errors;

import com.example.security.SpringSmartVehicle.entity.DrivingLicense;

public interface DLService {

	String createDL(DrivingLicense dl) throws Exception;

	List<DrivingLicense> getAll();

	//boolean supports(Class clazz);

//	void validate(Object target, Errors errors);

	//void createDL(Model model);

}