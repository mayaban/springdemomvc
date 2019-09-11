package com.abc.controllers;

import org.springframework.stereotype.Controller; 
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.abc.dto.LoginDto;

@Controller
public class LoginController {
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView getDriverPage() {
		System.out.println("I am inside login controller");
		ModelAndView mv = new ModelAndView();
		mv.setViewName("login");
		LoginDto loginDto = new LoginDto();
		mv.addObject("loginObject", loginDto);
		return mv;
	}

}
