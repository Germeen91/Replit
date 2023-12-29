package ReplitFrom121;
/*Declare 3 instance variables to hold:
- name of the country
- capital
- population size
Create a method to display values of instance variables
Create 2 Object, assign values to instance variables, execute method display;
**Expected Output:**
The capital of USA is Washington DC and population is 330000000
The capital of Kazakhstan is Astana and population is 18500000*/
public class p122 {
    String nameOfTheCountry;
    String capital;
    double populationSize;
    void print(){
        System.out.println("The capital of "+nameOfTheCountry+ " is "+ capital+" and population is "+populationSize);
    }

    public static void main(String[] args) {
        p122 obj=new p122();
        obj.nameOfTheCountry="USA";
        obj.capital="Washington DC";
        obj.populationSize=330000000;
        obj.print();
    }
}
