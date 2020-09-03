package com.techendear.app.controllers;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techendear.app.model.BeerDTO;
import com.techendear.app.services.BeerService;

@RestController
@RequestMapping("/api/v1/beer")
public class BeerController {

	@Autowired
	private BeerService beerService;

	public BeerController(BeerService beerService) {
		this.beerService = beerService;
	}

	@GetMapping("/{beerId}")
	public ResponseEntity<BeerDTO> getBeer(@PathVariable UUID beerId) {
		return new ResponseEntity<>(this.beerService.getBeerById(beerId), HttpStatus.OK);
	}
}
