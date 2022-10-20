package com.example.account.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.example.account.entity.Akshay;
import com.example.account.repo.AkshayRepo;

@Service
@Transactional(propagation=Propagation.SUPPORTS)
public class AkshayServiceImpl implements AkshayService {

	@Autowired
	private AkshayRepo akshayRepo;
	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public Akshay createAkshay(Akshay ak) {
		// TODO Auto-generated method stub
		return akshayRepo.save(ak);
	}

}
