package com.controller;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.ModelMap;
import javax.validation.Valid;
import com.model.RegistrationBean;
import com.validate.CustomValidator;
	
@Controller
public class RegistrationController {
    
    @Autowired
	private CustomValidator custValidator;
	
	@RequestMapping(value="/registerPage",method=RequestMethod.GET)
	public String registerPage(@ModelAttribute("register")RegistrationBean regbean, BindingResult result){
	    return "registrationpage";
	}
	
	@RequestMapping(value="/register", method=RequestMethod.POST)
	public String performRegistration(@Valid @ModelAttribute("register") RegistrationBean regbean, ModelMap model, BindingResult result){
	    custValidator.validate(regbean,result);
	    
	   /* String emailId=regbean.getEmailId();
	    model.addAttribute("username",username);
	    model.addAttribute("emailId",emailId);
	    */
	    if(result.hasErrors()){
	        return "registrationpage";
	    }
	    return "thankyou";
	}
}
