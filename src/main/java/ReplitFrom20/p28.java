package ReplitFrom20;

import java.util.Scanner;

public class p28 {
    public static void main(String[] args) {
/*Write a program to take values of length and width from the user.
Based on value define whether the shape is a square or rectangle.
Examples:
Please enter the length 18
Please enter the width 16
The shape of your object is rectangle

Please enter the length 16
Please enter the width 16
The shape of your object is square*/

        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the length");
        int l= sc.nextInt();
        System.out.println("Please enter the width");
        int w=sc.nextInt();

        if (l==w){
            System.out.println("The shape of your object is square");
        }else {
            System.out.println("The shape of your object is rectangle");
        }











    }
}
