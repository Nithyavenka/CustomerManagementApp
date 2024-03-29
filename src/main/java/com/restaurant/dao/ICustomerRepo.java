package com.restaurant.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restaurant.model.CustomerInfo;

public interface ICustomerRepo extends JpaRepository<CustomerInfo, Integer> {

}
