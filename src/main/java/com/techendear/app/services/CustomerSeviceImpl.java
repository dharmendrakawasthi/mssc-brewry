package com.techendear.app.services;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.techendear.app.model.CustomerDTO;

@Service
public class CustomerSeviceImpl implements CustomerService {

	@Override
	public CustomerDTO getCustomerById(UUID customerId) {
		return CustomerDTO.builder().id(UUID.randomUUID()).name("John Doe").build();
	}
}
