using System; 
using System.Collections.Generic; 
using System.Linq; 
using System.Text;
using System.Threading.Tasks;

namespace ProgFundamentals12 //DO NOT CHANGE the name of namespace
{
    public class Program //DO NOT CHANGE the name of class 'Program' 
    { 

        public static void Main(string[] args) //DO NOT CHANGE 'Main' Signature 
        { 
            int rows,cols,i,j; 
            Console.Write("Number of Rows:"); 
            rows=Convert.ToInt32(Console.ReadLine());
            Console.Write("Number of Symbols:");
            cols=Convert.ToInt32(Console.ReadLine()); 
            for(i=0;i<rows;i++){
                for(j=0;j<cols;j++){ 
                    Console.Write("/\\");
                }
                if(i!=rows-1){
                    Console.WriteLine();
                    Console.Write("|");
                    for(int k=0;k<2*cols-2;k++){
                        Console.Write(" ");
                    }
                    Console.WriteLine("|");
                }
            } 
        } 
    }
}