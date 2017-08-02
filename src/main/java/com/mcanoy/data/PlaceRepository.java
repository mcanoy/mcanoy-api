package com.mcanoy.data;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.mcanoy.entity.Place;

@RepositoryRestResource(collectionResourceRel = "places", path = "places")
public interface PlaceRepository extends PagingAndSortingRepository<Place, Long> {

    
    @SuppressWarnings("unchecked")
    @Override
    @RestResource(exported = false)
    public Place save(Place set);
    
    @Override
    @RestResource(exported = false)
    public void delete(Place set);
}
