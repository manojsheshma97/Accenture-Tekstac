import java.util.*;
class Count{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n, count=0;
        System.out.println("Enter the standard: ");
        n= sc.nextInt();
        if(n<1 || n>12){
            System.out.println("Invalid Standard");
        }
        else{
            count = (n*(n+1)*(2*n+1))/6;
            System.out.println("Nila gets "+count+" pencils");
        }
    }
}