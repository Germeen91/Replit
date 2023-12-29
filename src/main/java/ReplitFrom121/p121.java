package ReplitFrom121;
/*declare 3 instance variables to hold an integer, double and char values.
Create 2 instances of the class and assign values to variables and the print them
**Expected Output:**
10
10.23
a
100
100.23
s*/
public class p121 {
    int n;
    double d;
    char c;

    public static void main(String[] args) {
        p121 obj=new p121();
        obj.n=10;
        obj.d=10.23;
        obj.c='a';
        System.out.println(obj.n+" "+ obj.d+" "+obj.c);

        p121 obj2=new p121();
        obj2.n=100;
        obj2.d=100.23;
        obj2.c='s';
        System.out.println(obj2.n+" "+obj2.d+" "+obj2.c);
    }
}
