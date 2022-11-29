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
@Table(name="booking_table")
public class Booking {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@NotNull
    @Size(min = 2, message = "please enter the  data ")
	@Column
	private String email;
	@NotNull
    @Size(min = 2, message = "please enter the  data ")
	@Column
	private String name;
	@NotNull
    @Size(min = 2, message = "please enter the  data ")
	@Column
	private String phoneNo;
	@NotNull
    @Size(min = 2, message = "please enter the  data ")
	@Column
	private String modeOfPay;
	@NotNull
    @Size(min = 2, message = "please enter the  data ")
	@Column
	private String accNo;
	@NotNull
    @Size(min = 2, message = "please enter the  data ")
	@Column
	private String ifscCode;
	@NotNull
    @Size(min = 2, message = "please enter the  data ")
	@Column
	private String service;
	@NotNull
    @Size(min = 2, message = "please enter the  data ")
	@Column
	private String refId;
	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Booking(long id, @NotNull @Size(min = 2, message = "please enter the  data ") String email,
			@NotNull @Size(min = 2, message = "please enter the  data ") String name,
			@NotNull @Size(min = 2, message = "please enter the  data ") String phoneNo,
			@NotNull @Size(min = 2, message = "please enter the  data ") String modeOfPay,
			@NotNull @Size(min = 2, message = "please enter the  data ") String accNo,
			@NotNull @Size(min = 2, message = "please enter the  data ") String ifscCode,
			@NotNull @Size(min = 2, message = "please enter the  data ") String service,
			@NotNull @Size(min = 2, message = "please enter the  data ") String refId) {
		super();
		this.id = id;
		this.email = email;
		this.name = name;
		this.phoneNo = phoneNo;
		this.modeOfPay = modeOfPay;
		this.accNo = accNo;
		this.ifscCode = ifscCode;
		this.service = service;
		this.refId = refId;
	}
	@Override
	public String toString() {
		return "Booking [id=" + id + ", email=" + email + ", name=" + name + ", phoneNo=" + phoneNo + ", modeOfPay="
				+ modeOfPay + ", accNo=" + accNo + ", ifscCode=" + ifscCode + ", service=" + service + ", refId="
				+ refId + "]";
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
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
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getModeOfPay() {
		return modeOfPay;
	}
	public void setModeOfPay(String modeOfPay) {
		this.modeOfPay = modeOfPay;
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
	public String getRefId() {
		return refId;
	}
	public void setRefId(String refId) {
		this.refId = refId;
	}

	
	
	
}
