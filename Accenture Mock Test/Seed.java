import java.util.Scanner;

public class Main{
    
    public static void main(String[] args){
        
        Scanner sc=new Scanner(System.in);
        
        //Fill the code heresc.n
        
        String str=sc.nextLine();
       
        // **************************Checking length******************
       if(str.length()==12) {
    	   
    	   String batch=str.substring(0, 4);
    	   //**********************Checking batch code********************8
    	   if(batch.matches("[A-Z]{2}[0-9]{1}[A-Z]{1}")) 
    	   {
    		   String str1=str.substring(4,8);
    		   if(Integer.parseInt(str1)>=2015 && Integer.parseInt(str1)<=2020) 
    		   {
    			   String str2=str.substring(8, 10);
    			   if(Integer.parseInt(str2)>=1 && Integer.parseInt(str2)<=12) 
    			   {
    				   String str3=str.substring(10,12);
    				   if(Integer.parseInt(str3)>=1 && Integer.parseInt(str3)<=31) 
    				   {
    					   
    					   System.out.println("Batch Number: "+batch);
    					   System.out.println("Expiry Date: "+str3+"/"+str2+"/"+str1);
    					   
    				   }
    				   
    				   else {
    					   System.out.println("Invalid Date");
    				   }
    				   
    			   }
    			   
    			   else {
    				   System.out.println("Invalid Month");
    			   }
    		   }
    		   
    		   else {
    			   System.out.println("Invalid Year");
    		   }
    		   
    		   
    	   }
    	   
    	   else {
    		   System.out.println("Invalid Batch Code");
    	   }

       }
       
       else {
    	   System.out.println("Invalid Input");
       }
        
        
    }
}