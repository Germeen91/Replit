package ReplitFrom20;

import java.util.Scanner;

public class p20 {
    public static void main(String[] args) {
        //Write  a program that takes user's first name and last name and prints in console
        //Instruct the user to enter first name: "Please Enter First Name"
        //Capture the first name
        //Instruct the user to enter last name:"Please Enter Last Name"
        //Capture last name
        //Print first name and last name
        //**Final Output:**
        //Please Enter First Name
        //Please Enter Last Name
        //Cindy Crawford

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter First Name");
        String f=sc.next();

        System.out.println("Enter Last Name");
        String l=sc.next();
        System.out.println("Your Name is "+f+" "+l);







    }
}
