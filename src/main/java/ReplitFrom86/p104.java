package ReplitFrom86;

import java.util.Scanner;

/*Create an array of names that will hold 5 String elements.
Names must be taking from a user.
Print out the first three characters of each element of the array, one per line.
Note: every array element must be at least 3 characters long.
Input Example:
John
Jane
Jimmy
Mike
Emily
Expected Output:
**Joh**
**Jan**
**Jim**
**Mik**
**Emi***/
public class p104 {
    public static void main(String[] args) {

        String []names=new String[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("Int: ");

for (int i=0; i<names.length; i++){
    names[i]= sc.nextLine();
}


for (int p=0; p<names[p].length(); p++){
    System.out.println(names[p].substring(0,3));
}

    }
}
