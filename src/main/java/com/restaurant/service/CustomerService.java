package com.restaurant.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restaurant.dao.ICustomerRepo;
import com.restaurant.model.CustomerInfo;

@Service
public class CustomerService implements ICustomerService {

	@Autowired
	private ICustomerRepo repo;
	@Override
	public List<CustomerInfo> insertCustomer() {

		return (List<CustomerInfo>) repo;
	}

}
