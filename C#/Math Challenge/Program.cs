using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ProgFundamentals13                  //DO NOT CHANGE the name of namespace
{
    public class Program                       //DO NOT CHANGE the name of class 'Program'
    {
        public static void Main(string[] args)     //DO NOT CHANGE 'Main' Signature
        {
           //Implement your code here
           int n =Convert.ToInt32(Console.ReadLine());
           bool gz = true, gj=true;
           for(int i=n;i<n+10;i+=2){
               Console.WriteLine(i);
               if(i%3==0 && gj){
                    for(int j=i;j<i+15;j+=3){
                        gj=false;
                        Console.WriteLine("\t"+j);
                        if(j%4==0 && gz){
                            for(int z=j;z<j+20;z+=4){
                                gz=false;
                                Console.WriteLine("\t\t"+z);
                            }
                        }
                    }
               }
           }
        }
    }
}
