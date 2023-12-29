package ReplitFrom108;
/*Step1: Create three methods that will accept 2 in parameters on integer type
Step2: Write the logic in methods to perform actions below:
The first method for multiplication
The second method for addition
The third method for subtraction
Step3: execute all methods
1. for the addition method add two numbers to make 30
2. for multiplication multiply two numbers to make 30
3. for Subtraction subtract two numbers to equal 20
**Expected Output:**
Addition 30
Multiplication 30
Subtraction 20*/
public class p114 {
    void m1(int n1,int n2){
        System.out.println("multiplication : "+(n1*n2));
    }
    void m2(int n1,int n2){
        System.out.println("addition : "+(n1+n2));
    }
    void m3(int n1,int n2){
        System.out.println("Subtraction : "+(n1-n2));
    }

    public static void main(String[] args) {

        p114 obj=new p114();
        obj.m1(10,3);
        obj.m2(10,20);
        obj.m3(40,20);
    }
}
