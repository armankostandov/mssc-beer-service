package ru.foreverjun.msscbeerservice.web.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import ru.foreverjun.msscbeerservice.web.domain.Beer;

import java.util.UUID;

public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID> {
}
