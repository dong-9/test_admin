package com.ncs.green;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application home page.
 */
@Controller
public class UserController {

	// user main page
	@RequestMapping(value = "/main")
	public ModelAndView main(ModelAndView mv) {
		mv.setViewName("user/main/main");
		return mv;
	}
	
	// user login page
	@RequestMapping(value = "/login")
	public ModelAndView login(ModelAndView mv) {
		mv.setViewName("user/login/login");
		return mv;
	}
	
	// user find id page
	@RequestMapping(value = "/findID")
	public ModelAndView findID(ModelAndView mv) {
		mv.setViewName("user/login/findID");
		return mv;
	}
	
	// user find pw page
	@RequestMapping(value = "/findPW")
	public ModelAndView findPW(ModelAndView mv) {
		mv.setViewName("user/login/findPW");
		return mv;
	}

	// user join page
	@RequestMapping(value = "/join")
	public ModelAndView join(ModelAndView mv) {
		mv.setViewName("user/join/join");
		return mv;
	}
}
