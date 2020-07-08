package Lesson7;

 public class Employee {
 public double salary;
public void doubleSalary()//creating method for tests
{
    System.out.println("New salary equals to " +salary*2);
}
public Employee(double salary2)
{
    salary=salary2;
}
    public static void main(String[] args) {
        Employee emp=new Employee(20.0);//constructor visibility check
        System.out.println("Old salary equaled to " +emp.salary);//variable visibility check
        emp.doubleSalary();//method visibility check
    }
}
  class EmployeeCheck
{
    public static void main(String[] args) {
        Employee emp=new Employee(40.0);//constructor  visibility check
        System.out.println("Old salary equaled to " +emp.salary);//variable visibility check
        emp.doubleSalary();//method visibility check
    }
}
