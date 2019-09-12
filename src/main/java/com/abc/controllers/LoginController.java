package com.abc.controllers;

import org.springframework.stereotype.Controller; 
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.abc.dto.LoginDto;
import com.abc.services.LoginService;

@Controller
public class LoginController {
	
	private LoginService loginService;
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView getDriverPage() {
		System.out.println("I am inside login controller");
		ModelAndView mv = new ModelAndView();
		mv.setViewName("login");
		LoginDto loginDto = new LoginDto();
		mv.addObject("loginObject", loginDto);
		return mv;
	}
	
	@RequestMapping(value="/login-process", method = RequestMethod.POST )
	public ModelAndView processLogin(LoginDto dto) {
		System.out.println("login form values : " + dto.toString());
		boolean isLoginSuccessful = 
				loginService.isLoginValid(dto.getUsername(), dto.getPassword());
		ModelAndView mv = new ModelAndView();
		if(isLoginSuccessful) {
			mv.setViewName("sample");
		} else {
			mv.setViewName("login");
			LoginDto loginDto = new LoginDto();
			mv.addObject("loginObject", loginDto);
			mv.addObject("message", "Your Login has failed. Please try again.");
		}
		return mv;
	}

	public LoginService getLoginService() {
		return loginService;
	}

	public void setLoginService(LoginService loginService) {
		this.loginService = loginService;
	}

}
