using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ProgFundamentals11            //DO NOT CHANGE the name of namespace
{
    public class Program                //DO NOT CHANGE the name of class 'Program'
    {
        public static void Main(string[] args)   //DO NOT CHANGE 'Main' Signature
        {
            //Implement code here
            int b=0,d=0,t=0;
            string p="";
            for(int i=0;i<5;i++){
                Console.WriteLine("Boy Name : ");
                string s=Console.ReadLine();
                int u=1;
                if(s.Equals(p))
                    u++;
                if(s.Equals("Daisy"))
                    d+=u;
                else if(s.Equals("Bill"))
                    b+=u;
                else 
                    t+=u;
                p=s;
            }
            Console.WriteLine("Bill Score : "+b);
            Console.WriteLine("Tommy Score : "+t);
            Console.WriteLine("Daisy Score : "+d);
        }
    }
}
