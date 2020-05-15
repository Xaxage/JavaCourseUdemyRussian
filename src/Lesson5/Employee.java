package Lesson5;

public class Employee
    {
    int id;
    String surename;
    int age;
    double salary;
    String departament;

    Employee(int id,String surename,int age,double salary,String departament)//Constructore
        {
            this.id=id;
            this.surename=surename;
            this.age=age;
            this.salary=salary;
            this.departament=departament;
        }
    public Employee(String surename, int age)
        {
        this.surename=surename;
        this.age=age;
        }

    void doubleSalary()
        {

        salary=salary*2;
        System.out.println(salary);
        }
    }

class EmployeeTest
    {
    public static void main(String[] args)
        {
        Employee one = new Employee(769, "Vahanyan", 21, 450000.0, "IT");
        Employee two = new Employee(957, "Manukyan", 21, 80000.0, "Cleaning");
        System.out.println(one.salary +"\n"+two.salary);
        one.doubleSalary();
        two.doubleSalary();

        }
    }
