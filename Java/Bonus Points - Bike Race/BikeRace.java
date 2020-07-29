import java.util.*;
class BikeRace{
    public static void main(String[] args){
        int n, odd=1, even=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the distance travelled");
        n=sc.nextInt();
        if(n<0){
            System.out.println("Invalid Input");
        }
        else if(n==0){
            System.out.println("Your bonus points is 0");
        }
        else{
        while(n>0){
            int digit = n%10;
            odd *=digit;
            n /=10;
            
            if(n==0)
                break;
                
            digit = n%10;
            even *= digit;
            n /=10;
        }
        if(even == odd){
            System.out.println("Your bonus points is "+(2*even));
        }
        else if(even > odd)
            System.out.println("Your bonus points is "+even);
        else
            System.out.println("Your bonus points is "+odd);
    }
    }
}