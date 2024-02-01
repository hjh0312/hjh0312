package com.f4.main.service;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

@Service
public class getDataMapper {

	public String year(String StoreName) {
		String yr = null;
		String name = StoreName;
		if (name.equals("네네치킨")) {
        	yr = "2021";
        } else if (name.equals("귀한족발")) {
        	yr = "2021";
        } else if (name.equals("맥도날드")) {
        	yr = "2021";
        } else {
        	yr = "2022";
        }
		
		return yr;
	}
	
	public String year1(String StoreName) {
		String yr = null;
		String name = StoreName;
		if (name.equals("BBQ")) {
        	yr = "2021";
        } else if (name.equals("파파존스")) {
        	yr = "2019";
        } else if (name.equals("하노이별")) {
        	yr = "2019";
        } else if (name.equals("큰맘할매순대국")) {
        	yr = "2021";
        } else if (name.equals("버거킹")) {
        	yr = "2020";
        } else if (name.equals("롯데리아")) {
        	yr = "2021";
        } else if (name.equals("메가커피")) {
        	yr = "2021";
        } else if (name.equals("투썸")) {
        	yr = "2021";
        } else if (name.equals("가장맛있는족발")) {
        	yr = "2021";
        } else if (name.equals("하노이별")) {
        	yr = "2019";
        }  else {
        	yr = "2022";
        }
		
		return yr;
	}
	
	public Model XY(String StoreAddress, Model model) { // StoreAddress값에 따라 지도 시작 위치 좌표를 반환
		
		if (StoreAddress.equals("종로구")) {
			
			model.addAttribute("x", 126.990414851);
			model.addAttribute("y", 37.572583105);	
			
		} else if (StoreAddress.equals("중구")) {
			
			model.addAttribute("x", 126.986147976);
			model.addAttribute("y", 37.560954203);
			
		} else if (StoreAddress.equals("용산구")) {
			
			model.addAttribute("x", 126.964540921);
			model.addAttribute("y", 37.529521713);
			
		} else if (StoreAddress.equals("성동구")) {
			
			model.addAttribute("x", 127.029381915);
			model.addAttribute("y", 37.564428080);
			
		} else if (StoreAddress.equals("광진구")) {
			
			model.addAttribute("x", 127.070611);
			model.addAttribute("y", 37.539917);
			
		} else if (StoreAddress.equals("동대문구")) {
			
			model.addAttribute("x", 127.048188418);
			model.addAttribute("y", 37.580565478);
			
		} else if (StoreAddress.equals("중랑구")) {
			
			model.addAttribute("x", 127.092344156);
			model.addAttribute("y", 37.599285461);
			
		} else if (StoreAddress.equals("성북구")) {
			
			model.addAttribute("x", 127.01353558);
			model.addAttribute("y", 37.602655602);
			
		} else if (StoreAddress.equals("강북구")) {
			
			model.addAttribute("x", 127.02894018134934);
			model.addAttribute("y", 37.64290800853899);
			
		} else if (StoreAddress.equals("도봉구")) {
			
			model.addAttribute("x", 127.0323688);
			model.addAttribute("y", 37.66910208);
			
		} else if (StoreAddress.equals("노원구")) {
			
			model.addAttribute("x", 127.060514872);
			model.addAttribute("y", 37.654639037);
			
		} else if (StoreAddress.equals("은평구")) {
			
			model.addAttribute("x", 126.921284697);
			model.addAttribute("y", 37.619002224);
			
		} else if (StoreAddress.equals("서대문구")) {
			
			model.addAttribute("x", 126.955019);
			model.addAttribute("y", 37.575286);
			
		} else if (StoreAddress.equals("마포구")) {
			
			model.addAttribute("x", 126.945979636);
			model.addAttribute("y", 37.539617153);
			
		} else if (StoreAddress.equals("양천구")) {
			
			model.addAttribute("x", 126.865855008);
			model.addAttribute("y", 37.512377985);
			
		} else if (StoreAddress.equals("강서구")) {
			
			model.addAttribute("x", 126.822807);
			model.addAttribute("y", 37.56123543);
			
		} else if (StoreAddress.equals("구로구")) {
			
			model.addAttribute("x", 126.901596059);
			model.addAttribute("y", 37.485246712);
			
		} else if (StoreAddress.equals("금천구")) {
			
			model.addAttribute("x", 126.894249823);
			model.addAttribute("y", 37.455935008);
			
		} else if (StoreAddress.equals("영등포구")) {
			
			model.addAttribute("x", 126.896661369);
			model.addAttribute("y", 37.525765194);
			
		} else if (StoreAddress.equals("동작구")) {
			
			model.addAttribute("x", 126.977986269);
			model.addAttribute("y", 37.502848520);
			
		} else if (StoreAddress.equals("관악구")) {
			
			model.addAttribute("x", 126.929784067);
			model.addAttribute("y", 37.484171739);
			
		} else if (StoreAddress.equals("서초구")) {
			
			model.addAttribute("x", 127.007846159);
			model.addAttribute("y", 37.491900829);
			
		} else if (StoreAddress.equals("강남구")) {
			
			model.addAttribute("x", 127.028361548);
			model.addAttribute("y", 37.496486063);
			
		} else if (StoreAddress.equals("송파구")) {
			
			model.addAttribute("x", 127.112303042);
			model.addAttribute("y", 37.499607630);
			
		} else if (StoreAddress.equals("강동구")) {
			
			model.addAttribute("x", 127.132420621);
			model.addAttribute("y", 37.535879184);
			
		}
		
		return model;
	}
	 
	 
	public String image(String storeName) {
		 String image = null;
	 	if (storeName.equals("BBQ")) {
	 		image = "https://bbq.co.kr/images/symbols/logo-red.svg";
	 	}else if (storeName.equals("네네치킨")) {
			image ="https://nenechicken.com/17_new/images/normal_logo.png";
		}else if (storeName.equals("교촌치킨")) {
			image ="https://cdn.myfranchise.kr/images/rt/rtKa1xVDrwZDcajbPcEvqQ.png";
		}else if (storeName.equals("BHC")) {
			image ="https://cdn.myfranchise.kr/images/xr/xr2PRb8CPa7dcNnYFvKWVD.png";
		}else if (storeName.equals("푸라닭")) {
			image ="https://www.puradakchicken.com/images/h1_logo.png";
		}
		
		// 피자
		else if (storeName.equals("도미노")) {
			image ="https://cdn.myfranchise.kr/images/m4/m4HNsdsfZ8gcH1Vuz2kwXJ.png";
		}else if (storeName.equals("파파존스")) {
			image ="https://imgcdn.pji.co.kr/pc/img/220301_icon_logo.png";
		}else if (storeName.equals("피자헛")) {
			image ="https://www.pizzahut.co.kr/assets/web/img/common/logo1.png";
		}else if (storeName.equals("피자스쿨")) {
			image ="http://school.yyjaja.gethompy.com/wp-content/uploads/2015/08/logo.png";
		}else if (storeName.equals("피자알볼로")) {
			image ="https://play-lh.googleusercontent.com/_X0FLYv-qK49em2D0py973TYJJBwELSRiAAM2bXqlIQytz5xc8VhZH-5FSl26CNmzw=w240-h480-rw";
		}

		// 족발
		else if (storeName.equals("원할머니")) {
			image ="https://wonandone.co.kr/images/common/nav_bossam.png";
		}else if (storeName.equals("장충동")) {
			image ="http://www.1588-3300.co.kr/img_up/shop_pds/jcd15883300/build/option/-1607414125.png";
		}else if (storeName.equals("마왕족발")) {
			image ="https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAxNjExMTZfMTA0%2FMDAxNDc5Mjc5OTUwNjE3.j5xD-1HespPo4DDfM9-F68ZFKog6s82M1BNVlPLhQFUg.DQQlCJucfYL9hluYjHPPcS-uKkP0Kqb6Wob5d1rq5jwg.JPEG.oriental_ori%2FmosaY2faVi.jpeg&type=sc960_832";
		}else if (storeName.equals("귀한족발")) {
			image ="https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20230920_21%2F1695184292951PJr1E_JPEG%2F%25B1%25CD%25C7%25D1%25C1%25B7%25B9%25DF_%25B7%25CE%25B0%25ED.jpg";
		}else if (storeName.equals("가장맛있는족발")) {
			image ="https://gajok.kr/theme/basic/img/header/logo.png";
		}
		
        // 일식
        else if (storeName.equals("미소야")) {
			image ="https://cdn.imweb.me/thumbnail/20231219/fee3402c25a9d.png";
		}else if (storeName.equals("백소정")) {
			image ="https://cdn.imweb.me/upload/S2020031864c6cf090cff8/dfd7947227b3b.png";
		}else if (storeName.equals("아비꼬")) {
			image ="https://abiko.kr/images/common/logo.png";
		}else if (storeName.equals("소노야")) {
			image ="http://kisoya.co.kr/images/common/logo.png";
		}else if (storeName.equals("쿠우쿠우")) {
			image ="http://www.qooqoo.co.kr/eyoom/theme/company_e1/image/site_logo.png";
		}
		
        // 중식
        else if (storeName.equals("홍콩반점")) {
			image ="https://i.namu.wiki/i/IouDemV1tFheCgq5usKC0ej-zK3i5zs_JN-W0J32CUBufNpuLRPYPAMZeun7NdlmzU56I4bQY2FRxEJ2DQ9khY1uUMdgiWS_w6bLELnyxkmSccHgrXnQG-UvjMzgTMRk1KWO00He0_Lyv-QOLmTt6A.webp";
		}else if (storeName.equals("교동짬뽕")) {
			image ="https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20230214_281%2F16763397176118ToFU_JPEG%2F%25C1%25B6%25BF%25F8%25B5%25BF2%25C8%25A3%25C1%25A1%25BB%25E7%25B0%25A2%25B7%25CE%25B0%25ED_220831.jpg";
		}else if (storeName.equals("경성양꼬치")) {
			image ="http://www.xn--289a59bn50a98db7m.kr/images/common/top_logo.png";
		}else if (storeName.equals("소림마라")) {
			image ="https://search.pstatic.net/sunny/?src=https%3A%2F%2Fdnvefa72aowie.cloudfront.net%2Fjobs%2Farticle%2F25770364%2F1660609341746%2Fjob-post-2997403886.jpeg%3Fq%3D95%26s%3D1440x1440%26t%3Dinside&type=sc960_832";
		}else if (storeName.equals("홍짜장")) {
			image ="hhttps://search.pstatic.net/sunny/?src=https%3A%2F%2Fkmug.co.kr%2Fdata%2Ffile%2Fdesign%2Fthumb-data_logo_hong_600x0.jpg&type=a340";
		}
       
        // 한식
        else if (storeName.equals("본죽")) {
			image ="https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMjEwMTVfMjIy%2FMDAxNjY1ODI0Mzc4ODIw.ZFscTxq-ZBIXFoIUTz96m9xTWThWWwjM3gSwfIWYeigg.5OsYYyVGDM10H9ypbbYMuh4IE_qfyEN4H15-KY2he4Qg.PNG.aircoka%2F%25C8%25AD%25B8%25E9_%25C4%25B8%25C3%25B3_2022-10-14_203655.png&type=a340";
		}else if (storeName.equals("두찜")) {
			image ="https://www.twozzim.com/theme/basic/image/top/ci_pc.png";
		}else if (storeName.equals("박가부대")) {
			image ="https://wonandone.co.kr/images/common/nav_parkga.png?ver=1";
		}else if (storeName.equals("팔각도")) {
			image ="https://8gakdo.co.kr/php/skin/images/logo2.png";
		}else if (storeName.equals("큰맘할매순대국")) {
			image ="http://www.bkfood.kr/renew/image/logo.png";
		}
               
        // 양식
        else if (storeName.equals("빕스")) {
			image ="https://search.pstatic.net/common/?src=http%3A%2F%2Fimgnews.naver.net%2Fimage%2F018%2F2018%2F01%2F27%2F0004021034_002_20180127142850942.jpg&type=sc960_832";
		}else if (storeName.equals("애슐리")) {
			image ="https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2F20140722_129%2Fbesterik_14060214656812YvpE_JPEG%2F%25BE%25D6%25BD%25B6%25B8%25AE.jpg&type=sc960_832";
		}else if (storeName.equals("아웃백")) {
			image ="https://m.outback.co.kr/asset/images/common/sns.jpg";
		}else if (storeName.equals("매드포갈릭")) {
			image ="https://www.madforgarlic.com/resources/pc/images/common/logoB2.jpg";
		}else if (storeName.equals("서가앤쿡")) {
			image ="https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2F20140127_157%2Fninomom_1390808393253MrxRI_JPEG%2F002.jpg&type=sc960_832";
		}
        
        // 분식
        else if (storeName.equals("엽기떡볶이")) {
			image ="https://www.yupdduk.com/images/logo61.png";
		}else if (storeName.equals("죠스떡볶이")) {
			image ="http://www.jawsfood.com/images/common/logo2.png";
		}else if (storeName.equals("이삭토스트")) {
			image ="https://search.pstatic.net/sunny/?src=https%3A%2F%2Fi.pinimg.com%2F736x%2Fa5%2F60%2Fcb%2Fa560cb55b66384339deb272b5cf5338f.jpg&type=sc960_832";
		}else if (storeName.equals("고봉민")) {
			image ="http://kobongmin.com/renewal/resources/img/common/logo.png";
		}else if (storeName.equals("두끼")) {
			image ="https://www.dookki.co.kr/images/logo.png";
		}
        
        // 주점
        else if (storeName.equals("범맥주")) {
			image ="https://xn--b02b32cj6q.kr/img/common/bi.png";
		}else if (storeName.equals("인쌩맥주")) {
			image ="https://cdn.imweb.me/thumbnail/20231116/8662f0015916b.png";
		}else if (storeName.equals("한신포차")) {
			image ="https://hanshinpocha.com/wp-content/themes/hanshin/images/logo.png";
		}else if (storeName.equals("역전할머니맥주")) {
			image ="https://yeokjeonfnc.com/img/main/logo_img.png";
		}else if (storeName.equals("경성주막")) {
			image ="http://ks1929.co.kr/img/common/bi.png";
		}
	 	
        // 패스트 푸드
        else if (storeName.equals("맥도날드")) {
			image ="https://yt3.googleusercontent.com/ChubnkVEaFDJNUwTGBYSZ5dWwS-cr5O2P1jtnoYWHJ32QyIun4CVOMDydlmC4VP6qSk83F5Fng=s176-c-k-c0x00ffffff-no-rj";
		}else if (storeName.equals("롯데리아")) {
			image ="https://dimg.donga.com/wps/NEWS/IMAGE/2021/11/24/110431161.2.jpg";
		}else if (storeName.equals("버거킹")) {
			image ="https://w7.pngwing.com/pngs/814/748/png-transparent-hamburger-burger-king-restaurant-fast-food-logo-burger-king-text-orange-fast-food-restaurant-thumbnail.png";
		}else if (storeName.equals("KFC")) {
			image ="https://upload.wikimedia.org/wikipedia/commons/thumb/9/91/KFC_Logo.svg/799px-KFC_Logo.svg.png";
		}else if (storeName.equals("써브웨이")) {
			image ="https://www.subway.co.kr/images/common/logo_w.png";
		}
        
        // 아시안
        else if (storeName.equals("하노이별")) {
			image ="https://file.albamon.com/Albamon/Recruit/Photo/C-Photo-View?FN=2022\\11\\14\\JK_CO_dfkyzf22111418413343.jpg";
		}else if (storeName.equals("포메인")) {
			image ="https://www.gilnew.com/gn_home/wp-content/uploads/2015/08/%ED%8F%AC%EB%A9%94%EC%9D%B8.jpg";
		}else if (storeName.equals("생어거스틴")) {
			image ="http://www.welfareclub.net/data/img/logo.png";
		}else if (storeName.equals("미스사이공")) {
			image ="https://pds.saramin.co.kr/company/logo/201905/01/pqt4p3_2s0v-v8zyrr_logo.jpg";
		}else if (storeName.equals("소담촌")) {
			image ="http://www.sodamchon.com/img/main/logo.png";
		}
        
        // 디저트
        else if (storeName.equals("베스킨라빈스")) {
			image ="https://img.hankyung.com/photo/201809/01.17872120.1.jpg";
		}else if (storeName.equals("설빙")) {
			image ="https://i.namu.wiki/i/zjN0G-KBgikY--fWUz57v2FPh0aOfi1cgE0xrGJ-2Qv1Hs0eLGjx4T98mMK2mslT5naCw3Os4PdHLbkBl6dHuZ3WyNqyXx1InyFNxeoFqI1z6W9rMMpKDjRgWfpCvYipnr9ehukBYhV77ckZaFQmgA.svg";
		}else if (storeName.equals("왕가탕후루")) {
			image ="https://www.tlj.co.kr:7008/static/images/bread/tlj_logo_emblem.png";
		}else if (storeName.equals("뚜레쥬르")) {
			image ="https://cdn.businessplus.kr/news/photo/202301/39349_30492_5852.jpg";
		}else if (storeName.equals("파리바게트")) {
			image ="https://cdn.myfranchise.kr/images/dj/djdGt7oqWk25HkDrBv6QZK_64";
		}
        
        // 카페
        else if (storeName.equals("스타벅스")) {
			image ="https://cdn.myfranchise.kr/images/vi/vixTk2ZtrXCGnhUQLtGqyU.png";
		}else if (storeName.equals("이디야")) {
			image ="https://cdn.myfranchise.kr/uploads/vR/vREGfGV1urCLFRnLXLa5NS?w=180&h=180&f=jpg";
		}else if (storeName.equals("메가커피")) {
			image ="https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FvEsVe%2FbtqBMODlEFv%2FVBZviSXKWPUWmmPnTuUfm0%2Fimg.jpg";
		}else if (storeName.equals("빽다방")) {
			image ="https://paikdabang.com/wp-content/themes/paikdabang/assets/images/logo.png";
		}else if (storeName.equals("투썸")) {
			image ="https://mblogthumb-phinf.pstatic.net/20160606_73/ppanppane_1465209281096IMW3u_PNG/%C5%F5%BD%E6_%C7%C3%B7%B9%C0%CC%BD%BA%B7%CE%B0%ED_%282%29.png?type=w800";
		}
		return image;
	}
}
