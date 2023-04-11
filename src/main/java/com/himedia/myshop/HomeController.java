package com.himedia.myshop;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;



/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
//	@RequestMapping("/main/main.do")
//	public ModelAndView main(HttpServletRequest request, HttpServletResponse response) throws Exception{
//		
//		ModelAndView mav=new ModelAndView();
//		String viewName=(String)request.getAttribute("viewName");
//		mav.setViewName(viewName);
//		System.out.println(viewName);
//		
//		return mav;
//	}
	
	@RequestMapping("/main/main.do")
	public String main(HttpServletRequest request, HttpServletResponse response) throws Exception{
		
//		ModelAndView mav=new ModelAndView();
//		String viewName=(String)request.getAttribute("viewName");
//		mav.setViewName(viewName);
		System.out.println("ㅋㅋㅋㅋㅋㅋㅋㅋㅋ");
		
		return "/main/main2";
	}
	
}
