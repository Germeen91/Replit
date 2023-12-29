package ReplitFrom20;

import java.util.Scanner;

public class p43 {
    public static void main(String[] args) {
/*Write a program to input number "Input a number between 1-12" and when you input a number it should display
 the month using Scanner and Switch statement.
case: 1 will display January
case: 12 will display December
Anything outside of 12 will display "Invalid"
**Example Output:**
Input a number between 1-12
Invalid
**Example Output:**
Input a number between 1-12
January
```*/
        Scanner sc=new Scanner(System.in);
        System.out.println("Input a number between 1-12");
        int n=sc.nextInt();

        switch (n){
            case 1:
                System.out.println("jan");
            break;
            case 2:
                System.out.println("feb");
                break;
            case 3:
                System.out.println("mar");
                break;
            case 4:
                System.out.println("apr");
                break;
            case 5:
                System.out.println("may");
            case 6:
                System.out.println("jun");
                break;
            case 7:
                System.out.println("jul");
            break;
            case 8:
                System.out.println("aug");
                break;
            case 9:
                System.out.println("sep");
            break;
            case 10:
                System.out.println("oct");
                break;
            case 11:
                System.out.println("nov");
                break;
            case 12:
                System.out.println("dec");
                break;
            default:{
                System.out.println("invalid month");
            }


        }









    }
}
