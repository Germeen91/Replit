package ReplitFrom20;

import java.util.Scanner;

public class p22 {
    public static void main(String[] args) {
      /*  Write a program to take user name, age and mobile number
        First Output: "Enter your name"
        Second Output: "Enter your mobile number" (please use xxx-xxx-xxxx format)
        Third Output: "Enter your age"
     Output:**
        Enter your name
        Enter your mobile number```
        Enter your age
        Your name is Weqas, your age is 45 and your mobile number is 123-456-7890*/

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Name");
        String n=sc.nextLine();
        System.out.println("Enter Your mobile number");
        int mob= sc.nextInt();
        System.out.println("Enter your age");
int age= sc.nextInt();
        System.out.println("Your name is "+n+","+" Your age is "+age+" and your mobile number is "+mob);







    }
}
