import java.util.*;
class IncrementCalculation{
    public static void main(String[] args) throws Exception{
        int old, sal;
        float hike;
        //float hike;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the salary");
        old=sc.nextInt();
        System.out.println("Enter the Performance appraisal rating");
        hike=sc.nextFloat();
        if(old<=0.0 || hike<1.0 || hike>5.0){
            System.out.println("Invalid Input");
        }
        else if(hike>=1.0 && hike<=3.0){
            sal=old+(old*10/100);
            System.out.println(sal);
        }
        else if(hike>=3.1 && hike<=4.0){
            sal=old+(old*25/100);
            System.out.println(sal);
        }
        else{
            sal=old+(old*30/100);
            System.out.println(sal);
        }
    }
}