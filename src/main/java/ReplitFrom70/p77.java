package ReplitFrom70;

import java.util.Scanner;

public class p77 {
    public static void main(String[] args) {

/*Create an array of integers that will store 5 elements taken from a user
Don't print any prompt message for the user
Then print out all the elements you have created in the first loop in reverse order.
In :
1
2
3
4
5
out
5
4
3
2
1*/


        int []num=new int[5];

        Scanner sc=new Scanner(System.in);
        for (int i=0; i<num.length; i++){
            System.out.println(" ");
            num[i]=sc.nextInt();
        }

for (int p= num.length-1; p>=0; p--){
    System.out.println(num[p]);
}

    }
}
