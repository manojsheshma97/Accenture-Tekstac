using System;

class Matrix
{
    public static void Main(String[] args)
    {
        //Implement code here
        
        Console.WriteLine("Enter the number");
        int r=Convert.ToInt32(Console.ReadLine());
        int c=r;
        int[,] a=new int[r,c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(i>j)
                    Console.Write("-1 "); //To lower triangle
                else if(j>i)
                    Console.Write("1 ");//To upper triangle
                else
                    Console.Write(a[i,j]+" ");//Its just default = 0
            }
            Console.WriteLine();
        }
    }
}