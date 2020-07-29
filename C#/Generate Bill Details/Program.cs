using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ProgFundamentals2           //DO NOT Change namespace name
{
    public class Program              //DO NOT Change class 'Program' name
    {
        public static void Main(string[] args)    //DO NOT Change 'Main' method Signature
        {
            //Implement your code here
            Console.Write("Enter the number of pizzas bought : ");
            int x=Convert.ToInt32(Console.ReadLine());
            Console.Write("Enter the number of puffs bought : ");
            int y=Convert.ToInt32(Console.ReadLine());
            Console.Write("Enter the number of pepsi bought : ");
            int z = Convert.ToInt32(Console.ReadLine());
            int pic=x*200;
            int puc=y*40;
            int pec=z*120;
            double total=pic+puc+pec;
            double gst=total*12/100;
            double ces=total*5/100;
            int tot=(int)total;
            Console.WriteLine("Bill Details");
            Console.WriteLine();
            Console.WriteLine("Cost of Pizzas :{0}",pic);
            Console.WriteLine("Cost of Puffs  :{0}",puc);
            Console.WriteLine("Cost of Pepsis :{0}",pec);
            Console.WriteLine("GST 12% : {0}",gst);
            Console.WriteLine("CESS 5% : {0}",ces);
            Console.WriteLine("Total Price :{0}",tot);
        }
    }
}
