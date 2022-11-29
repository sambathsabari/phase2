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
@Table(name="cust_table")

public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long customerId;
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
	private String cpassword;
	@NotNull
    @Size(min = 2, message = "please enter the  data ")
	@Column
	private String phoneNo;
	@NotNull
    @Size(min = 2, message = "please enter the  data ")
	@Column
	private String address;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(long customerId, String name, String emailId, String password, String cpassword, String phoneNo,
			String address) {
		super();
		this.customerId = customerId;
		this.name = name;
		this.emailId = emailId;
		this.password = password;
		this.cpassword = cpassword;
		this.phoneNo = phoneNo;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", name=" + name + ", emailId=" + emailId + ", password="
				+ password + ", cpassword=" + cpassword + ", phoneNo=" + phoneNo + ", address=" + address + "]";
	}
	public long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
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
	public String getCpassword() {
		return cpassword;
	}
	public void setCpassword(String cpassword) {
		this.cpassword = cpassword;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
	}
