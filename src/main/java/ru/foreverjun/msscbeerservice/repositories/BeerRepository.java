package ru.foreverjun.msscbeerservice.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import ru.foreverjun.msscbeerservice.domain.Beer;

import java.util.UUID;

public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID> {
}
