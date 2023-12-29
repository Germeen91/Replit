package ReplitFrom20;

import java.util.Scanner;

public class p44 {
    public static void main(String[] args) {
/*Prompt user with questions: "Please enter your favorite car make"
- if user enters  BMW -->  carOrigin = "german car"
- if user enters  Toyota -->  carOrigin = " japanese car"
- if user enters  Maserati -->  carOrigin = "italian car"
- anything else besides those values --> carOrigin = "unknown"
The output of your program should be:
"Your favorite car is ___"*/

        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter your favorite car make");
        String car=sc.nextLine();
        String v="";
        switch (car.toLowerCase()){
            case "bmw":
                System.out.println(v="german car");
                break;
            case "toyota":
                System.out.println(v="japanese car");
                break;
            case "maserati":
                System.out.println(v="italian car");
                break;
            default:
                System.out.println(v="unknown");

        }
        System.out.println("your favorite car is "+v);







    }
}
