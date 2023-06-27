package com.sfgbeerwork.BeerOrder.service;

import java.util.UUID;

import com.sfgbeerwork.BeerOrder.model.BeerDto;
import com.sfgbeerwork.BeerOrder.model.CustomerDto;

public interface BeerService {

	BeerDto getBeerById(UUID beerId);

	CustomerDto getCustomerById(UUID customerId);
	

}
