package com.techendear.app.controllers;

import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techendear.app.model.CustomerDTO;
import com.techendear.app.services.CustomerService;

@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {

	private CustomerService customerService;
	
	public CustomerController(CustomerService customerService) {
		this.customerService = customerService;
	}

	@GetMapping("/{customerId}")
	public ResponseEntity<CustomerDTO> getCustomerById(@PathVariable("customerId") UUID customerId) {
		return new ResponseEntity<>(this.customerService.getCustomerById(customerId), HttpStatus.OK);
	}
}
