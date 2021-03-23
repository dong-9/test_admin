package com.ncs.green;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application home page.
 */
@Controller
public class AdminController {

	// admin member list
	@RequestMapping(value = "/adminMemberList")
	public ModelAndView adminMemberList(ModelAndView mv) {
		mv.setViewName("admin/member/list");
		return mv;
	}

	// admin member modify
	@RequestMapping(value = "/adminMemberModify")
	public ModelAndView adminMemberModify(ModelAndView mv) {
		mv.setViewName("admin/member/modify");
		return mv;
	}

	// admin ticketing list
	@RequestMapping(value = "/adminTicketingList")
	public ModelAndView adminTicketingList(ModelAndView mv) {
		mv.setViewName("admin/ticketing/list");
		return mv;
	}

	// admin member detail
	@RequestMapping(value = "/adminQuestionsList")
	public ModelAndView adminQuestionsList(ModelAndView mv) {
		mv.setViewName("admin/questions/list");
		return mv;
	}

	// admin member detail
	@RequestMapping(value = "/adminQuestionsDetail")
	public ModelAndView adminQuestionsDetail(ModelAndView mv) {
		mv.setViewName("admin/questions/detail");
		return mv;
	}

}
