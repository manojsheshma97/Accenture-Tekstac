import java.util.*;
import java.text.DecimalFormat;

class CinemaTicket{
    public static void main(String[] args){
        int nooftickets;
        char refreshment;
        int r_amt=0;
        double totalAmt=0.0;
        char coupon;
        char circle;
        
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        
        System.out.println("Enter the no of ticket:");
        nooftickets = sc.nextInt();
        if(nooftickets>=5 && nooftickets<=40){
            System.out.println("Do you want refreshment:");
            refreshment =sc.next().charAt(0);
            
            switch(refreshment){
                case 'y':r_amt=50*nooftickets;
                break;
                case 'n':r_amt=0;
                break;
                default:
                    System.out.println("Invalid Input");
                    System.exit(0);
            }
            
            System.out.println("Do you have coupon code:");
            coupon = sc.next().charAt(0);
            if(coupon!='y' && coupon!='n'){
                System.out.println("Invalid Input");
                System.exit(0);
            }
            
            System.out.println("Enter the circle:");
            circle = sc.next().charAt(0);
            if(circle!='k' && circle!='q'){
                System.out.println("Invalid Input");
                System.exit(0);
            }
            else{
                if(circle == 'k'){
                    totalAmt = nooftickets*75;
                }
                else{
                    totalAmt = nooftickets *150;
                }
                if(nooftickets>20){
                    totalAmt = totalAmt-(totalAmt*10/100);
                }
                if(coupon =='y'){
                    totalAmt = totalAmt -(totalAmt*2/100);
                }
                if(refreshment == 'y'){
                    totalAmt = totalAmt +r_amt;
                }
            }
            System.out.println("Ticket cost:"+df.format(totalAmt));
        }
        else{
            System.out.println("Minimum of 5 and Maximum of 40 Tickets");
        }
    }
}