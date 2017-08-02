package com.mcanoy.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

/**
 * User: Kevin McAnoy
 * Date: Jan 24, 2010
 * Time: 8:59:32 PM
 */

@Entity
@Table(name = "places")
@Data
public class Place {
    
    private static final String PLACE_ID = "placeid";
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name=PLACE_ID)
    private Long id;
    
    private double longitude;
    private double latitude;
    private String name;
    private String address1;
    private String address2;
    private String city;
    private String state;
    
    @Column(name = "ZIP_CODE")
    private String zipCode;
    private String icon;
    private String type;
    private String neighbourhood;
    private String cuisine;
    private String description;
    private String url;
    
    @Column(name = "CREATE_DATE")
    private Date createDate;
    
    @Column(name = "LAST_MODIFIED_DATE")
    private Date lastModifiedDate;
    
    @Column(name = "LAST_VISITED_DATE")
    private Date lastVisitedDate;
    private int rating;
    
}
