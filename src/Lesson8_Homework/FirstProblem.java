package Lesson8_Homework;

public class FirstProblem {

    static int multiplication3(int a,int b,int c) {
        return a*b*c;
    }

    static void division2(int a,int b){
        System.out.println("Integer part of division = " + a/b);
        System.out.println("Reminder of division = " + a%b);
    }
}
 class FirstProblemTest{
     public static void main(String[] args) {
         int a=FirstProblem.multiplication3(2,3,4);
         System.out.println(a);
         int b=FirstProblem.multiplication3(0,4,9);
         System.out.println(b);


         FirstProblem.division2(5,6);
         FirstProblem.division2(5,2);
     }
 }
