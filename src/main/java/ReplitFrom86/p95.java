package ReplitFrom86;

import java.util.Scanner;

/*Using Scanner class input string value.
Print out the following: "The first 3 letters of \_\_\_ is ___"
For example, if the input is "banana", your output should be: "The first 3 letters of banana is ban". */
public class p95 {
    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);
        System.out.println("input");
        String str= sc.nextLine();
        System.out.println("the first letter of "+str+" "+str.substring(0,3));




    }
}
