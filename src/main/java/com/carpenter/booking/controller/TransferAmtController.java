package com.carpenter.booking.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carpenter.booking.model.TransferAmt;
import com.carpenter.booking.service.TransferAmtService;

@CrossOrigin(origins = "http://localhost:4200")

@RestController
@RequestMapping("/api/v1")

public class TransferAmtController {
	
	
	@Autowired
	private TransferAmtService transferservice;
	
	
	@GetMapping("/getallTransfer")
	public List<TransferAmt> getallTransaction(){
		return transferservice.getallTransaction();
	}
	
	@PostMapping("/addTransferAmt")
	public TransferAmt addAmtdetail(@RequestBody TransferAmt transfer) {
		
		return transferservice.addTransferAmt(transfer);
	}

}
