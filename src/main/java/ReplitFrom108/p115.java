package ReplitFrom108;
/*Create a method that will accept a String as a parameter and return new String all in upper case
Call method
**Expected Output:**
TEST*/
public class p115 {
    String  m(String word){
      return word.toUpperCase();
    }

    public static void main(String[] args) {
        p115 obj =new p115();
        System.out.println(obj.m("test")); // because you dont have print order

        //OR Create data type
        String K=obj.m("test");
        System.out.println(K);

    }
}
