package com.carpenter.booking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.carpenter.booking.model.Carpenter;

@Repository
public interface CarpenterRepository extends JpaRepository<Carpenter,Long>{

}
