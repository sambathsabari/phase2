package com.carpenter.booking.service;



import java.util.List;
import java.util.Optional;

import com.carpenter.booking.model.Carpenter;


public interface CarpenterService {

	public List<Carpenter> getallCarpenters();
	public Carpenter addCarpenter(Carpenter carpenter);
	public Carpenter updateCarpenter( Carpenter carpenter, long carpenterId);
	public Optional<Carpenter> getcarpenterbyid( long  carpenterId);
	public void deletecarpenterbyid( long  carpenterId);

}
