package com.mcanoy.data;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.mcanoy.entity.Picture;

@RepositoryRestResource(collectionResourceRel = "pictures", path = "pictures")
public interface PictureRepository extends PagingAndSortingRepository<Picture, Long> {

    @SuppressWarnings("unchecked")
    @Override
    @RestResource(exported = false)
    public Picture save(Picture pic);
    
    @Override
    @RestResource(exported = false)
    public void delete(Picture pic);
    
    @RestResource(path = "pictureSetId", rel = "pictureSetId")
    public Page<Picture> findByPictureSetId(@Param("set") long pictureSetId, Pageable pageable);
    
    @RestResource(path = "name", rel = "pictureSetName")
    public Page<Picture> findByPictureSetName(@Param("name") String pictureSetName, Pageable pageable);
}
