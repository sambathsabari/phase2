package com.carpenter.booking.service;

import java.util.List;


import com.carpenter.booking.model.Booking;


public interface BookingService {


	public List<Booking> getallBooking();
	public Booking addBooking(Booking booking);
	public void deleteBooking(long id);
}
