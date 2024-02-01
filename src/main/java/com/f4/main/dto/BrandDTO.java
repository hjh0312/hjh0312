package com.f4.main.dto;

public class BrandDTO {
   private int bnum; 
   private String storeName;
   private String tablename;
   private String name;
   private String tel1;
   private String tel2;
   private String tel3;
   private String address;
   private int area;
   private int storeAreaSales;
   private int averageSales;
   private int squareInteriorCost;
   private int interiorCost;
   private int depositAmount;
   private int education;
   private int otherCosts;
   private int franchiseAmount;
   private int total;
   private String bimage;
   private int wishlist;
   private String id;
   private int su;
   
	
public int getSu() {
	return su;
}

public void setSu(int su) {
	this.su = su;
}

public int getBnum() {
	return bnum;
}

public void setBnum(int bnum) {
	this.bnum = bnum;
}


public String getStoreName() {
	return storeName;
}


public void setStoreName(String storeName) {
	this.storeName = storeName;
}


public String getTablename() {
	return tablename;
}


public void setTablename(String tablename) {
	this.tablename = tablename;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public String getTel1() {
	return tel1;
}


public void setTel1(String tel1) {
	this.tel1 = tel1;
}


public String getTel2() {
	return tel2;
}


public void setTel2(String tel2) {
	this.tel2 = tel2;
}


public String getTel3() {
	return tel3;
}


public void setTel3(String tel3) {
	this.tel3 = tel3;
}


public String getAddress() {
	return address;
}


public void setAddress(String address) {
	this.address = address;
}


public int getArea() {
	return area;
}


public void setArea(int area) {
	this.area = area;
}


public int getStoreAreaSales() {
	return storeAreaSales;
}


public void setStoreAreaSales(int storeAreaSales) {
	this.storeAreaSales = storeAreaSales;
}


public int getAverageSales() {
	return averageSales;
}


public void setAverageSales(int averageSales) {
	this.averageSales = averageSales;
}


public int getSquareInteriorCost() {
	return squareInteriorCost;
}


public void setSquareInteriorCost(int squareInteriorCost) {
	this.squareInteriorCost = squareInteriorCost;
}


public int getInteriorCost() {
	return interiorCost;
}


public void setInteriorCost(int interiorCost) {
	this.interiorCost = interiorCost;
}


public int getDepositAmount() {
	return depositAmount;
}


public void setDepositAmount(int depositAmount) {
	this.depositAmount = depositAmount;
}


public int getEducation() {
	return education;
}


public void setEducation(int education) {
	this.education = education;
}


public int getOtherCosts() {
	return otherCosts;
}


public void setOtherCosts(int otherCosts) {
	this.otherCosts = otherCosts;
}


public int getFranchiseAmount() {
	return franchiseAmount;
}


public void setFranchiseAmount(int franchiseAmount) {
	this.franchiseAmount = franchiseAmount;
}


public int getTotal() {
	return total;
}


public void setTotal(int total) {
	this.total = total;
}


public String getBimage() {
	return bimage;
}


public void setBimage(String bimage) {
	this.bimage = bimage;
}


public int getWishlist() {
	return wishlist;
}


public void setWishlist(int wishlist) {
	this.wishlist = wishlist;
}


public String getId() {
	return id;
}


public void setId(String id) {
	this.id = id;
}


	public String getAllHp() {
	      if (tel1 == null) return "전화없음";
	      return tel1+"-"+tel2+"-"+tel3;
    }
 
}

//CREATE TABLE brand (
//	    bnum number primary key,
//	    storeName VARCHAR(100) NOT NULL,
//	    tablename VARCHAR(100) NOT NULL,
//		su NUMBER NOT NULL,
//	    name VARCHAR(100) NOT NULL,
//	    tel1 VARCHAR(100) NOT NULL,
//	    tel2 VARCHAR(100) NOT NULL,
//	    tel3 VARCHAR(100) NOT NULL,
//	    address VARCHAR(100) NOT NULL,
//	    area number NOT NULL,
//	    storeAreaSales number NOT NULL,
//	    averageSales number NOT NULL,
//	    squareInteriorCost number NOT NULL,
//	    interiorCost number NOT NULL,
//	    DepositAmount number NOT NULL,
//	    education number NOT NULL,
//	    OtherCosts number NOT NULL,
//	    FranchiseAmount number NOT NULL,
//	    total number NOT NULL,
//	    bimage VARCHAR(100) NOT NULL,
//	    wishlist number,
//	    id VARCHAR(100) NOT NULL
//	);
//        
//       create sequence brand_seq;


