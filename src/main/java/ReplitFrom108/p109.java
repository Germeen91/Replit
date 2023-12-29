package ReplitFrom108;
/*1. Create method name it as newLine
2. Add print statement inside method body as "newLine method implementation"
3. Call newLine method three times
**Expected Output:**
newLine method implementation
newLine method implementation
newLine method implementation
```*/
public class p109 {
    void newLine(){
        System.out.println("newLine method implementation");
    }
    void New(int m) {
        for (int p = 0; p < m; p++) {
            System.out.println("hello");
        }
    }
    public static void main(String[] args) {
        p109 obj=new p109();
        for (int i=0; i<3; i++){
obj.newLine();
        }

        p109 obj2=new p109();
        obj2.New(3);

    }

}
