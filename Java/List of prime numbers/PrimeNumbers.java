import java.util.*;
class PrimeNumbers{
    public static void main(String[] args){
        int a,b,i,j,flag;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        if(a<b && a>0 && b>0){
            for(i=a;i<=b;i++){
               if(i==1 || i==0)
                    continue;
                flag=1;
                for(j=2;j<=i/2;++j){
                    if(i%j==0){
                        flag=0;
                        break;
                    }
                }
                if(flag==1)
                    System.out.print(i+" ");
            }
        }
        else{
            System.out.println("Provide valid input");
        }
    }
}