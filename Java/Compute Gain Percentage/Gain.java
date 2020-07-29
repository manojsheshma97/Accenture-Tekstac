import java.util.*;
class Gain{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sp,cp,rep,p,fin;
        double pp;
        System.out.println("Price of old scooter:");
        cp = sc.nextInt();
        System.out.println("The amount spent for repair");
        rep=sc.nextInt();
        System.out.println("Sold Price:");
        sp=sc.nextInt();
        fin = cp+rep;
        if(sp<=0 || rep<0 || cp<=0){
            System.out.println("Incorrect Inputs");
        }
        else if(sp>fin){
            p=sp-fin;
            pp=p*100.0/fin;
            System.out.println("Gain percentage is "+String.format("%.2f",pp));
        }
        else if(sp<fin){
            System.out.println("Unable to calculate Gain Percentage");
            
        }
        
    }
}