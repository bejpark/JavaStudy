package com.edu.kosa;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;


//controller역할
public class HelloController implements Controller {
	
	private static final Logger logger = LoggerFactory.getLogger(HelloController.class);

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		logger.info("Welcome hello.jsp page move");
		
		//1
		/*
		int age = 33;
		ModelAndView mav = new ModelAndView();
		mav.addObject("name", "bj");
		mav.addObject("tel","010-1111-2222");
		mav.addObject("age",age);
		mav.setViewName("/views/hello.jsp");
		*/
		
		//2
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg","이건 스프링 mvc");
		mav.setViewName("/list"); //view 이름 설정 - /WEB-INF/jsp/ + list + .jsp
		return mav;
	}

}
