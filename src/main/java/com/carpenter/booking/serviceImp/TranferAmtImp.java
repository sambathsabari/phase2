package com.carpenter.booking.serviceImp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carpenter.booking.model.TransferAmt;
import com.carpenter.booking.repository.TransferAmtRepository;
import com.carpenter.booking.service.TransferAmtService;

@Service
public class TranferAmtImp implements TransferAmtService{

	
	
	@Autowired
	private TransferAmtRepository transferepo;
	
	@Override
	public List<TransferAmt> getallTransaction() {
		
		return transferepo.findAll();
	}
	
	




	@Override
	public TransferAmt addTransferAmt(TransferAmt transfer) {
		
		return transferepo.save(transfer);
	}






	@Override
	public TransferAmt getAllTransactionsById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
