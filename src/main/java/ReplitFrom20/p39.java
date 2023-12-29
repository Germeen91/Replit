package ReplitFrom20;

import java.util.Scanner;

public class p39 {
    public static void main(String[] args) {
/*A school has following rules for grading system:
a. 1 to 25 - F
b. 25 to 45 - E
c. 45 to 50 - D
d. 50 to 60 - C
e. 60 to 80 - B
f. Above 80 - A
Ask the user to enter marks and print the corresponding grade.
**Example Output:**
Please enter your mark
Your grade is A
**Example Output:**
Please enter your mark
Please enter valid mark
```*/
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks");
        int m= sc.nextInt();
        if (m>=1&&m<25){
            System.out.println("F");
        } else if (m>=25&&m<45) {
            System.out.println("E");
        }else if (m>=45&&m<50){
            System.out.println("D");
        } else if (m>=50&&m<60) {
            System.out.println("C");
        } else if (m>=60&&m<80) {
            System.out.println("B");
        } else if (m>=80) {
            System.out.println("A");

        }else {
            System.out.println("Please enter valid mark");
        }


    }
}
