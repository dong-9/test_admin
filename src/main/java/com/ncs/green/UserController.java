package com.ncs.green;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application home page.
 */
@Controller
public class UserController {

	// admin sample page
	@RequestMapping(value = "/main")
	public ModelAndView userSample(ModelAndView mv) {
		mv.setViewName("user/main/main");
		return mv;
	}

}
