package Lesson10;
//If we want to import subpackages for example package "a" from package "b",we write
//import b.a.*;
import java.lang.*;//We have it everywhere by default.
//If we import 2 packages and both of them have class with the same name ,
// we MUST use classes full names while creating objects
import Lesson9.Car;//This imports only class "Car" in the package "Lesson9".
//If we make class "Car" not public , we won't be able to call it(Class).
import Lesson9.*;//This imports everything in the package "Lesson9".

import static Lesson9.Car.*;//We import all static elements of the class


public class A {
    static int  counter=98;//We may have a question like "Why counter has value 98 ,
    //not 0 , like in class "Car". Because Java firstly searches for the
    //value of "counter" inside it's package classes,then inside imported packages.
    //
    public static void main(String[] args) {
        Lesson9.Car c1=new Lesson9.Car("Yellow","V6");
        //Without importing we still can call everything from this package
        Car c2=new Car("Black","V4");
        System.out.println(counter);
    }
}
