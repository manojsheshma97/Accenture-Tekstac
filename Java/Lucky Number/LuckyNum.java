import java.util.*;
class LuckyNum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n,m,sum = 0;
        System.out.println("Enter the car no:");
        m = sc.nextInt();
        if(m<1000){
            System.out.println(m+" is not a valid car number");
        }
        else{
            while(m>0){
                n=m%10;
                sum=sum+n;
                m=m/10;
            }
            if(sum%3==0 || sum%5==0 || sum%7==0){
                System.out.println("Lucky Number");
            }
            else{
                System.out.println("Sorry its not my lucky number");
            }
        }
    }
}