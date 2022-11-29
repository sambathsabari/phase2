package com.carpenter.booking.service;

import java.util.List;
import java.util.Optional;

import com.carpenter.booking.model.Customer;



public interface CustomerService {
	
	public List<Customer> getallCustomers();
	public Customer addCustomer(Customer customer);
    public Customer updateCustomer( Customer customer, long customerId);
	public Optional<Customer> getcustomerbyid(long  customerId);
	public void deletecustomerbyid(long  customerId);

}
