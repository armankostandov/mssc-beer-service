package ru.foreverjun.msscbeerservice.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import ru.foreverjun.msscbeerservice.service.BeerService;
import ru.foreverjun.msscbeerservice.web.model.BeerDto;

import java.util.UUID;

@RequiredArgsConstructor
@RequestMapping("/api/v1/beer")
@RestController
public class BeerController {

    private final BeerService beerService;

    @GetMapping("/{beerId}")
    public BeerDto getBeerById(@PathVariable UUID beerId) {
        return beerService.getById(beerId);
    }

    @PostMapping
    public BeerDto saveNewBeer(@Validated @RequestBody BeerDto beerDto) {
        return beerService.saveNewBear(beerDto);
    }

    @PutMapping("/{beerId}")
    public BeerDto updateBeerById(@PathVariable UUID beerId, @Validated @RequestBody BeerDto beerDto) {
        return beerService.updateBearById(beerId, beerDto);
    }
}
