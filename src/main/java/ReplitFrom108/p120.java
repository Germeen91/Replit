package ReplitFrom108;
/*Declare 3 instance variables to hold:
year, school name and batch #
Access variables from the main method and assign specific values to them
Print values of your variables in the following format:
**Expected Output:**
I am a student of batch 9 studying at Syntax in the year of 2021*/
public class p120 {
    String school;
    int year;
    int batch;

    public static void main(String[] args) {

        p120 obj=new p120();
        obj.school="Syntax";
        obj.year=2021;
        obj.batch=9;
        System.out.println("I am a student of batch "+obj.batch+" studying at "+obj.school+" in the year of "+obj.year);
    }
}
