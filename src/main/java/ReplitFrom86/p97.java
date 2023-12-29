package ReplitFrom86;

import java.util.Scanner;

/*Based on the user inputs program should give a correct answer.
If browser is Chrome or Chrome or CHROME or ChRoMe it should print the:
"Proceed with Chrome browser"
If browser is firefox, FIREFOX or FireFOX it should print the:
"Proceed with Firefox browser"
If browser is IE, ie or iE it should print the:
"Proceed with IE browser"
If any other browser it should print the:
"Invalid browser"*/
public class p97 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("choose browser : ");
        String str= sc.nextLine();
        if (str.equalsIgnoreCase("chrome")){
            System.out.println("Proceed with Chrome browser");
        } else if (str.equalsIgnoreCase("fireFox")) {
            System.out.println("Proceed with Firefox browser");
        } else if (str.equalsIgnoreCase("ie")) {
            System.out.println("Proceed with IE browser");
        }else {
            System.out.println("Invalid browser");
        }


    }
}
