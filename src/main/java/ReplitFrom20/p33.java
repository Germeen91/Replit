package ReplitFrom20;

import java.util.Scanner;

public class p33 {
    public static void main(String[] args) {
/*Ask the user to enter any number
if a user enters a number and it is even, print "Value is even",
 after that it should check if the number is greater than 1000 it should
 say odd after that it should check if odd number is greater than 1000
it should say odd value is large otherwise odd value is just right
**Example Output: for 33**
Please enter a number
Value is odd
Odd value is just right
**Example Output: for 1200**
Please enter a number
Value is even
Even value is largeould also print even number is large otherwise even value is just right.
 if number is not even it should print number is*/

        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a number");
        int n=sc.nextInt();

        if (n%2==0){
            System.out.println("Value is even");
            if (n>1000)
            {System.out.println("Even value is large");}
            else {
                System.out.println("Even value is just right");}}


                if (n%2!=0){
            System.out.println("Value is odd");
        if (n>1000){
            System.out.println("odd value is large");
        }else {
            System.out.println("odd value is just right");
        }}






    }
}
