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
	
	// user ticketing search page
	@RequestMapping(value = "/search")
	public ModelAndView search(ModelAndView mv) {
		mv.setViewName("user/ticketing/search");
		return mv;
	}
	
	@RequestMapping(value = "/seat")
	public ModelAndView seat(ModelAndView mv) {
		mv.setViewName("user/ticketing/seat");
		return mv;
	}
	
	@RequestMapping(value = "/myPage")
	public ModelAndView myPage(ModelAndView mv) {
		mv.setViewName("user/myPage/home");
		return mv;
	}
	
	@RequestMapping(value = "/changeNumber")
	public ModelAndView changeNumber(ModelAndView mv) {
		mv.setViewName("user/myPage/changeNumber");
		return mv;
	}
	
	@RequestMapping(value = "/changePW")
	public ModelAndView changePW(ModelAndView mv) {
		mv.setViewName("user/myPage/changePW");
		return mv;
	}
	
	@RequestMapping(value = "/ticketList")
	public ModelAndView ticketList(ModelAndView mv) {
		mv.setViewName("user/myPage/ticketList");
		return mv;
	}
	
	@RequestMapping(value = "/terminal")
	public ModelAndView terminal(ModelAndView mv) {
		mv.setViewName("user/terminal/terminal");
		return mv;
	}
	
	@RequestMapping(value = "/qnaList")
	public ModelAndView qnaList(ModelAndView mv) {
		mv.setViewName("user/qna/list");
		return mv;
	}
	
	@RequestMapping(value = "/qnaRegister")
	public ModelAndView qnaRegister(ModelAndView mv) {
		mv.setViewName("user/qna/register");
		return mv;
	}
}
