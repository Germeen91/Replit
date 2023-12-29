package ReplitFrom108;
/*Step1: Create a method that will accept with 2 parameters of integer type
Step2: Write the logic in that method in println statement to print hours and minutes
Step3: Call the method
**Expected Output:**
11:30*/
public class p113 {
    void print(int m, int s){
        System.out.println(m+":"+s);
    }

    public static void main(String[] args) {
        p113 obj=new p113();
        obj.print(11,30);
    }
}
