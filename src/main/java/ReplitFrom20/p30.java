package ReplitFrom20;

import java.util.Scanner;

public class p30 {
    public static void main(String[] args) {
/* Write a program to take the month number from a user.
Provide month name to the corresponding month number
If a user provides any number that is out of month range, the program should display "Invalid"
IMPORTANT: use Scanner Class
**Example Output:**
Please enter month number 1
January
**Example Output:**
Please enter month number 33
Invalid*/

        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter month number");
        int N= sc.nextInt();

if (N==1){
    System.out.println("Jan");
} else if (N==2) {
    System.out.println("Feb");
} else if (N==3) {
    System.out.println("Mar");

} else if (N==4) {
    System.out.println("Apr");
} else if (N==5) {
    System.out.println("May");
} else if (N==6) {
    System.out.println("Jun");
} else if (N==7) {
    System.out.println("Jul");
} else if (N==8) {
    System.out.println("Aug");
} else if (N==9) {
    System.out.println("Sept");
} else if (N==10) {
    System.out.println("Oct");

} else if (N==11) {
    System.out.println("Nov");

} else if (N==12) {
    System.out.println("Dec");

}else {
    System.out.println("Invalid");
}


    }
}
