package com.carpenter.booking.serviceImp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carpenter.booking.exception.ResourceNotFoundException;
import com.carpenter.booking.model.Carpenter;
import com.carpenter.booking.repository.CarpenterRepository;
import com.carpenter.booking.service.CarpenterService;


@Service
public class CarpenterImp implements CarpenterService{

	@Autowired
	private CarpenterRepository carprepository;
	
	
	@Override
	public List<Carpenter> getallCarpenters() {
		
		return carprepository.findAll();
	}

	@Override
	public Carpenter addCarpenter(Carpenter carpenter) {
		
		return carprepository.save(carpenter);
	}

	@Override
	public Carpenter updateCarpenter(Carpenter carpenter, long carpenterId) {
	
		Optional<Carpenter>carp=Optional.of(carprepository.findById(carpenterId).orElseThrow(() ->
        new ResourceNotFoundException("Carpenter","carpenterId",carpenterId)));
        
		if(carp.isPresent()) {
			Carpenter c=carp.get();
			c.setName(carpenter.getName());
			c.setPassword(carpenter.getPassword());
			c.setPhoneNo(carpenter.getPhoneNo());
			c.setIfscCode(carpenter.getIfscCode());
			c.setService(carpenter.getService());
			
			return carprepository.save(c);
		}
		else {
			return null;
		}
		
	}

	@Override
	public Optional<Carpenter> getcarpenterbyid(long carpenterId) {
		
		return Optional.of(carprepository.findById(carpenterId).orElseThrow(() ->
        new ResourceNotFoundException("Carpenter","Id",carpenterId)));
	}

	@Override
	public void deletecarpenterbyid(long carpenterId) {
		
		carprepository.deleteById(carpenterId);
	}

}
