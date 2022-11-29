package com.carpenter.booking.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="carpenter_table")
public class Carpenter {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long carpenterId;
	@NotNull
    @Size(min = 2, message = "please enter the  data ")
	@Column
	private String name;
	@NotNull
    @Size(min = 2, message = "please enter the  data ")
	@Column
	private String emailId;
	@NotNull
    @Size(min = 2, message = "please enter the  data ")
	@Column
	private String password;
	@NotNull
    @Size(min = 2, message = "please enter the  data ")
	@Column
	private String phoneNo;
	@NotNull
    @Size(min = 2, message = "please enter the  data ")
	@Column
	private String service;
	@NotNull
    @Size(min = 2, message = "please enter the  data ")
	@Column
	private String accNo;
	@NotNull
    @Size(min = 2, message = "please enter the  data ")
	@Column
	private String ifscCode;
	public Carpenter() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Carpenter(long carpenterId, String name, String emailId, String password, String phoneNo, String service,
			String accNo, String ifscCode) {
		super();
		this.carpenterId = carpenterId;
		this.name = name;
		this.emailId = emailId;
		this.password = password;
		this.phoneNo = phoneNo;
		this.service = service;
		this.accNo = accNo;
		this.ifscCode = ifscCode;
	}
	@Override
	public String toString() {
		return "Carpenter [carpenterId=" + carpenterId + ", name=" + name + ", emailId=" + emailId + ", password="
				+ password + ", phoneNo=" + phoneNo + ", service=" + service + ", accNo=" + accNo + ", ifscCode="
				+ ifscCode + "]";
	}
	public long getCarpenterId() {
		return carpenterId;
	}
	public void setCarpenterId(long carpenterId) {
		this.carpenterId = carpenterId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getService() {
		return service;
	}
	public void setService(String service) {
		this.service = service;
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
	

	

	
	
	
	
	
	

}
