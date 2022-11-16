package com.example.security.SpringSmartVehicle.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.context.properties.bind.BindException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.security.SpringSmartVehicle.Service.AdminService;
import com.example.security.SpringSmartVehicle.Service.DLService;
import com.example.security.SpringSmartVehicle.Service.UserService;
import com.example.security.SpringSmartVehicle.entity.Admin;
import com.example.security.SpringSmartVehicle.entity.DrivingLicense;
import com.example.security.SpringSmartVehicle.entity.User;

@Controller
public class HelloController {

	@Autowired
	private UserService userservice;

	@Autowired
	private AdminService adminService;
	@Autowired
	private DLService dlService;

	@Autowired
	@GetMapping("/home")
	public String home() {
		return "home";
	}

	@GetMapping("/admin")
	public String admin() {
		return "admin";
	}

	@PostMapping("/admin")
//	@ResponseBody
	public ModelAndView admin(@ModelAttribute Admin admin) throws Exception{

		if (adminService.loginValidator(admin.getUsername()) == 1) {
			ModelAndView mv = new ModelAndView("redirect:/createdl");
//			dlService.createDL(dl);
//			mv.getModel().put("dl", dlService.getAll());
			return mv;
		}
//		return "InCorrect Username And Password...";
		// return user.getDlno();
		ModelAndView mv = new ModelAndView("/failuredl");
		return mv;

	}


	@GetMapping("/createdl")
	public String dl() {
		return "createdl";
	}
	
	@PostMapping("/createdl")
	public ModelAndView newDLRegister(@ModelAttribute DrivingLicense dl) throws Exception {
		ModelAndView mv = new ModelAndView("redirect:/dllist");
		dlService.createDL(dl);
//		mv.getModel().put("dl", dlService.getAll());
		return mv;
	}


	@GetMapping("/userlogin")
	public String user() {
		return "/user";
	}
	@GetMapping("/vehicleType/{id}")
	public ModelAndView update(@PathVariable int id, Model model,@ModelAttribute User user) {
		ModelAndView mv=new ModelAndView();
		mv.addObject("dlno", user.getDlno());
	    mv.addObject("pass", user.getPass());
	    mv.setViewName("vehicleType");
//		model.addAttribute("vehicleType", userservice.getUser(id));
		return mv;
	}
	
	@PostMapping("/vehicleType/{id}")
	
	public String update(@PathVariable int id,@ModelAttribute User user,Model model) {
		ModelAndView  mv=new ModelAndView("redirect:/userlogin");
		
		System.out.println(user.getId());
//		user.setId(id);
//		user.setVehicleType("2wheeler");
		String vtype=user.getVehicleType();
		
		System.out.println(user.getDlno());
		System.out.println(user.getPass());
//		user.setVehicleType(vtype);
			userservice.updateUser(user);
			System.out.println(user.getVehicleType());

		
//		ModelAndView view=new ModelAndView("/vehicleType");
//		view.addObject(attributeValue)
		return "redirect:/userlogin";
	}

	@PostMapping("/userlogin")
    //@ResponseBody
    public ModelAndView user(@ModelAttribute User user,ModelMap model) throws Exception {
        String url;
        if(user.getDlno()=="" ){
            if(user.getPass()==""){
            model.addAttribute("enter","enter username and pass");
            ModelAndView mv = new ModelAndView("/userlogin");
            return mv;
            }
        }
        else if (userservice.loginValidator(user.getDlno()) == 1 ) {
            if(userservice.loginValidator(user.getPass())==1){
            	  System.out.println("User Page Requested");
            	int id=userservice.getIdByDlno(user.getDlno());
            	System.out.println(id);
            	
            ModelAndView mv = new ModelAndView("redirect:/vehicleType/"+id);
            mv.addObject("dlno", user.getDlno());
    	    mv.addObject("pass", user.getPass());
            return mv;
        }
        }
        
        model.addAttribute("fail","login failed");
        ModelAndView mv = new ModelAndView("/userlogin");
        return mv;
    }
	
	
	

	
	@GetMapping("/register")
	public String newUserRegister(@ModelAttribute User user) {
		ModelAndView mv=new ModelAndView();
		mv.addObject("dlno", user.getDlno());
		return "register";
	}

	@PostMapping("/register")
	public ModelAndView newUserRegister(@ModelAttribute User user,DrivingLicense dl,Model model) throws Exception {
		ModelAndView mv = new ModelAndView("/user");
		System.out.println(user.getDlno());
		System.out.println(dl.getDlno());
		if(user.getDlno().equals(dl.getDlno())){
			userservice.createUser(user);
		}
		else{
	
		model.addAttribute("valid","This sl is not valid");
		}
		//mv.getModel().put("user", userservice.getAll());
		return mv;
	}

	
	@GetMapping("/dllist")
	public String list(Model model){
		System.out.println("List Of DL");
		model.addAttribute("dl",dlService.getAll());
		return "dllist";
	}



}
