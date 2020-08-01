import java.util.*;
class Power{
    public static void main(String[] args){
        int base, exp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        base = sc.nextInt();
        System.out.println("Enter the digit");
        exp = sc.nextInt();
        if(base<0 || exp<0){
            System.out.println("Invalid Input");
        }
        else{
            long result =1 ;
            while(exp!=0){
                result *=base;
                --exp;
            }
            System.out.println(result);
        }
    }
}