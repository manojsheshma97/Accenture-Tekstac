using System;

public class Program
{
    public static void Main(string[] args)
    {
        //Implement code here
        Console.WriteLine("Enter the number of teams:");
        int n=Convert.ToInt32(Console.ReadLine());
        int[] att = new int[n];
        for(int i=0;i<n;i++){
            Console.WriteLine("Number of attempts for team {0}:",(i+1));
            att[i]=Convert.ToInt32(Console.ReadLine());
        }
        int[][] score = new int[n][];
        for(int i=0;i<n;i++){
            Console.WriteLine("Enter the score for team {0}:",(i+1));
            int s=att[i];
            score[i]=new int[s];
            for(int j=0;j<s;j++){
                int val=Convert.ToInt32(Console.ReadLine());
                score[i][j]=val;
            }
        }
        Console.WriteLine();
        Console.WriteLine("Score Report");
        Console.WriteLine();
        int tot=0;
        for(int i=0;i<n;i++){
            Console.WriteLine("Team {0}:",(i+1));
            for(int j=0;j<score[i].Length;j++){
                Console.WriteLine("Attempt {0} Score {1}",(j+1),score[i][j]);
                Console.WriteLine();
                tot+=score[i][j];
            }
            Console.WriteLine("Total Score:{0}",tot);
            Console.WriteLine();
            tot=0;
        }
    }
}