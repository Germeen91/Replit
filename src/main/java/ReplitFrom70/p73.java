package ReplitFrom70;

public class p73 {
    public static void main(String[] args) {

/*Write a program that creates an array of strings with the following
values{"This", "is", "array", "of", "strings"}
 and prints all values in one line.
**Output:**
This is array of strings*/


        String []values={"This", "is", "array", "of", "strings"};


        for (String i:values){
            System.out.print(i+" ");
        };
///////////////////////////////////////
        for (int p=0; p< values.length; p++){
            System.out.print(values[p]+" ");
        }

    }
}
