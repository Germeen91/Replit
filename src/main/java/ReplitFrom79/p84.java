package ReplitFrom79;

public class p84 {
    public static void main(String[] args) {

/*Write a program that prints the
total number of elements that are negative AND odd*/

        int[][] num = {
                {-5,-2,-3,7},
                {1,-5,-2,2},
                {1,-2,3,-4}
        };

        int count=0;

        for (int i=0; i< num.length; i++){

            for (int p=0; p<num[i].length; p++){
                if ((num[i][p]<0) && (num[i][p]%2!=0)) {
                    count++;
                }

            }
        }
        System.out.println(count);







    }
}
