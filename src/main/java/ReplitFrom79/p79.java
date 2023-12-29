package ReplitFrom79;

public class p79 {
    public static void main(String[] args) {
/*Write a program to print values from a 2D array
**Example Output:**
1.4 2.0 3.3 2.0
4.0 1.5 6.1 1.0
1.2 3.1 4.0 1.6*/

        double [][]num={
                {1.4 ,2.0 ,3.3 ,2.0 },
                {4.0 ,1.5 ,6.1 ,1.0},
                {1.2 ,3.1 ,4.0 ,1.6}
        };

for (double []p:num){
    for (double L:p){
        System.out.print(L+" ");
    }
    System.out.println();
}
////////////////////////
        for (int i=0; i<num.length; i++){
            for (int p=0; p< num[i].length;p++){
                System.out.print(num[i][p]+" ");
            }
            System.out.println();





        }






    }
}
