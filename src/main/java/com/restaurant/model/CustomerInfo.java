package com.restaurant.model;

import org.antlr.v4.runtime.misc.NotNull;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Customer")
public class CustomerInfo {

	@Id
	@Column(name = "Id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "CustomerName")
	@NotNull
	private String customerName;
	@Column(nullable = false)
	private String userName;
	@Column(nullable = false)
	private String password;
	@Column(nullable = false)
	private String email;
	@Column(nullable = false)
	private int phoneNo;
	private String address;

	public CustomerInfo() {
		super();
		System.out.println("Customer bean is created zero param created");
	}

	public CustomerInfo(String customerName, String userName, String password, String email, int phoneNo,
			String address) {

		this.customerName = customerName;
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.phoneNo = phoneNo;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public String getCustomerName() {
		return customerName;
	}

	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}

	public String getEmail() {
		return email;
	}

	public int getPhoneNo() {
		return phoneNo;
	}

	public String getAddress() {
		return address;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "CustomerInfo [id=" + id + ", customerName=" + customerName + ", userName=" + userName + ", password="
				+ password + ", email=" + email + ", phoneNo=" + phoneNo + ", address=" + address + "]";
	}


}
