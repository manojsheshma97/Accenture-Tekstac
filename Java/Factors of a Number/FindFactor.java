import java.util.*;
import java.lang.Math;
class FindFactor{
    public static void main(String[] args){
        int n,x;
        //StringJoiner joiner = new StringJoiner(", ");
        Scanner sc = new Scanner(System.in);
        x=sc.nextInt();
        n=Math.abs(x);
        if(n==0){
            System.out.println("No Factors");
        }
        else if(n<0 || n>0){
            for(int i=1;i<=n;i++){
                if(n%i==0){
                    //joiner.add(String.valueOf(i));
                    //String out = joiner.toString();
                    System.out.print(i);
                    if(n==i)
                        System.out.print("");
                    else
                        System.out.print(", ");
                }
            }
        }
    }
}