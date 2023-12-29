package ReplitFrom86;
/*Create a String given="Hello Syntax friends".
Using String methods from given String create new String "Welcome Syntax family"
**Expected Output:**
Welcome Syntax family */
public class p98 {
    public static void main(String[] args) {

        String str=new String("Hello Syntax friends");
        System.out.println(str.replaceAll(str,"Welcome Syntax family"));

    }
}
