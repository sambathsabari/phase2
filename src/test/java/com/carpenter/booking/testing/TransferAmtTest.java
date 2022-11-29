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


import com.carpenter.booking.model.TransferAmt;
import com.carpenter.booking.repository.TransferAmtRepository;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TransferAmtTest {

	
	
	 @Autowired
	    public TransferAmtRepository repo;





	  @Test
	   @Order(1)
	    public void testCreateTransferAmt() {
	       TransferAmt ta=new TransferAmt();
	        ta.setEmail("abc@gmail.com");
	        ta.setName("abc");
	        ta.setBankName("Indian bank");
	        ta.setAccNo("342345645");
	        ta.setIfscCode("ind43565");
	        ta.setService("wood decor");
	        ta.setAmt(20000);
	        TransferAmt transfer= repo.save(ta);
	        assertNotNull(transfer);

}

	  
	//get
	   @Test
	  @Order(2)
	    public void testReadAll() {
	        List< TransferAmt> list = repo.findAll();
	        assertThat(list).size().isGreaterThan(0);
	    }  
	  

}
*/
