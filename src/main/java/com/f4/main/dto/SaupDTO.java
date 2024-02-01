package com.f4.main.dto;

public class SaupDTO {
   private String id;
   private String name;
   private String tel;
   private String place;
   private String store;
   private String memo;
   private String accept;
   
   public String getAccept() {
      return accept;
   }
   public void setAccept(String accept) {
      this.accept = accept;
   }
   public String getId() {
      return id;
   }
   public void setId(String id) {
      this.id = id;
   }
   public String getName() {
      return name;
   }
   public void setName(String name) {
      this.name = name;
   }
   public String getTel() {
      return tel;
   }
   public void setTel(String tel) {
      this.tel = tel;
   }
   public String getPlace() {
      return place;
   }
   public void setPlace(String place) {
      this.place = place;
   }
   public String getStore() {
      return store;
   }
   public void setStore(String store) {
      this.store = store;
   }
   public String getMemo() {
      return memo;
   }
   public void setMemo(String memo) {
      this.memo = memo;
   }
   
   
//     CREATE TABLE saup ( id VARCHAR(20) NOT NULL, name VARCHAR(100) NOT NULL, tel
//     VARCHAR(20) NOT NULL, place VARCHAR(20) NOT NULL, store VARCHAR(20) NOT NULL,
//     memo VARCHAR(1000) NOT NULL, accept VARCHAR(5), PRIMARY KEY (id) );
    
}