/**
 * 
 */
package com.xin.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.xin.service.UserService;

/**
 * @author zhouxin
 *
 */
@Controller
@RequestMapping(value="/user")
public class UserController {
	
	@Autowired
	public UserService userService;
	
	@Autowired
	public HttpServletRequest request;
	
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView index(){
		
		return new ModelAndView("/index");
	}
	
	@RequestMapping(method = RequestMethod.POST, value="/info")
	public ModelAndView displayInfo(){
		
		ModelAndView mav = new ModelAndView("/info");
		mav.addObject("username", request.getParameter("username"));
		mav.addObject("password", request.getParameter("password"));
		return mav;
	}
	
	@RequestMapping(method = RequestMethod.GET, value= "/register")
	public ModelAndView registerList(){
		ModelAndView mav = new ModelAndView("/register");
		
		return mav;
	}
	
	@RequestMapping(method = RequestMethod.POST, value= "/register")
	public ModelAndView register(){
		ModelAndView mav = new ModelAndView("/register");
		
		return mav;
	}
}
