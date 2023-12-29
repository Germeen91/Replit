package ReplitFrom79;

public class p83 {
    public static void main(String[] args) {
/*Write a program that calculates the sum of elements from each row in
 a 2D array and adds them into array of integers*/



        int[][] a = {
                {1,1,2}, //sum = 4
                {3,1,2}, //sum = 6
                {3,5,3}, //sum = 11
                {0,1,2}  //sum = 3
        };


        for (int i=0; i<a.length; i++){
            int sum=0;
            for (int p=0;p<a[i].length; p++){

                sum=sum+a[i][p];

            }
            System.out.println(sum);
        }




    }
}
