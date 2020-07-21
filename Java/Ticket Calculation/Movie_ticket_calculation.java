1 import java.util.*;
2 import java.text.DecimalFormat;
3 
4 class CinemaTicket{
5     public static void main(String[] args){
6         int nooftickets;
7         char refreshment;
8         int r_amt=0;
9         double totalAmt=0.0;
10         char coupon;
11         char circle;
12         
13         Scanner sc = new Scanner(System.in);
14         DecimalFormat df = new DecimalFormat("0.00");
15         
16         System.out.println("Enter the no of ticket:");
17         nooftickets = sc.nextInt();
18         if(nooftickets>=5 && nooftickets<=40){
19             System.out.println("Do you want refreshment:");
20             refreshment =sc.next().charAt(0);
21             
22             switch(refreshment){
23                 case 'y':r_amt=50*nooftickets;
24                 break;
25                 case 'n':r_amt=0;
26                 break;
27                 default:
28                     System.out.println("Invalid Input");
29                     System.exit(0);
30             }
31             
32             System.out.println("Do you have coupon code:");
33             coupon = sc.next().charAt(0);
34             if(coupon!='y' && coupon!='n'){
35                 System.out.println("Invalid Input");
36                 System.exit(0);
37             }
38             
39             System.out.println("Enter the circle:");
40             circle = sc.next().charAt(0);
41             if(circle!='k' && circle!='q'){
42                 System.out.println("Invalid Input");
43                 System.exit(0);
44             }
45             else{
46                 if(circle == 'k'){
47                     totalAmt = nooftickets*75;
48                 }
49                 else{
50                     totalAmt = nooftickets *150;
51                 }
52                 if(nooftickets>20){
53                     totalAmt = totalAmt-(totalAmt*10/100);
54                 }
55                 if(coupon =='y'){
56                     totalAmt = totalAmt -(totalAmt*2/100);
57                 }
58                 if(refreshment == 'y'){
59                     totalAmt = totalAmt +r_amt;
60                 }
61             }
62             System.out.println("Ticket cost:"+df.format(totalAmt));
63         }
64         else{
65             System.out.println("Minimum of 5 and Maximum of 40 Tickets");
66         }
67     }
68 }
