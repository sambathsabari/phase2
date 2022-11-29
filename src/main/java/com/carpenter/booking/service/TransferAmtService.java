package com.carpenter.booking.service;

import java.util.List;


import com.carpenter.booking.model.TransferAmt;


public interface TransferAmtService {
	public List<TransferAmt> getallTransaction();
	public TransferAmt addTransferAmt(TransferAmt transfer);
	public TransferAmt getAllTransactionsById( long id);


}
