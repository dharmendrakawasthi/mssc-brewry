package com.techendear.app.services;

import java.util.UUID;

import com.techendear.app.model.BeerDTO;

public interface BeerService {
	
	BeerDTO getBeerById(UUID beerId);
}
