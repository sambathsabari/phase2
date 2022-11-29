package com.carpenter.booking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.carpenter.booking.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {

	

	

}
