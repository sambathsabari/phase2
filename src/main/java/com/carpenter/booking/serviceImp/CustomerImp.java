package com.carpenter.booking.serviceImp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carpenter.booking.exception.ResourceNotFoundException;
import com.carpenter.booking.model.Customer;
import com.carpenter.booking.repository.CustomerRepository;
import com.carpenter.booking.service.CustomerService;

@Service
public class CustomerImp implements CustomerService{

	@Autowired
	private CustomerRepository cusrepository;
	
	@Override
	public List<Customer> getallCustomers() {
		
		return cusrepository.findAll();
	}

	@Override
	public Customer addCustomer(Customer customer) {
		
		return cusrepository.save(customer);
	}

	@Override
	public Customer updateCustomer(Customer customer, long customerId) {
	
		Optional<Customer>cus=Optional.of(cusrepository.findById(customerId).orElseThrow(() ->
        new ResourceNotFoundException("Customer","Id",customerId)));
		if(cus.isPresent()) {
			Customer c=cus.get();
			c.setName(customer.getName());
			c.setEmailId(customer.getEmailId());
			c.setPassword(customer.getPassword());
			c.setCpassword(customer.getCpassword());
			c.setPhoneNo(customer.getPhoneNo());
			c.setAddress(customer.getAddress());
			return cusrepository.save(c);
		}
		else {
			return null;
		}
		
		
	}

	@Override
	public Optional<Customer> getcustomerbyid(long customerId) {
		
		return Optional.of(cusrepository.findById(customerId).orElseThrow(() ->
        new ResourceNotFoundException("Customer","Id",customerId)));
        
	}

	@Override
	public void deletecustomerbyid(long customerId) {
		
		cusrepository.deleteById(customerId);
	}

}
