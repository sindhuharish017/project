package com.example.account.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.account.entity.Akshay;
import com.example.account.service.AkshayService;

@RestController
public class AkshayRestController {

	@Autowired
	private AkshayService akshayService;
	
	@PostMapping("/api/ak")
	public Akshay createAkshay(@RequestBody Akshay ak){
		return akshayService.createAkshay(ak);
	}
}
