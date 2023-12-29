package ReplitFrom20;

import java.util.Scanner;

public class p38 {
    public static void main(String[] args) {
/*Prompt user with a question: "Is it weekend?"
If it is not a weekend --> subject="manual testing"
Otherwise --> subject="Java"
**Output**:
Today you will be learning ____*/

        Scanner sc=new Scanner(System.in);
        System.out.println("Is it weekend?");
        boolean w= sc.nextBoolean();

        if (!w){
            System.out.println("Today you will be learning manual testing");
        }else {
            System.out.println("Today you will be learning Java");
        }







    }
}
