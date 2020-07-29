using System;
using System.Linq;

class Program{
    static void Main(string[] args){
        Console.WriteLine("Enter a string");
        String sen=Console.ReadLine();
        Console.WriteLine(string.Join(" ", sen.Split(' ').Reverse()));
    }
}