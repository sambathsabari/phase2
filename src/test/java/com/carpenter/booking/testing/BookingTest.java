/*package com.carpenter.booking.testing;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.carpenter.booking.model.Booking;
import com.carpenter.booking.repository.BookingRepository;


@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class BookingTest {

	
	
	 @Autowired
	    BookingRepository bookingrepo;

	// post

	  @Test
      @Order(1)
	    public void testCreateBooking() {
		  Booking book = new Booking();
		  book.setId(2);
		  book.setEmail("abilash@gmail.com");
		  book.setName("Abilash");
		  book.setService("Wood");
		  book.setPhoneNo("6757468754");
		  book.setModeOfPay("SBI");
		  book.setAccNo("5476798787");
		  book.setIfscCode("SBI9876577");
		  book.setRefId("oliver@gmail.com");
	      Booking save = bookingrepo.save(book);
	      assertNotNull(save);
	  }

	  

		//get
		   @Test
	       @Order(2)
		    public void testReadAll() {
		        List<Booking> list = bookingrepo.findAll();
		        assertThat(list).size().isGreaterThan(0);
		    }
		   

		  


	
}
*/