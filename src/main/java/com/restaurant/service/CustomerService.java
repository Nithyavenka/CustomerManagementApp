package com.restaurant.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restaurant.dao.ICustomerRepo;
import com.restaurant.model.CustomerInfo;

@Service
public class CustomerService implements ICustomerService {

	@Autowired
	private ICustomerRepo repo;

	@Override
	public void saveCustomer(CustomerInfo customer) {
		repo.save(customer);
	}

	@Override
	public void deleteCustomer(int id) {
		repo.deleteById(id);

	}

}
