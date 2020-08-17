package com.jht;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import org.springframework.web.servlet.mvc.LastModified;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

public class UserController extends AbstractController  {
	private long lastModified;

	protected ModelAndView handleRequestInternal(javax.servlet.http.HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse httpServletResponse) throws Exception {

		throw new Exception("Test aa");
//		return new ModelAndView("userlist", "user", Arrays.asList("12"));
	}


}
