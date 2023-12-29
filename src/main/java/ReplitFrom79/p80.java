package ReplitFrom79;

public class p80 {
    public static void main(String[] args) {

/*Write a program to double the values of every element in the array and print it out.
**Example Output:**
2.8 4.0 6.6 4.0
8.0 3.0 12.2 2.0
2.4 6.2 8.0 3.2*/


        double num[][]={
                {2.8 ,4.0 ,6.6 ,4.0},
                {8.0 ,3.0 ,12.2 ,2.0},
                {2.4 ,6.2 ,8.0 ,3.2}
        };

        for (double []L:num){
            for (double K:L){
                System.out.print(K+" ");
            }
            System.out.println();

        }

////////////////////////////////


        for (int i=0; i< num.length; i++){
            for (int p=0; p<num[i].length;p++){

                System.out.print(num[i][p]+" ");
            }
            System.out.println();




        }





    }
}
