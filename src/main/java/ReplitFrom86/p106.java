package ReplitFrom86;
/*Instantiate and StringBuffer class
Append Value "Hello" to it
Append value "World" to it.
Print in UPPERCASE.
**Expected Output:**
HELLO WORLD
```*/
public class p106 {
    public static void main(String[] args) {
        StringBuffer str=new StringBuffer();

        str.append("Hello ");
        str.append("World");
String s=new String(str);
        System.out.println(s.toUpperCase());
    }
}

