package com.example.demo.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.boot.entity.Car;
import com.example.demo.boot.service.CarService;

@Controller
public class CarController {
	
	

		@Autowired
		private CarService carService;
		
		
		@PostMapping("/car/updateCar/{id}")
		public ModelAndView saveUpdateCar(@PathVariable("id")int id,@ModelAttribute Car car,@RequestParam("submit") String submit){
		ModelAndView view=new ModelAndView("car/list");
		if(submit.equals("Cancel")){
			view.addObject("car",carService.getAllCars());
			return view;
					}
		carService.updateCar(car);
		view.addObject("car",carService.getAll());
		return view;
		}
		
		@GetMapping("/car/updateCar/{id}")
		public String updateCar(@PathVariable("id") int id, Model model ){
			model.addAttribute("car",carService.getCar(id));
			return "car/updateCar";
		}
		
		
		
		@PostMapping("car/newCar")
		public ModelAndView saveNewCar(@ModelAttribute Car car){
			ModelAndView mv=new ModelAndView("car/list");
			carService.createCar(car);
			mv.getModel().put("car", carService.getAll());
			return mv;
		}
		
		
		
		@GetMapping("/car/newCar")
		public String newCar(){
			return "car/newCar";
		}
		@GetMapping("/car/list")
		public String list(Model model){
			System.out.println("list of cars");
			model.addAttribute("car",carService.getAll());
			return "car/list";
		}
	}


