using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ProgFundamentals5              //DO NOT CHANGE the name of namespace
{
    public class Program                //DO NOT CHANGE the name of class 'Program'
    {
        public static void Main(string[] args)        //DO NOT CHANGE 'Main' Signature
        {
            //Implement your code here
            int english;
            int maths;
            int lang;
            Console.WriteLine("Enter English marks :");
            english=Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Enter Math marks :");
            maths=Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Enter Language marks :");
            lang=Convert.ToInt32(Console.ReadLine());
            if(english<0 || maths<0 || lang<0){
                Console.WriteLine("Mark cannot be less than 0");
            }
            else{
                Console.WriteLine("English Grade : {0}",checkMarks(english));
                Console.WriteLine("Math Grade : {0}", checkMarks(maths));
                Console.WriteLine("Language Grade : {0}",checkMarks(lang));
            }
        }
        public static string checkMarks(int marks){
            string m=null;
            if(marks>=80 && marks<=100){
                m= "A+";
            }
            if(marks>=60 && marks<80){
                m= "A";
            }
            if(marks>=40 && marks<60){
                m= "B";
            }
            if(marks>=0 && marks<40){
                m= "FAIL";
            }
            if(marks<0){
                m= "Mark cannot be less than 0";
            }
            return m;
        }
    }
}
