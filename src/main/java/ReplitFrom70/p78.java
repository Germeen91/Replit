package ReplitFrom70;

import java.util.Scanner;

public class p78 {
    public static void main(String[] args) {
/*Create an int array of integers with a size of 5
and input values with Scanner.
Don't print prompt questions for a user.
Using loop print out each element of the array that
 should look like the output below
 input
 1
 2
 3
 4
 5
 output
 10
 20
 30
 40
 50*/

        int []num=new int[5];

        Scanner sc=new Scanner(System.in);
        for (int i=0; i<num.length; i++){
            System.out.println("Input :");
            num[i]=sc.nextInt();
        }
        System.out.println("Output");
for (int p=0; p<num.length; p++){
    System.out.println(num[p]*10);
}

///for (int P:num){
//      System.out.println(P*10);
    }
}
