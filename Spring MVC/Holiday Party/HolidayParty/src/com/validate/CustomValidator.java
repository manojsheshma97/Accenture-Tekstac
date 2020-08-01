package com.validate;

import org.springframework.stereotype.Component;
import org.springframework.validation.Validator;
import org.springframework.validation.Errors;
import java.util.regex.*;

import com.model.RegistrationBean;

@Component
public class CustomValidator implements Validator{
    public boolean supports(Class<?> clazz){
        return clazz==RegistrationBean.class;
    }
    public void validate(Object arg0,Errors arg1){
        RegistrationBean rb=(RegistrationBean)arg0;
        if(rb.getStatus()!=true){
            arg1.rejectValue("status", null, "please agree to the terms and conditions");
        }
        if(rb.getUserName().length()==0){
            arg1.rejectValue("userName", null, "User Name Cannot be blank");
        }
        boolean numCheck=Pattern.matches("[0-9]{10}",Long.toString(rb.getContactNumber()));
        if(numCheck!=true){
            arg1.rejectValue("contactNumber", null, "Contact Number should be of 10 digits/Contact Number should not be blank");
        }
        String email=rb.getEmailId();
        String confirmEmail=rb.getConfirmEmailId();
        
        boolean emailCheck=Pattern.matches("\\w+[@]{1}\\w+[.]{1}\\w+", email);
        if(emailCheck!=true){
            if(email.length()==0){
                arg1.rejectValue("emailId", null, "Email ID cannot be blank");
            }
            arg1.rejectValue("emailId", null, "Should be a proper email ID format");
        }
        
        emailCheck=Pattern.matches("\\w+[@]{1}\\w+[.]{1}\\w+",confirmEmail);
        if(emailCheck!=true){
            if(email.length()==0){
                arg1.rejectValue("confirmEmailId", null, "Email ID cannot be blank");
            }
            arg1.rejectValue("confirmEmailId", null, "Should be a proper email ID format");
        }
        else if(email.equals(confirmEmail)!=true){
            arg1.rejectValue("confirmEmailId", null, "Email and Confirm Email should be same");
        }
    }
    
}
