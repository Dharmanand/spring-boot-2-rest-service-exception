package com.kd.springboot.login.service;

import org.springframework.stereotype.Service;

@Service
public class LoginService {
	
	public boolean validateUser(String userid, String password) {
        return userid.equalsIgnoreCase("kumar")
                && password.equalsIgnoreCase("1234");
    }

}
