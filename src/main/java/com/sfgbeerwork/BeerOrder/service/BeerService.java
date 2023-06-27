package com.sfgbeerwork.BeerOrder.service;

import java.util.UUID;

import com.sfgbeerwork.BeerOrder.model.BeerDto;

public interface BeerService {

	BeerDto getBeerById(UUID beerId);
	

}
