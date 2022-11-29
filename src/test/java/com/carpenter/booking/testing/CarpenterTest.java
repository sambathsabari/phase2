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
import com.carpenter.booking.model.Carpenter;
import com.carpenter.booking.repository.CarpenterRepository;


@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CarpenterTest {

	
	   @Autowired
	    CarpenterRepository carprepo;

	// post

	  @Test
     @Order(1)
	    public void testCreateCarpenter() {
		  Carpenter car = new Carpenter();
		  car.setCarpenterId(109);
		  car.setName("George");
		  car.setEmailId("george@gmail.com");
		  car.setPhoneNo("78653444323");
		  car.setService("Wood");
		  car.setPassword("666");
		  car.setAccNo("8876534345");
		  car.setIfscCode("SBI9877565");
		  Carpenter save = carprepo.save(car);
	        assertNotNull(save);

	  }


	//get
	   @Test
      @Order(2)
	    public void testReadAll() {
	        List<Carpenter> list = carprepo.findAll();
	        assertThat(list).size().isGreaterThan(0);
	    }

	

	// put

	  @Test
	    @Order(4)
	    public void testUpdate() {
		  Carpenter cus = carprepo.findById((long) 105).get();
	        cus.setName("Rahul");
	        carprepo.save(cus);
	        assertNotEquals("Rajesh", carprepo.findById((long) 105).get().getName());
	    }



	   @Test

	// delete

            @Order(5)
          public void testDelete() {
	        carprepo.deleteById((long) 106);
            assertThat(carprepo.existsById((long) 106)).isFalse();
	      }



}
*/
