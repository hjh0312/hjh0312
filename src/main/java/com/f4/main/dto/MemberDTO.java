package com.f4.main.dto;

public class MemberDTO {
   private int no;
   private String id;
   private String pw;
   private String confirmpassword;
   private String name;
   private String ssn1;
   private String ssn2;
   private String tel1;
   private String tel2;
   private String tel3;
   private String email1;
   private String email2;
   private int Bnr;
   private String joindate;
   private int kind;
   
   
   public int getKind() {
      return kind;
   }
   public void setKind(int kind) {
      this.kind = kind;
   }
   public int getNo() {
      return no;
   }
   public void setNo(int no) {
      this.no = no;
   }
   public String getId() {
      return id;
   }
   public void setId(String id) {
      this.id = id;
   }
   public String getPw() {
      return pw;
   }
   public void setPw(String pw) {
      this.pw = pw;
   }
   public String getConfirmpassword() {
      return confirmpassword;
   }
   public void setConfirmpassword(String confirmpassword) {
      this.confirmpassword = confirmpassword;
   }
   public String getName() {
      return name;
   }
   public void setName(String name) {
      this.name = name;
   }
   public String getSsn1() {
      return ssn1;
   }
   public void setSsn1(String ssn1) {
      this.ssn1 = ssn1;
   }
   public String getSsn2() {
      return ssn2;
   }
   public void setSsn2(String ssn2) {
      this.ssn2 = ssn2;
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
   public String getEmail1() {
      return email1;
   }
   public void setEmail1(String email1) {
      this.email1 = email1;
   }
   public String getEmail2() {
      return email2;
   }
   public void setEmail2(String email2) {
      this.email2 = email2;
   }
   public int getBnr() {
      return Bnr;
   }
   public void setBnr(int bnr) {
      Bnr = bnr;
   }
   public String getJoindate() {
      return joindate;
   }
   public void setJoindate(String joindate) {
      this.joindate = joindate;
   }
   public String getTel() {
       if (tel1 == null) return "전화없음";
       return tel1+"-"+tel2+"-"+tel3;
    }
      
}

// member(회원가입) 테이블


//  CREATE TABLE jtm ( no number PRIMARY KEY, Id varchar(20) not null, pw
//  varchar(20) not null, name varchar(100) NOT NULL, email1 varchar(100) NOT
//  NULL, email2 varchar(100) NOT NULL, tel1 varchar(100) NOT NULL, tel2
//  varchar(100) NOT NULL, tel3 VARCHAR(100) NOT NULL, ssn1 VARCHAR(100) NOT
//  NULL, ssn2 VARCHAR(100) NOT NULL );
//  
//  alter table jtm add Bnr number;
//  
//  
//  
//  alter table jtm add ConfirmPassword varchar2(20); alter table jtm add
//  joindate varchar2(20); create sequence jtm_seq;
//  alter table jtm add kind number;
 
 