package Lesson8_Homework;

import java.util.Scanner;
import java.util.zip.GZIPOutputStream;

public class SecondProblem {
    static final double Pi =3.14;

    double theAreaOfCircle(double r){
        return r*Pi*r;
    }

    static double theLengthOfCircle(double r){
        return 2* Pi *r;
    }

    void showInfo(double r)
    {
        System.out.println(r);
        System.out.println("The area of circle = " + theAreaOfCircle(r));
        System.out.println("The length of circle = " + theLengthOfCircle(r));
    }
}

class SecondProblemTest
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of the Radius");
        double r= sc.nextDouble();
        SecondProblem test = new SecondProblem();
        test.theAreaOfCircle(r);
        SecondProblem.theLengthOfCircle(r);
        test.showInfo(r);
    }
}
