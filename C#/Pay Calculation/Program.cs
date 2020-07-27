using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Methods4            //DO NOT Change namespace name
{
    public class Program             //DO NOT Change class 'Program' name
    {
        public static double tax;
        public static int stdRate=80;
        public static double taxPer=0.02;
        public static void Main(string[] args)          //DO NOT Change 'Main' method Signature
        {
           //Implement your code here
           Console.WriteLine("Enter the employee name");
           string name=Console.ReadLine();
           Console.WriteLine("Enter the number of hours worked");
           int time=Convert.ToInt32(Console.ReadLine());
           double pay=CalculateNetPay(time);
           Console.WriteLine("The total wages for {0} is ${1}",name,pay);
        }

        //Implement methods here. Keep the method 'public' and 'static'
        public static double GetGrossPay(int hrs){
            double val;
            if(hrs<=56 && hrs>0)
                val=hrs*stdRate;
            else
                val=(56*stdRate)+(hrs-56)*(stdRate*3/2);
            return val;
        }
        public static double CalculateTax(double gross){
            return gross*taxPer;
        }
        public static double CalculateNetPay(int hrs){
            double gPay;
            gPay=GetGrossPay(hrs);
            tax=CalculateTax(gPay);
            return gPay-tax;
        }
    }
}
