package ReplitFrom79;

public class p82 {
    public static void main(String[] args) {

/*Write a program that will print the sum of all elements in 2D array.
**Expected Output:**
-9*/


int [][]num={
        {-5,-2,-3,7},
        {1,-5,-2, 2},
        {1,-2, 3,-4}
};

int sum=0;

for (int i=0; i< num.length; i++){
    for (int p=0; p<num[i].length; p++){

        sum=sum+num[i][p];
    }

}    System.out.println(sum);





    }
}
