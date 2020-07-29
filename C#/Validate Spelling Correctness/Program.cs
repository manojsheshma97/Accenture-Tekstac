using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ProgFundamentals3             //DO NOT CHANGE the name of namespace
{
    public class Program                 //DO NOT CHANGE the name of class 'Program'
    {
        public static void Main(string[] args)       //DO NOT CHANGE 'Main' Signature
        {
           //Implement your code here
           string w="CASABLANCA";
           for(int i=0;i<10;i++){
               Console.Write("Enter letter {0} : ",(i+1));
               if(w[i]!=Console.ReadLine()[0])
                    Console.WriteLine("The spelling is wrong");
           }

        }
    }
}
