package com.mcanoy.entity;

import java.io.Serializable;
import java.util.Date;

public class BlogEntry implements Serializable {

	private static final long serialVersionUID = 1L;
	private String title;
	private String content;
	private Date lastModifiedDate;
	private String url;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getLastModifiedDate() {
		return lastModifiedDate;
	}
	public void setLastModifiedDate(Date lastUpdate) {
		this.lastModifiedDate = lastUpdate;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	
}
