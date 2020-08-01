import java.util.*;
class ReverseNumber{
    public static void main(String args[]){
        int num, rev=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number:");
        num = sc.nextInt();
        if(num<0){
            System.out.println("Number should be positive");
        }
       // else if(num==0){
       //     System.out.println("Outputis:0");
       // }
        else{
            while(num!=0){
                int digit = num%10;
                rev = rev*10 +digit;
                num/=10;
            }
            System.out.println("Output is:"+rev);
        }
    }
}