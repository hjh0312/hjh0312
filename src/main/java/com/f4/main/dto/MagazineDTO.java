package com.f4.main.dto;

public class MagazineDTO {
   private int mnum;
   private String mtitle;
   private String reg_date;
   private String content;
   private String content2;
   private int readcount;
   private String mimage;
   private String mimage2;
   
   public int getMnum() {
      return mnum;
   }
   public void setMnum(int mnum) {
      this.mnum = mnum;
   }
   public String getMtitle() {
      return mtitle;
   }
   public void setMtitle(String mtitle) {
      this.mtitle = mtitle;
   }
   public String getReg_date() {
      return reg_date;
   }
   public void setReg_date(String reg_date) {
      this.reg_date = reg_date;
   }
   public String getContent() {
      return content;
   }
   public void setContent(String content) {
      this.content = content;
   }
   public String getContent2() {
      return content2;
   }
   public void setContent2(String content2) {
      this.content2 = content2;
   }
   public int getReadcount() {
      return readcount;
   }
   public void setReadcount(int readcount) {
      this.readcount = readcount;
   }
   public String getMimage() {
      return mimage;
   }
   public void setMimage(String mimage) {
      this.mimage = mimage;
   }
   public String getMimage2() {
      return mimage2;
   }
   public void setMimage2(String mimage2) {
      this.mimage2 = mimage2;
   }   
}

//create table magazine( 
//mnum number primary key,
//mtitle varchar2(100),
//reg_date varchar2(10) not null,
//content varchar2(3000) not null,
//content2 varchar2(3000) not null,
//readcount number default 0, 
//mimage varchar2(100),
//mimage2 varchar2(100));
//
//create sequence magazine_seq;