using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Methods3               //DO NOT Change namespace name
{
    public class Program             //DO NOT Change class 'Program' name
    {
        public static void Main(string[] args)       //DO NOT Change 'Main' method Signature
        {
           //Implement your code here
           Console.WriteLine("Enter Policy type");
           string type = Console.ReadLine();
           Console.WriteLine("Enter age");
           int age=System.Convert.ToInt32(Console.ReadLine());;
           double p=GetPremiumAmount(age,type);
           
           if(type=="Property" && p!=0){
               Console.WriteLine("The premium amount for your {0} policy is Rs.{1}",type,p);
           }
           else if(type=="Health" && p!=0){
               Console.WriteLine("The premium amount for your {0} policy is Rs.{1}",type,p);
           }
           else{
               Console.WriteLine("Invalid Input");
           }
        }
        

         //Implement methods here. Keep the method 'public' and 'static'
         public static double GetPremiumAmount(int age,string policytype){
             double premium;
             if(policytype=="Property"){
                 if(age<=5 && age>0){
                     premium=5000;
                 }
                 else if(age>5 &&age<=20){
                     premium=10000;
                 }
                 else{
                     premium=0;
                 }
             }
             else{
                 if(age>0 &&age<=30){
                     premium=1000;
                 }
                 else if(age>30 && age<=50){
                     premium=3000;
                 }
                 else{
                     premium=0;
                 }
             }
             
             return premium;
         }
    }
}
