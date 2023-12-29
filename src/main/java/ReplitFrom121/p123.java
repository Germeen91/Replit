package ReplitFrom121;
/*Declare the **instance** variables to hold:
- integer values
- String values
- double values
- boolean values
- float values
Access instance variables and then print them all without assigning any values to them.
Print variables one by one the same sequence that you declare them.
**Expected Output:**
0
null
0.0
false
0.0 */
public class p123 {
    int values;
    String name;
    double numbers;
    boolean trueOrFalse;
    float f;

    public static void main(String[] args) {
        p123 obj=new p123();
        System.out.println(obj.values+" "+obj.name+" "+obj.numbers+" "+obj.trueOrFalse+" "+obj.f);
    }

}
