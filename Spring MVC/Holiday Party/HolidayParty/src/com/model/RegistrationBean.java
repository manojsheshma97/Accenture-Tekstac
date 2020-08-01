package com.model;
import javax.validation.constraints.*;
import org.hibernate.validator.constraints.*;

public class RegistrationBean {
    @NotEmpty
    private String userName;
    
    @NotEmpty
    @Size(min=10, max=10)
    private long contactNumber;
    
    @NotEmpty
    @Email
    private String emailId;

    @NotEmpty
    @Email
    private String confirmEmailId;
    
    private boolean status;
    
    public void setUserName(String userName){
        this.userName=userName;
    }
    public void setContactNumber(long contactNumber){
        this.contactNumber=contactNumber;
    }
    public void setEmailId(String emailId){
        this.emailId=emailId;
    }
    public void setConfirmEmailId(String confirmEmailId){
        this.confirmEmailId=confirmEmailId;
    }
    public void setStatus(boolean status){
        this.status=status;
    }
    public String getUserName(){
        return userName;
    }
    public long getContactNumber(){
        return contactNumber;
    }
    public String getEmailId(){
        return emailId;
    }
    public String getConfirmEmailId(){
        return confirmEmailId;
    }
    public boolean getStatus(){
        return status;
    }
}
