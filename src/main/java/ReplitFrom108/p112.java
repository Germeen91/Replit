package ReplitFrom108;
/*
1. Create a method in which you will be printing numbers from 1 to 10
2. Call the method in the main method
**Expected Output:**
1
2
3
4
5
6
7
8
9
10*/
public class p112 {
    void num() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

    }
        void numbers(int n){
            for(int i=1; i<=n; i++){

                System.out.println(i);
            }
        }


    public static void main(String[] args) {
        p112 obj =new p112();
        obj.num();
        obj.numbers(10);
    }
}
