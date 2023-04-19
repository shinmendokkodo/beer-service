package io.shinmen.beerservice.web.mappers;

import io.shinmen.beerservice.entities.Beer;
import io.shinmen.beerservice.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})

public interface BeerMapper {

    Beer toBeer(BeerDto dto);
    BeerDto toDto(Beer beer);

}
