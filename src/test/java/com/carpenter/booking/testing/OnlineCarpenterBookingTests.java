package com.carpenter.booking.testing;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import com.carpenter.booking.OnlineCarpenterApplication;

@SpringBootTest(classes=OnlineCarpenterApplication.class)
@ContextConfiguration
class OnlineCarpenterBookingTests {

	@Test
	void contextLoads() {
	}

}
