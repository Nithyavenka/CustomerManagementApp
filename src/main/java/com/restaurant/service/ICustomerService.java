package com.restaurant.service;

import com.restaurant.model.CustomerInfo;

public interface ICustomerService {

	// public List<CustomerInfo> insertCustomer();
	public void saveCustomer(CustomerInfo customer);

	public void deleteCustomer(int id);
}
