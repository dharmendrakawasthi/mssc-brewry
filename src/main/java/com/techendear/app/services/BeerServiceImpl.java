package com.techendear.app.services;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.techendear.app.model.BeerDTO;

@Service
public class BeerServiceImpl implements BeerService {

	@Override
	public BeerDTO getBeerById(UUID beerId) {
		return BeerDTO.builder().id(UUID.randomUUID()).beerName("Belgian Gray").beerStyle("Pale Ale").build();
	}
}
