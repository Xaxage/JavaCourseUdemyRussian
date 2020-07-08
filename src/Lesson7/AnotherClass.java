package Lesson7;

public class AnotherClass {
    public static void main(String[] args) {
        Employee emp=new Employee(40.0);//constructor visibility check
        System.out.println("Old salary equaled to "+emp.salary);//variable visibility check
        emp.doubleSalary();//method visibility check
    }
}
