package com.sfgbeerwork.BeerOrder.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sfgbeerwork.BeerOrder.model.BeerDto;
import com.sfgbeerwork.BeerOrder.model.CustomerDto;
import com.sfgbeerwork.BeerOrder.service.BeerService;

@RequestMapping("/api/v1/beer")
@RestController
public class BeerController {
	
	private final BeerService beerService;
	
	public BeerController(BeerService beerServcie)
	{
		this.beerService = beerServcie;
	}
	
	
	@GetMapping("/{beerId}")
	public ResponseEntity<BeerDto> getBeer(@PathVariable("beerId") UUID beerId)
	{
		return new ResponseEntity<>(beerService.getBeerById(beerId),HttpStatus.OK);
	}
	@GetMapping("/cus/{customerId}")
	public ResponseEntity<CustomerDto> getCustomer(@PathVariable("customerId") UUID customerId)
	{
		return new ResponseEntity<>(beerService.getCustomerById(customerId),HttpStatus.OK);
	}

}
