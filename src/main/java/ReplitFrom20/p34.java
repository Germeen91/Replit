package ReplitFrom20;

import java.util.Scanner;

public class p34 {
    public static void main(String[] args) {
        /*Write a program to find the largest number among
        three distinct numbers using nested if condition
Please use Scanner class to take input from users
**Expected Output:**
Please enter 3 distinct numbers 4 5  and 14
The largest number is 14*/

        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter 3 distinct numbers");
int n1= sc.nextInt();
int n2= sc.nextInt();
int n3= sc.nextInt();

if ((n1>n2) && (n1>n3)){
    System.out.println("The largest number is "+n1);
} else if ((n2>n3) && (n2>n1)) {
    System.out.println("The largest number is "+n2);

}else System.out.println("The largest number is "+n3);


    }
}
