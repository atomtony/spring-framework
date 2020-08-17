package com.jht;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;

@Controller
public class AnnControoler {

	@RequestMapping("/test")
	public ModelAndView test() {
		return new ModelAndView("userlist", "user", Arrays.asList("12"));
	}
}
