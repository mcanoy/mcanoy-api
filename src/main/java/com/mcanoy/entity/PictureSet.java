package com.mcanoy.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "picture_sets")
@Data
public class PictureSet {

    @Id
    @GeneratedValue(generator="setGenerator")
    @SequenceGenerator(name="setGenerator", sequenceName="sq_picture_set_id", allocationSize=1)
    @Column(name = "PICTURE_SET_ID")
    private Long id;
    
    @Column(name = "VIEW_STATUS")
    private int status;
    
    private String name;
    
    @Column(name = "GEO_LOCATION")
    private String location;
    
    @Column(name = "CREATE_DATE")
    private Date createDate;
    
    @Column(name = "LAST_MODIFIED_DATE")
    private Date lastModifiedDate;
    
    @Column(name = "SET_THUMBNAIL")
    private String thumbnail;
    private String directory;
    //private Set<Picture> pictures;
    private Long sequence;
    private String description;
    
    @Column(name = "SET_COUNT_ROLLUP")
    private int count;
    
}
