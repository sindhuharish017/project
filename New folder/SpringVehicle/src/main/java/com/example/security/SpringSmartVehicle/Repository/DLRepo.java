package com.example.security.SpringSmartVehicle.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.security.SpringSmartVehicle.entity.DrivingLicense;
import com.example.security.SpringSmartVehicle.entity.User;

@Repository
public interface DLRepo extends JpaRepository<DrivingLicense, Integer> {

	DrivingLicense findByDlno(String dlno);

	//DrivingLicense findByDlno(String dlno);

}
