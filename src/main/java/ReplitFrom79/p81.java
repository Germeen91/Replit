package ReplitFrom79;

public class p81 {
    public static void main(String[] args) {

/*Write a program that prints the highest value in the array.
**Expected Output:**
input [5,4,8]
8*/


int [] num ={60,82,30,15,23,14,100};

int highest= num [0];
int lowest=num [0];

for (int i=0; i<num.length; i++){

    if (num[i]>highest)
        highest=num[i];

    if (num[i]<lowest)
        lowest=num[i];

}
        System.out.println("the highest number is : " +highest);
        System.out.println("the lowest number is : "+lowest);





    }
}
