package com.example.security.SpringSmartVehicle.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.example.security.SpringSmartVehicle.Repository.DLRepo;
import com.example.security.SpringSmartVehicle.entity.DrivingLicense;

@Service
@Transactional(propagation=Propagation.SUPPORTS)
public class DLServiceImpl implements DLService {
	
	@Autowired
	private DLRepo dlRepo;
	
	

	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public String createDL(DrivingLicense dl) throws Exception {
		if(checkIfDLExist(dl.getDlno())!=null){
			return "DL already Exists";
		}
		
//		dl.setVehicleType();
		dlRepo.save(dl);
		return "Sucessfully Added DL Information";
	}
	
	
	
	private DrivingLicense checkIfDLExist(String dlno) {
		return dlRepo.findByDlno(dlno);
	}



	@Override
//	@ModelAttribute("dl")
	public List<DrivingLicense> getAll() {
		// TODO Auto-generated method stub
		return dlRepo.findAll();
	}




}
