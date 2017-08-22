package com.mcanoy.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.Data;

@Entity
@Table(name = "pictures")
@Data
public class Picture {
    
    @Id
    @GeneratedValue(generator="setGenerator")
    @SequenceGenerator(name="setGenerator", sequenceName="sq_picture_id", allocationSize=1)
    @Column(name="PICTURE_ID")
    private Long id;
    
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name="PICTURE_SET_ID")
    private PictureSet pictureSet;
    private String thumbnail;
    
    @Column(name = "PICTURE_DATE")
    private Date pictureDate;
    
    @Column(name = "CREATE_DATE")
    private Date createDate;
    
    @Column(name = "VIEW_STATUS")
    private int status;
    private String description;
    private int sequence;
    private String type;
    private String info;
    private float ratio;
    
    @Column(name = "URL_SQUARE")
    private String urlSquare;
    
    @Column(name = "URL_SMALL")
    private String urlSmall;
    
    @Column(name = "URL_MEDIUM")
    private String urlMedium;
    
    @Column(name = "URL_LARGE")
    private String urlLarge;
    
    @Column(name = "URL_ORIGINAL")
    private String urlOriginal;
    
    @Column(name = "FLICKR_ID")
    private String flickrId;
    
   


    @Transient
    public boolean getIsNew() {
        if(createDate == null) {
            return false;
        }

        long day = 1000 * 3600 *24; //one day

        long timeAgo = 21 * day; //3 weeks ago

        return createDate.getTime() > (new Date().getTime() - timeAgo);
    }
}
