package ReplitFrom70;

public class p72 {
    public static void main(String[] args) {

/*Write a program that creates an array with the following
 values{s, a, y,  b, n, c, t,  d, a, e, x}
Print the values so the output should look like below
**Output:*
syntax*/

        char []values={'s','a','y','b','n','c','t','d','a','e','x'};


for(int i=0; i< values.length; i++){
    if ((i==1) || (i==3) || (i==5) || (i==7) || (i==9)){
        continue;
    }
    System.out.print(values[i]);

    /////////////////////////
    System.out.print(values[0]);
    System.out.print(values[2]);
    System.out.print(values[4]);
    System.out.print(values[5]);
    System.out.print(values[7]);
    System.out.print(values[9]);






}


    }
}
