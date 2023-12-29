package ReplitFrom121;
/*Create a variable that will hold the count of all instances of the Main class
Create 3 Object of the class and print value of the count variable;
**Expected Output:**
3*/
public class p126 {


    static int count;

    public static void main(String[] args) {

        p126 obj1=new p126();
       p126.count++;
p126 obj2=new p126();
       p126.count++;
p126 obj3=new p126();
p126.count++;
        System.out.println(count);


    }


}
