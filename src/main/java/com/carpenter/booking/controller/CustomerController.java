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
import com.carpenter.booking.model.Customer;
import com.carpenter.booking.service.CustomerService;



@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1")

public class CustomerController {
	
	
	@Autowired
	private CustomerService customerservice;
	
	@GetMapping("/getcustomers")
		public List<Customer> getAll(){
			return customerservice.getallCustomers();
		}
	
	
	    @PostMapping("/addcustomer")
	    public Customer addUser( @RequestBody Customer customer) {
		 return customerservice.addCustomer(customer);
		
	    }	 
		 
	    @PutMapping("/updatecustomer/{customerId}")
		 public Customer updateCustomer(@RequestBody Customer customer,@PathVariable long customerId) {
			 return  customerservice.updateCustomer(customer, customerId);
		
		}
	    
	    
		 @GetMapping("/getcustomerbyid/{customerId}")
		 public Optional<Customer> getcustomerbyid(@PathVariable  long  customerId){
			 
			 return customerservice.getcustomerbyid(customerId);
		 }
		 
		 
		 @DeleteMapping("/deletecustomerbyid/{customerId}")
		 public void deletecustomerbyid(@PathVariable long  customerId) {
			 customerservice.deletecustomerbyid(customerId);
		 }

}
