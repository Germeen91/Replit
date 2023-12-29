package ReplitFrom108;
/*Create a method that will accept 2 numbers as parameters and return true if both numbers are even otherwise returned false
( Return false if one or both given numbers are not even)
Examples:
- bothEven(4,6) ==> true
- bothEven(3,4) ==> false
- bothEven(-1,1) ==> false
**Expected Output:**
false*/
public class p116 {
    boolean m(int n1, int n2){
        if (n1 %2 ==0  && n2 %2==0 ){
            return true;
        }
        else {return false;}
    }

    public static void main(String[] args) {
        p116 obj =new p116();
        System.out.println(obj.m(-1,1));
    }

}
