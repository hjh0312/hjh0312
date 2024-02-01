package com.f4.main;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.f4.main.dto.MemberDTO;
import com.f4.main.dto.SaupDTO;
import com.f4.main.service.F4Mapper;
import com.f4.main.service.SaupMapper;

@Controller
public class SaupController {

   
   @Autowired
   private SaupMapper saupmapper;
   
   @Autowired
   private F4Mapper f4mapper;

    @RequestMapping("/saup.do")
      public String sauplogin(HttpServletRequest req, Model model) {
         HttpSession session = req.getSession();
         String id = (String) session.getAttribute("loginId");
         String msg = null, url = null;
         List<SaupDTO> list = saupmapper.getSaupDetail(id);
         String accept = null;
         String view = null;
         for (SaupDTO dto : list) {
            accept = dto.getAccept();
         }
         if (accept == null) {
            MemberDTO dto = f4mapper.getReboard(id);
            model.addAttribute("name", dto.getName());
            model.addAttribute("tel", dto.getTel());
            
            msg = "브랜드 관리자 등록이 되어있지 않습니다.";
            model.addAttribute("msg", msg);
            view = "login/sauplogin";
            
         }else if(accept.equals("0")){               
            msg = "수락 대기중 입니다.";
            url = "main.do";
            req.setAttribute("msg", msg);
            req.setAttribute("url", url);
            view = "message";
            
         }else if (accept.equals("1")) {
             f4mapper.updateMember(id);
             MemberDTO dto = saupmapper.checkSa(id);
             session.setAttribute("saup", dto);
             session.setAttribute("msg", "인증완료");
             return "main";
         }else if (accept.equals("2")) {
            MemberDTO dto = f4mapper.getReboard(id);
             model.addAttribute("name", dto.getName());
             model.addAttribute("tel", dto.getTel());

             msg = "요청이 거부 되었습니다. 다시 요청해주세요";
             model.addAttribute("msg", msg);
             view = "login/sauplogin";
         }
         return view;
      }
    
   

      @RequestMapping(value = "/saup_ok.do", method = RequestMethod.POST)
      public String saup(HttpServletRequest req, Model model) {
          String msg, url;
          try {
              req.setCharacterEncoding("UTF-8");
              HttpSession session = req.getSession();
              String id = (String) session.getAttribute("loginId");
              List<SaupDTO> list = saupmapper.getSaupDetail(id);
              Map<String, String> params = new HashMap<>();
              params.put("id", id);
              
              String check = list.isEmpty() ? null : list.get(0).getAccept();

              if ("2".equals(check)) {
                 params.put("name", req.getParameter("name"));
                 params.put("place", req.getParameter("place"));
                  params.put("store", req.getParameter("store"));
                  params.put("memo", req.getParameter("memo"));
                  params.put("accept", "0");
                  saupmapper.getSaupUpdateAll(params);
              } else {
                  params.put("name", req.getParameter("name"));
                  params.put("tel", req.getParameter("tel"));
                  params.put("place", req.getParameter("place"));
                  params.put("store", req.getParameter("store"));
                  params.put("memo", req.getParameter("memo"));
                  params.put("accept", "0");

                  saupmapper.insertSaup(params);
              }

              msg = "요청 완료 되었습니다.";
              url = "main.do";
          } catch (UnsupportedEncodingException e) {
              e.printStackTrace();
              msg = "인코딩 오류가 발생했습니다. 다시 시도해 주세요.";
              url = "main.do";
          }

          req.setAttribute("msg", msg);
          req.setAttribute("url", url);
          return "message";
      }
}