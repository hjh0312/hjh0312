package com.f4.main;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.f4.main.dto.MainMiddleImageDTO;
import com.f4.main.dto.MemberDTO;
import com.f4.main.service.F4Mapper;
import com.f4.main.service.MiddelImageMapper;



@Controller
public class ProjectController {
   
	
   @Autowired
   private F4Mapper f4mapper;
   
   @Autowired
   private MiddelImageMapper middleimagemapper;
   
   @RequestMapping(value = "/", method = RequestMethod.GET)
   public String home(Model model) {
	   MainMiddleImageDTO dto = middleimagemapper.listimgae();
	   
	  model.addAttribute("middleImage", dto);
      return "main";
   }
   
   @RequestMapping("/main1.do")
   public String main1(HttpServletRequest req, Model model) {
      HttpSession session = req.getSession();
      Object id = session.getAttribute("loginId");
      MemberDTO dto2 = f4mapper.checkSa(id);
      session.setAttribute("saup", dto2);
      
      MainMiddleImageDTO dto = middleimagemapper.listimgae();
	   
	  model.addAttribute("middleImage", dto);
      return "main";
      
      
   }
   
   @RequestMapping("/main.do")
   public String main(Model model) {
	   
	   MainMiddleImageDTO dto = middleimagemapper.listimgae();
	   
		  model.addAttribute("middleImage", dto);
	      return "main";
   }
   
   @RequestMapping("/membership.do")
      public String membership() {
         return "membership/membership";
   }
   
   @RequestMapping("/ready.do")
   public String ready() {
	   return "ready";
   }
   
   @RequestMapping("/ready1.do")
   public String ready1() {
	   return "ready1";
   }
   
   @RequestMapping(value = "/membership_ok.do", method = RequestMethod.GET)
   public String membershipclose() {
      return "membership/membershipClose";
   }
   
   @RequestMapping(value = "/f4_input.do")
   public String memberinput() {
      return "membership/f4_input"; 
   }
   
   @RequestMapping(value = "/f4_input_ok.do", method = RequestMethod.POST)
   public String insertMember(HttpServletRequest req, @ModelAttribute MemberDTO dto) {
      HttpSession session = req.getSession();
      String id = req.getParameter("id");
      String name= req.getParameter("name");
      
      Map<String, String> paramMap = new HashMap<>();
         paramMap.put("id", dto.getId());
         paramMap.put("pw", dto.getPw());
         //여기서 #{id}와 #{pw}는 쿼리의 파라미터로 받을 값을 나타냅니다.
         //따라서 Java 코드에서는 이에 해당하는 값을 넘겨주어야 합니다. 
         //이때, Java 코드에서 전달하는 객체 또는 맵의 키값이 id와 pw로 일치해야 올바르게 값이 매핑됩니다.
         //따라서 Java 코드에서는 다음과 같이 값을 설정해주어야 합니다:
         
         String Ssn = dto.getSsn1() + dto.getSsn2() ;
          if (!isValidSsn(Ssn)) {
                 req.setAttribute("msg", "주민번호는 숫자만 입력할 수 있습니다.");
                 req.setAttribute("url", "f4_input.do");
                 return "forward:/WEB-INF/views/message.jsp";
             }
          Boolean isIdChecked = (Boolean) session.getAttribute("ID_CHECK_SESSION_KEY");
          if (isIdChecked == null || !isIdChecked) {
              req.setAttribute("msg", "중복 확인을 해주세요.");
              req.setAttribute("url", "f4_input.do");
              return "message";
          }
         int duplicateCount = f4mapper.checkIdAndPassword(paramMap);
         if (duplicateCount > 0) {
             req.setAttribute("msg", "이미 존재하는 아이디와 비밀번호입니다.");
             req.setAttribute("url", "f4_input.do");
             return "message";
         }
         
//         boolean idCheck = f4mapper.checkId(id);
//         if(idCheck) {
//            req.setAttribute("msg", "이미 존재하는 아이디입니다.");
//             req.setAttribute("url", "f4_input.do");
//             return "message";
//         }
         
         boolean idCheck = f4mapper.checkId(id);
         if(dto.getId().equals("admin")) {
            req.setAttribute("msg", "사용할 수 없는 아이디입니다.");
            req.setAttribute("url", "f4_input.do");
            return "message";
         }
         else if(idCheck) {
            req.setAttribute("msg", "이미 존재하는 아이디입니다.");
             req.setAttribute("url", "f4_input.do");
             return "message";
         }
         
         
      

       if (!dto.getPw().equals(dto.getConfirmpassword())) {
              req.setAttribute("msg", "비밀번호와 비밀번호 확인이 일치하지 않습니다.");
              req.setAttribute("url", "f4_input.do");
              return "message";
          }
       
       // 비밀번호 조건을 검사하고 안맞으면 회원가입 못하게
       if (!isValidPassword(dto.getPw())) {
              req.setAttribute("msg", "비밀번호는 8자리 이상이어야 하며, 특수문자를 하나 이상 포함해야 합니다.");
              req.setAttribute("url", "f4_input.do");
              return "forward:/WEB-INF/views/message.jsp";
          }
      session.removeAttribute("ID_CHECK_SESSION_KEY");
      int res = f4mapper.insertMember(dto);
      if (res>0) {
         req.setAttribute("msg", "f4 멤버가 되신걸 환영합니다!");
         req.setAttribute("url", "main.do");
         
      }else {
         req.setAttribute("msg", "다시 입력해주세요");
         req.setAttribute("url", "f4_input.do");
      }
      session.setAttribute("name", name);
      return "forward:/WEB-INF/views/message.jsp";
   }


   //비밀번호 유효성 검사 메소드 추가
   //^: 문자열의 시작을 나타냅니다.
   //(?=.*[!@#$%^&*]): 전방 탐색(lookahead)을 사용하여 특수문자가 적어도
   //하나 이상 포함되어야 함을 나타냅니다.
   //.*: 아무 문자(또는 없음)을 의미합니다.
   //[!@#$%^&*]: 특수문자 중 하나를 의미합니다.
   // [A-Za-z\\d@$!%*#?&]{8,}: 영문 대소문자, 숫자, 특정 특수문자 중에서 
   //적어도 8자 이상이어야 함을 의미합니다.

   private boolean isValidPassword(String password) {
    // 비밀번호가 8자리 이상이면서 특수문자를 포함하는지 체크
    String passwordRegex = "^(?=.*[!@#$%^&*])[A-Za-z\\d@$!%*#?&]{8,}$";
    return password.matches(passwordRegex);
   }
   
    private boolean isValidSsn(String Ssn) {
          // 전화번호가 숫자로만 이루어져 있는지 확인하는 정규표현식
          String phoneRegex = "^[0-9]*$";
          return Ssn.matches(phoneRegex);
      }
   
    @RequestMapping(value= "/idCheck.do")
    public String Idcheckok(HttpServletRequest req, @ModelAttribute MemberDTO dto) {
       String id = req.getParameter("id");
       HttpSession session = req.getSession();
       
       boolean isMember = f4mapper.checkId(id);
       
       if(dto.getId().equals("admin")) {
         session.removeAttribute("ID_CHECK_SESSION_KEY");
          req.setAttribute("msg", "사용할 수 없는 아이디입니다.");
          req.setAttribute("url", "f4_input.do");
       }
       else if (isMember) {
         session.removeAttribute("ID_CHECK_SESSION_KEY");
          req.setAttribute("msg", "사용중인 아이디입니다");
          req.setAttribute("url", "f4_input.do");
          
       }else {
         session.setAttribute("ID_CHECK_SESSION_KEY", true);
          req.setAttribute("msg", "회원가입해주세요.");
          req.setAttribute("url", "f4_input.do");
       }
       
       session.setAttribute("isMember", isMember);
       session.setAttribute("id", id);
       return "message";
       
    }
      
   @RequestMapping("/map.do")
   public String map() {
      return "map";
   }
   
   @RequestMapping(value="/searchMember.do", method=RequestMethod.GET)
   public String searchMember(HttpServletRequest req) {
      
      return "login/searchmember";
   }
   
   @RequestMapping(value="/searchMember.do", method=RequestMethod.POST)
   public String searchOkMember(HttpServletRequest req, @RequestParam Map<String, String> params) {
      //String msg = memberDAO.searchMember(params);
      
      String msg = f4mapper.searchMember(params);
      req.setAttribute("msg", msg);
      return "closeWindow";
   }

   @RequestMapping("/cencleClose.do")
   public String cencle() {
      return "cencleClose";
   }
		
		
		
		@RequestMapping("updateMember.do")
        public String update(HttpServletRequest req, @ModelAttribute MemberDTO dto) {
           
           int res = f4mapper.updateMember(dto);
           
           if(res>0) {
              req.setAttribute("msg", "회원수정성공!!");
              req.setAttribute("url", "main.do");
           }else {
              req.setAttribute("msg", "회원수정실패!!");
              req.setAttribute("url", "main.do");
           }
           return "message";
        }
		
		@RequestMapping("delete.do")
        public String delete(HttpServletRequest req) {
           HttpSession session = req.getSession();
           Object id = session.getAttribute("loginId");
           
           int res = f4mapper.deleteMember(id);
           if(res>0) {
                 req.setAttribute("msg", "탈퇴 되었습니다");
                 req.setAttribute("url", "main.do");
              }
              else {
                 req.setAttribute("msg", "탈퇴 되지 않았습니다");
                 req.setAttribute("url", "mypage.do");
              }
           session.invalidate(); 
           
           return "message";
           
            
        }
		
}