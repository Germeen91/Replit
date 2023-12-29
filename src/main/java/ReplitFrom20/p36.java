package ReplitFrom20;

import java.util.Scanner;

public class p36 {
    public static void main(String[] args) {
/*Prompt user to input two strings :"Please enter two strings"and two integers: "Please enter two numbers"
and make the comparisons:
- if int1 and int2 are equal **and** word1 and word2 are equal, output "AND"
- if int1 and int2 are equal **or** word1 and word2 are equal, output "OR"
- if int1 and int2 are **not** equal **and** word1 and word2 are **not** equal, output "NONE"
**Example input/output:**
word1: banana
word2: banana
int1: 2
int2: 2
Output: AND
word1: banana
word2: apple
int1: 2
int2: 2
Output: OR

word1: phone
word2: pie
int1: 2
int2: 3
Output: NONE*/

        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter two strings");
        String b1= sc.next();
        String b2= sc.next();
        System.out.println("Please enter two numbers");
        int n1= sc.nextInt();
        int n2= sc.nextInt();

        if ((n1==n2) && (b1.equals(b2))){
            System.out.println("AND");
        } else if ((n1==n2) || (b1.equals(b2))) {
            System.out.println("OR");
        } else  {
            System.out.println("NONE");

        }


    }
}
