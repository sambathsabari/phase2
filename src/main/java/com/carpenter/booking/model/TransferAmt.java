package com.carpenter.booking.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="transferAmt_tble",uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class TransferAmt {


    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    @Column
    private String email;
    @Column
    private String name;
    @Column
    private String bankName;
    @Column
    private String accNo;
    @Column
    private String ifscCode;
    @Column
    private String service;
    @Column
    private int amt;
	public TransferAmt() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TransferAmt(int id, String email, String name, String bankName, String accNo, String ifscCode,
			String service, int amt) {
		super();
		this.id = id;
		this.email = email;
		this.name = name;
		this.bankName = bankName;
		this.accNo = accNo;
		this.ifscCode = ifscCode;
		this.service = service;
		this.amt = amt;
	}
	@Override
	public String toString() {
		return "TransferAmt [id=" + id + ", email=" + email + ", name=" + name + ", bankName=" + bankName + ", accNo="
				+ accNo + ", ifscCode=" + ifscCode + ", service=" + service + ", amt=" + amt + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getAccNo() {
		return accNo;
	}
	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}
	public String getIfscCode() {
		return ifscCode;
	}
	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}
	public String getService() {
		return service;
	}
	public void setService(String service) {
		this.service = service;
	}
	public int getAmt() {
		return amt;
	}
	public void setAmt(int amt) {
		this.amt = amt;
	}
	
    
    
	
}
