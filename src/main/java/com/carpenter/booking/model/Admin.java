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
@Table(name="admin_tbl")
public class Admin {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long adminId;
	@NotNull
    @Size(min = 2, message = "please enter the  data ")
	@Column
	private  String userName;
	@NotNull
    @Size(min = 2, message = "please enter the  data ")
	@Column
	private String password;
	
	
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Admin(long adminId, String userName, String password) {
		super();
		this.adminId = adminId;
		this.userName = userName;
		this.password = password;
	}
	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", userName=" + userName + ", password=" + password + "]";
	}
	public long getAdminId() {
		return adminId;
	}
	public void setAdminId(long adminId) {
		this.adminId = adminId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
}
