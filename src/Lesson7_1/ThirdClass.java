package Lesson7_1;

import Lesson7.Employee;

public class ThirdClass {
    public static void main(String[] args) {
        Lesson7.Employee emp = new Lesson7.Employee(40.0);//constructor visibility check
        //Employee emp = new Employee; We can do it without its full address -_-
        // Instructor lied to us !!! SHAME SHAME SHAME
        System.out.println("Old salary equaled to " + emp.salary);//variable visibility check
        emp.doubleSalary();//method visibility check
    }
}
