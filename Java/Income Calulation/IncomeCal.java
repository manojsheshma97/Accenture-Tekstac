import java.util.*;
class IncomeCal{
    public static void main(String[] args){
        int hour;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter no of hours worked in a day:");
        hour = sc.nextInt();
        if(hour<=24 && hour>=0){
            int cal;
            cal= (hour*100)*365;
            System.out.println("Total income in a year:"+cal);
        }
        else
            System.out.println("Unable to calculate the earnings");
    }
}