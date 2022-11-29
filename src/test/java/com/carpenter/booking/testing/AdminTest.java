/*package com.carpenter.booking.testing;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.carpenter.booking.model.Admin;
import com.carpenter.booking.repository.AdminRepository;




@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class AdminTest {


	   @Autowired
	    AdminRepository adminrepo;
	
	@Test
    @Order(2)
	    public void testReadAll() {
	        List<Admin> list = adminrepo.findAll();
	        assertThat(list).size().isGreaterThan(0);
	    }
}
*/