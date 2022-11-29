package com.carpenter.booking.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carpenter.booking.model.Admin;
import com.carpenter.booking.repository.AdminRepository;
import com.carpenter.booking.service.AdminService;



@Service
public class AdminImp implements AdminService {

	
	@Autowired
	private AdminRepository adminrepo;
	
	@Override
	public List<Admin> getAdmin() {
		
		return adminrepo.findAll();
	}

}
