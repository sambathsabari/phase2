package com.carpenter.booking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.carpenter.booking.model.Booking;

@Repository
public interface BookingRepository extends JpaRepository<Booking,Long> {

}
