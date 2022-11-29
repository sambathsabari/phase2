package com.carpenter.booking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carpenter.booking.model.Admin;
import com.carpenter.booking.service.AdminService;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1")

public class AdminController {
	
	@Autowired
	private AdminService adminservice;
	
	
	@GetMapping("/getAdmin")
	public List<Admin> getAdmin(){
		return adminservice.getAdmin();
		}

}
