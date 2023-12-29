package ReplitFrom20;

import java.util.Scanner;

public class p37 {
    public static void main(String[] args) {

        /*Take 2 boolean inputs from a user:
 "Are you thirsty?"
 "Are you sleepy?"
If user is thirsty and not sleepy--> drink=water
If user is thirsty and sleepy--> drink=coffee
If user is not thirsty and sleepy --> drink=tea
Otherwise drink="nothing"
Output:
- Looks like you need to drink \_\_\_*/

        Scanner sc=new Scanner(System.in);
        System.out.println("Are you thirsty?");
        boolean th= sc.nextBoolean();
        System.out.println("Are you sleepy?");
        boolean sl= sc.nextBoolean();

        if (th&&!sl){
            System.out.println("Looks like you need to drink Water");

        } else if (th&&sl) {
            System.out.println("Looks like you need to drink Coffee");

        } else if (!th&&sl) {
            System.out.println("Looks like you need to drink Tea");

        } else {
            System.out.println("Looks like you need to drink Nothing");
        }


    }
}
