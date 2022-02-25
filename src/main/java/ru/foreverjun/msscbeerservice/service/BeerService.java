package ru.foreverjun.msscbeerservice.service;

import ru.foreverjun.msscbeerservice.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getById(UUID beerId);

    BeerDto saveNewBear(BeerDto beerDto);

    BeerDto updateBearById(UUID beerId, BeerDto beerDto);
}
