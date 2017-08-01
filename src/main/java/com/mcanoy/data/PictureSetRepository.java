package com.mcanoy.data;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.mcanoy.entity.PictureSet;

@RepositoryRestResource(collectionResourceRel = "pictureSets", path = "pictureSets")
public interface PictureSetRepository extends PagingAndSortingRepository<PictureSet, Long> {

    @SuppressWarnings("unchecked")
    @Override
    @RestResource(exported = false)
    public PictureSet save(PictureSet set);
    
    @Override
    @RestResource(exported = false)
    public void delete(PictureSet set);
}
