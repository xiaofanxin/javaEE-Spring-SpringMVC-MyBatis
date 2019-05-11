package com.fanxin.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class FirstController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", "这是我第一个Spring MVC 程序！！");
		mav.setViewName("/WEB-INF/jsp/first.jsp");
		
		return mav;
	}
	
}
