package ReplitFrom86;
/*- Create a String given="I love Java classes at Syntax"
- Retrieve 2 Strings using substring method from given String and print them
**Expected Output:**
classes at Syntax
I love Java*/
public class p94 {
    public static void main(String[] args) {
        String str=new String("I love Java classes at Syntax");
        System.out.println(str.substring(0,11));
        System.out.println(str.substring(12));


    }
}
