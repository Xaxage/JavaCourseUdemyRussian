package Lesson5;
import Lesson4.BankAccount;

 public class Car
    {

    Car(String constructorColor,String constructorEngine)
        {
        color=constructorColor;
        engine=constructorEngine;
        }
    String color;
    String engine;
    int speed;

     int push(int moreSpeed)
        {
        speed=speed+moreSpeed;
        return speed;
        }

    int stop(int lessSpeed)
        {
        speed=speed-lessSpeed;
        return speed;
        }

    void showInfo()
        {
        System.out.println("Color: " + color +
                "  Engine: " + engine + "  Speed: " + speed);
        }
    }

class CarTest
    {
    public static void main(String[] args)
        {
        Car car1 = new Car("Yellow","V6");
        car1.speed=45;
        car1.push(15);//increasing speed
        car1.stop(20);//decreasing speed
        car1.showInfo();
        }
    }
