package ReplitFrom70;

public class p71 {
    public static void main(String[] args) {
/*Write a program that creates an array of integers that stores the following values:
 45,78, 12,  67, 55, 89, 23, 77, 88
Print only values that stored with even index including 0.
**Output:*
45 12 55 23 88*/

int []num={45,78,12,67,55,89,23,77,88};

for (int i=0; i< num.length; i=i+2){

    System.out.print(num[i]+ " ");
}








    }
}
