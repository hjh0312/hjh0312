package com.f4.main.dto;

public class StoreDTO {
	
	private String storeAddress;
	private String storeName;
	private double x; 
   	private double y;		   
		   
	public String getStoreAddress() {
		return storeAddress;
	}
	
	public void setStoreAddress(String storeAddress) {
		this.storeAddress = storeAddress;
	}
	
	public String getStoreName() {
		return storeName;
	}
	
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	
	public double getX() {
		return x;
	}
	
	public void setX(double x) {
		this.x = x;
	}
	
	public double getY() {
		return y;
	}
	
	public void setY(double y) {
		this.y = y;
	}
}
