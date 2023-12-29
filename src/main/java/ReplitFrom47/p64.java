package ReplitFrom47;

import java.util.Scanner;

public class p64 {
    public static void main(String[] args) {

/*int end;
Write a for loop that will print out a series of numbers starting
at 0 and ending at the doubled
 value of end(value must be taken from a user), exclusive.
Each number should be on the same line, separated by a space.
 **Example Output:**
Int: 5
0 1 2 3 4 5 6 7 8 9*/

        Scanner sc=new Scanner(System.in);
        System.out.println("In : ");
        int i= sc.nextInt();

        for (int p=0 ; p<(i*2); p++){
            System.out.print(p+" ");
        }




    }
}
