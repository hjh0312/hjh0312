package com.f4.main.dto;

public class WishlistDTO {
   private String id; 
   private int bnum;
   
   public String getId() {
      return id;
   }
   public void setId(String id) {
      this.id = id;
   }
   public int getBnum() {
      return bnum;
   }
   public void setBnum(int bnum) {
      this.bnum = bnum;
   }
   
   

}

//  CREATE TABLE wishlist ( id VARCHAR2(255) NOT NULL, bnum NUMBER NOT NULL );
 