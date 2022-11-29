package com.carpenter.booking.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carpenter.booking.model.Booking;
import com.carpenter.booking.repository.BookingRepository;
import com.carpenter.booking.service.BookingService;


@Service
public class BookingImp implements BookingService{

	
	@Autowired
	private BookingRepository bookingrepo;
	
	@Override
	public List<Booking> getallBooking() {
		
		return bookingrepo.findAll();
	}

	@Override
	public Booking addBooking(Booking booking) {
	
		return bookingrepo.save(booking);
	}

	@Override
	public void deleteBooking(long bookingid) {
	
		bookingrepo.deleteById(bookingid);
	}

}
