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

import com.carpenter.booking.model.Feedback;

import com.carpenter.booking.repository.FeedbackRepository;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class FeedbackTest {

	
	@Autowired
    FeedbackRepository feedbackrepo;

// post

  @Test
 @Order(1)
    public void testCreateFeedback() {
	  Feedback fb = new Feedback();
   
      fb.setCusId("abc@gmail.com");
      fb.setRefId("cde@gmail.com");
      fb.setRating(5);
      fb.setComments("good");
	  Feedback  save = feedbackrepo.save(fb);
        assertNotNull(save);

  }


//get
   @Test
  @Order(2)
    public void testReadAll() {
        List<Feedback> list = feedbackrepo.findAll();
        assertThat(list).size().isGreaterThan(0);
    }

	
}
*/
