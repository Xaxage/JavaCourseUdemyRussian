import java.sql.SQLOutput;
import java.util.jar.JarOutputStream;

public class Car {
    int z=5;




    int a=10;
    String color;
    String engine;
    //static int counter=this.a;//This isn't working cause "a" will get its value,
    // when object is created.Meanwhile counter is independent from objects.
    // IT BELONGS TO CLASS!!!
    static int counter;

    Car(String color,String engine){
        counter++;
        this.color=color;
        this.engine=engine;
    }

    /*public static void changA(int b){ }
    //this.a=b;//It isn't working cause static method depends on object.ПРОТИВОРЕЧИЕ

    {*/

    public void showColor() {
        System.out.println("Car's color: " + color);
        changeColor("Red");
    }

    public void changeColor(String color3){
        System.out.println("Car's color has been changed ");
        int cost=5000;
        color=color3;
        cost+=1000;
    }

}
