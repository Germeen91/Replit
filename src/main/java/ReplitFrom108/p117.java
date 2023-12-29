package ReplitFrom108;
/*Create a method with the following specs:
Returns:
an integer
Name:
sumEvenToX
Parameters:
an integer called "x"
Purpose:
calculate the sum of the EVEN integers from 1 to x (including x)
Examples:
sumEvenToX(5) ==> 6
sumEvenToX(8) ==> 20*/
public class p117 {

    int sumEvenToX(int x) {
        int sum = 0;
        for (int i = 1; i <= x; i++) {
            if (i % 2 == 0) {
                sum = sum + i;

            }
        }
        return sum;
    }

    public static void main(String[] args) {
        p117 obj=new p117();
        System.out.println(obj.sumEvenToX(8));
        //OR create same data type
        int K=obj.sumEvenToX(5);
        System.out.println(K);
    }
}
