package ReplitFrom86;
/*Create a Class Main
In this class, you should specify the following attributes: breed, name, color, and following behaviors: bark(), run(), play().
Create 3 different objects of it: Husky, Bulldog, Labrador with specific attributes and behaviors.
The output of the program should be as following:
Husky can bark
Husky can run
Husky can play
Bulldog can bark
Bulldog can run
Bulldog can play
Labrador can bark
Labrador can run
Labrador can play*/
public class p88 {
    String breed;
    String name;
    String color;

    public void bark(){
        System.out.println(name+ " can bark");
    }
    public void run(){
        System.out.println(name+" can run");
    }
    public void play(){
        System.out.println(name+" can play");
    }

    public static void main(String[] args) {
        p88 Husky=new p88();
        Husky.name="Husky";
        Husky.bark();
        Husky.run();
        Husky.play();
        p88 Bulldog=new p88();
        Bulldog.name="Bulldog";
        Bulldog.bark();
        Bulldog.run();
        Bulldog.play();
        p88  Labrador=new p88();
        Labrador.name="Labrador";
        Labrador.bark();
        Labrador.run();
        Labrador.play();

    }
}
