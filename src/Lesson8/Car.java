package Lesson8;

public class Car {
    String colour="blue";
    String engine="V6";
}
class Human{
    String name="Ivan";
    final Car c=new Car();//final states we can't change objects address.

    public static void main(String[] args) {
        Human h1=new Human();
        //h1.c =new Car();
        // final forbid changing reference type variable's address.
        //h1.c =new Car();
        h1.c.engine="V8";//here we'v changed variable in the same address.
    }
}
