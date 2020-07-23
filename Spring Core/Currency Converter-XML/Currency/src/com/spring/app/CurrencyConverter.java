package com.spring.app;

import java.util.*;
public class CurrencyConverter {
    private Map<String,String>mObj;
    public Map<String,String> getMObj(){
        return mObj;
    }
    public void setMObj(Map<String,String> mObj){
        this.mObj=mObj;
    }
    public int getTotalCurrencyValue(String str){
        StringBuffer curr=new StringBuffer();
        StringBuffer val=new StringBuffer();
        for(int i=0;i<str.length();i++){
            if(Character.isDigit(str.charAt(i)))
                val.append(str.charAt(i));
            else
                curr.append(str.charAt(i));
        }
        String ans=mObj.get(curr.toString().toUpperCase());
        int res=Integer.parseInt(val.toString())*Integer.parseInt(ans);
        return res;
    }

}
