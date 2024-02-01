package com.f4.main.dto;

public class RankDTO {
	private String storeName;
	private String imglink;
	private int count;
	
	public String getStoreName() {
		return storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	public String getImglink() {
		return imglink;
	}
	public void setImglink(String imglink) {
		this.imglink = imglink;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	
}


//CREATE TABLE Rank ( STORENAME VARCHAR(26), 
//		   IMGLINK  VARCHAR2(1024),
//		   COUNT NUMBER(38)
//		);
