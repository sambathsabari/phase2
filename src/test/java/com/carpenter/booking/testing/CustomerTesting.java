/*package com.carpenter.booking.testing;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.List;


import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.carpenter.booking.model.Customer;
import com.carpenter.booking.repository.CustomerRepository;




@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CustomerTesting {

	   @Autowired
	    CustomerRepository cusrepo;

	// post

	  @Test
      @Order(1)
	    public void testCreateCustomer() {
	        Customer cus = new Customer();
	        cus.setCustomerId(107);
	        cus.setName("raj");
	        cus.setEmailId("raj@gmail.com");
	        cus.setPassword("233");
	        cus.setCpassword("233");
	        cus.setPhoneNo("7564379754");
	        cus.setAddress("tn");
	        Customer save = cusrepo.save(cus);
	        assertNotNull(save);

	  }


	//get
	   @Test
       @Order(2)
	    public void testReadAll() {
	        List<Customer> list = cusrepo.findAll();
	        assertThat(list).size().isGreaterThan(0);
	    }

	

	// put

	  @Test
	    @Order(4)
	    public void testUpdate() {
		   Customer cus = cusrepo.findById((long) 8).get();
	        cus.setName("James");
	        cusrepo.save(cus);
	        assertNotEquals("Rahul", cusrepo.findById((long) 8).get().getName());
	    }



	   @Test

	// delete

	   @Order(5)
	    public void testDelete() {
	        cusrepo.deleteById((long) 11);
	        assertThat(cusrepo.existsById((long) 11)).isFalse();
	    }



	}




	
*/
