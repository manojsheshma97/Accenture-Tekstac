import java.util.*;
class CelsiusConversion{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float c = sc.nextFloat();
        float F= c*(9f/5) + 32;
        System.out.println(String.format("%.1f",F));
    }
}