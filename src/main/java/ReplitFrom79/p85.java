package ReplitFrom79;

public class p85 {
    public static void main(String[] args) {

/*Write a program that sums
all numbers that are on even index and on even row.*/

        int[][] num = {
                {-5,-2,-3,7},
                {1,-5,-2,2},
                {1,-2,3,-4}
        };

        int sum=0;

        for (int i=0; i<num.length; i++){

            for (int p=0; p<num[i].length; p++){

                if((i %2==0) && (p %2==0)){
                  sum =sum+num[i][p];
                }

            }
        }
        System.out.println(sum);




    }
}
