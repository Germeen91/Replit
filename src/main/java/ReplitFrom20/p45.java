package ReplitFrom20;

import java.util.Scanner;

public class p45 {
    public static void main(String[] args) {
/*Ask the user to enter any number from 1-7.
Based on the number define the day of the week
**Example Output:**
Input a number between 1-7
Friday
**Example Output:**
Input a number between 1-7
Invalid
```*/

        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number from 1-7");
        int m= sc.nextInt();

        switch (m){
            case 1:
                System.out.println("saturday");
            break;
            case 2:
                System.out.println("sunday");
                break;
            case 3:
                System.out.println("monday");
                break;
            case 4:
                System.out.println("tuesday");
                break;
            case 5:
                System.out.println("wednesday");
                break;
            case 6:
                System.out.println("thursday");
                break;
            case 7:
                System.out.println("friday");
                break;
            default:
                System.out.println("invalid day");


        }





    }
}
