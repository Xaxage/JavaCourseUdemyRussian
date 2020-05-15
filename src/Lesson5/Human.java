package Lesson5;

import Lesson4.BankAccount;

public class Human
    {
     String name;
    Car car;
    BankAccount bA;
    void info()
        {
        System.out.println("Name: " + name + " Car's color : "
        + car.color + " Account balance "+ bA.balance);
        }

    }

class HumanTest
    {
    public static void main(String[] args)
        {
        Human h=new Human();
        h.name="David";
        h.car=new Car("Pink","V9");
        h.bA=new BankAccount(34,203.3);
        h.info();
        }

    }







