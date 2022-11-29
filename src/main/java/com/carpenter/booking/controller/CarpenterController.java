package com.carpenter.booking.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carpenter.booking.model.Carpenter;
import com.carpenter.booking.service.CarpenterService;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1")

public class CarpenterController {
	
	
	
	@Autowired
	private CarpenterService carpenterservice;
	
	
	@GetMapping("/carpenters")
	public List<Carpenter> getAll(){
		return carpenterservice.getallCarpenters();
	}
	
	@PostMapping("/addcarpenter")
	public Carpenter addCarpenter(@RequestBody Carpenter carpenter) {
	 return carpenterservice.addCarpenter(carpenter);
	}
	
	
	@PutMapping("/updatecarpenter/{carpenterId}")
	public Carpenter updateCarpenter(@RequestBody Carpenter carpenter,@PathVariable long carpenterId) {
		
		return carpenterservice.updateCarpenter(carpenter, carpenterId);
	}
	
	@GetMapping("/getcarpenterbyid/{carpenterId}")
	public Optional<Carpenter> getcarpenterbyid(@PathVariable long  carpenterId){
		
		return carpenterservice.getcarpenterbyid(carpenterId);
	}
	
	@DeleteMapping("deletecarpenterbyid/{carpenterId}")
	public void deletecarpenterbyid(@PathVariable long  carpenterId) {
		
		carpenterservice.deletecarpenterbyid(carpenterId);
	}
	
	
	

}
