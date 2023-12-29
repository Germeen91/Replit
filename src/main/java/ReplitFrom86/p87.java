package ReplitFrom86;
/*Create a class named 'Main' with specific attributes.
Create two objects of that class in which you will be assigning the following values and then print them.
carColor='Black'
carYear=2019
carMake='BMW'
carColor='White'
carYear=2018
carMake='Toyota'
**Expected Output:**
Car color is Black and car year is 2019 and car model is BMW
Car color is White and car year is 2018 and car model is Toyota*/
public class p87 {
    String carColor;
    int carYear;
    String carMake;

    public void print() {
        System.out.println("Car color is " + carColor + " and car year is " + carYear + " and car model is " + carMake);
    }

    public static void main(String[] args) {
        p87 obj = new p87();
        obj.carColor = "Black";
        obj.carYear = 2019;
        obj.carMake = "BMW";
        obj.print();

        p87 obj2=new p87();
        obj.carColor = "White";
        obj.carYear = 2018;
        obj.carMake = "Toyota";
        obj.print();
    }
}