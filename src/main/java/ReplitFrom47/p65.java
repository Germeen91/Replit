package ReplitFrom47;

import java.util.Scanner;

public class p65 {
    public static void main(String[] args) {

/*Write a for loop that will print out a series of numbers starting
 at one less than x and ending at 0.
Sample input/outputs:
In: 7
6 5 4 3 2 1 0*/

        Scanner sc =new Scanner(System.in);
        System.out.println("In : ");
        int x= sc.nextInt();

        for (int i=(x-1) ; i>=0; i--){
            System.out.print(i+" ");

        }

////////////////////////////
        Scanner scn=new Scanner(System.in);

        int l= scn.nextInt();//10

        for (int p=l;p>=0;p--){
            if (p==l){
                continue;
            }
            System.out.print(p+" ");


        }




    }
}
