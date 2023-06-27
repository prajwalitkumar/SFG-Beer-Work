package com.sfgbeerwork.BeerOrder.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.sfgbeerwork.BeerOrder.model.BeerDto;
import com.sfgbeerwork.BeerOrder.model.CustomerDto;

@Service
public class BeerServiceImpl implements BeerService {

	@Override
	public BeerDto getBeerById(UUID beerId) {
		
		return BeerDto.builder()
				.id(UUID.randomUUID())
				.beerName("ASKA 40")
				.beerStyle("Local")
				.build() ;
	}

	@Override
	public CustomerDto getCustomerById(UUID customerId) {
		return CustomerDto.builder()
				.id(UUID.randomUUID())
				.name("PKD").build();
	}

}
