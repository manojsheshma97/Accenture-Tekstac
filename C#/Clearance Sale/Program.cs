using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ProgFundamentals7                 //DO NOT CHANGE the name of namespace
{
    public class Program                    //DO NOT CHANGE the name of class 'Program'
    {
        public static void Main(string[] args)      //DO NOT CHANGE 'Main' Signature
        {
        //Implement your code here
        int[] arr=new int[3];
        double[] cost=new double[3];
        Console.WriteLine("Enter the name of the product : ");
        string name = Console.ReadLine();
        Console.WriteLine("Enter the price of the product : ");
        double price = Convert.ToInt64(Console.ReadLine());
        Console.WriteLine("Is the product on SALE (yes/no) : \n");
        string SALE = Console.ReadLine();
        
        for(int i=0;i<3;i++){
            Console.WriteLine("Enter number of product sold in day {0}\n",i+1);
            arr[i]=Convert.ToInt32(Console.ReadLine());
            Console.WriteLine();
            if(SALE =="yes"){
                double temp = (price *(1-0.07));
                price =temp;
                cost[i]=(temp*arr[i]);
            }
            else{
                cost[i]=price*arr[i];
            }
        }
        Console.WriteLine(name);
        for(int i=0;i<3;i++){
            Console.WriteLine("Day {0} sales total : {1}",i+1,cost[i]);
        }
        }
    }
}
