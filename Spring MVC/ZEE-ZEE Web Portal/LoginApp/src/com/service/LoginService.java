package com.service;

import com.bean.LoginBean;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
	public boolean validate(LoginBean bean){
	    boolean valido=false;
	    String name=bean.getUserName();
	    String passwado=bean.getPassword();
	    if(name.equals(passwado))
	        valido=true;
	    return valido;
	}
}
