package com.abc.services;

import org.springframework.stereotype.Service;

@Service
public class LoginService {

	public boolean isLoginValid(String userid, String password) {
		System.out.println("I am inside loginService");
		if("test".equals(userid) && "test".equals(password)) {
			return true;
		} else {
			return false;
		}
	}
	
}
