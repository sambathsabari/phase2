package com.carpenter.booking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carpenter.booking.model.Booking;
import com.carpenter.booking.service.BookingService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("api/v1")

public class BookingController {
	
	
	@Autowired
	private BookingService bookingservice;
	
	@GetMapping("/getallBooking")
	public List<Booking> getAllBookers(){
		return bookingservice.getallBooking();
	}	
	
	
	@PostMapping("/createBooking")
	public Booking addBooking(@RequestBody Booking booking) {
		
		return bookingservice.addBooking(booking);
	}
	
	@DeleteMapping("/deletebooking/{bookingid}")
	 public void deletebookingbyid(@PathVariable long  id) {
		bookingservice.deleteBooking(id);
	 }


}
