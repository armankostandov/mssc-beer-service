package ru.foreverjun.msscbeerservice.web.mappers;

import org.mapstruct.Mapper;
import ru.foreverjun.msscbeerservice.domain.Beer;
import ru.foreverjun.msscbeerservice.web.model.BeerDto;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    BeerDto beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDto dto);
}
