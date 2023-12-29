package ReplitFrom86;

import java.util.Scanner;

/*There is a code that takes input as a String.
Write a program that will print out only vowels of that string
Sample input/outputs:
```
In: howdyho
oo
.....
In: huehuehuehue
ueueueue
```
In: poopoo what idk what im doing
ooooaiaioi*/
public class p105 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("In : ");
        String word= sc.nextLine();
        System.out.println(word.replaceAll("[^AaUuEeIiOo]",""));


    }
}
