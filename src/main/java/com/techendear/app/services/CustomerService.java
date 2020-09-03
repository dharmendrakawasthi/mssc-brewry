package com.techendear.app.services;

import java.util.UUID;

import com.techendear.app.model.CustomerDTO;

public interface CustomerService {
	CustomerDTO getCustomerById(UUID customerId);
}
