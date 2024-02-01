package com.f4.main.dto;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SangkwonDTO {
	
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
	
	public String extractBrandName() {
	    if (storeName == null) {
	        return ""; // 또는 다른 기본값을 지정
	    }
	    
	    //BHC가  한글로 되어있는 데이터 구조가 있어서 처리해준다 BHC로 처리해준다
	    Pattern bhcPattern = Pattern.compile("BHC|비에이치시|비에치씨|비에이치");
	    Matcher bhcMatcher = bhcPattern.matcher(storeName);
	    //족발은 띄어쓰기 되어있는거 처리 
	    Pattern jok1Pattern=Pattern.compile("가장맛있는족발|가장 맛있는 족발");
	    Matcher jok1Matcher = jok1Pattern.matcher(storeName);
	    Pattern jok2Pattern=Pattern.compile("귀한족발|귀한 족발");
	    Matcher jok2Matcher = jok2Pattern.matcher(storeName);
	    if (bhcMatcher.find()) {
	        return "BHC";
	    } else if(jok1Matcher.find()){
	    	return "가장 맛있는 족발";
	    }   else if(jok2Matcher.find()){
	    	return "귀한 족발";
	    } else {
	    }
	    // 정규표현식으로 브랜드 이름 추출
	    Pattern pattern = Pattern.compile("(BBQ|네네치킨|교촌치킨|BHC|푸라닭|도미노|파파존스|피자헛|피자스쿨|피자알볼로|원할머니|장충동왕족발|마왕족발|미소야|백소정|아비꼬|소노야|쿠우쿠우|홍콩반점|교동짬뽕|경성양꼬치|소림마라|홍짜장|본죽|두찜|박가부대|팔각도|큰맘할매순대국|빕스|애슐리|아웃백|매드포갈릭|서가앤쿡|엽기떡볶이|죠스떡볶이|이삭토스트|고봉민|두끼|범맥주|인쌩맥주|한신포차|역전할머니맥주|경성주막|맥도날드|롯데리아|버거킹|KFC|써브웨이|하노이별|포메인|생어거스틴|미스사이공|소담촌|베스킨라빈스|설빙|왕가탕후루|뚜레쥬르|파리바게트|스타벅스|이디야|메가커피|빽다방|투썸)");
	    Matcher matcher = pattern.matcher(storeName);

	             if (matcher.find()) {
	               return matcher.group(1);
	               } else {
	                   return storeName;
	         }
	}

}
