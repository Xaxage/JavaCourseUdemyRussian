package Lesson6;

public class EmployeeConstructorOverloading
    {

    public EmployeeConstructorOverloading(int id2, String surename2, int age2)
        {
      this(surename2,id2);//it always has to be on the first line in  constructer. Otherwise it's an error -_-
      id=id2;
        }

    protected EmployeeConstructorOverloading(String surename3,int age3)
        {
        surename=surename3;
        age=age3;
        }

    EmployeeConstructorOverloading(int id4,String surename4,int age4,double salary4,String department4)
        {
        this(surename4,age4);//it always has to be on the first line in  constructer. Otherwise it's an error -_-
        id=id4;
        departament=department4;
        salary=salary4;
        }



    int id;
    String surename;
    int age;
    double salary;
    String departament;
    }
class EmployeeTest
    {
    public static void main(String[] args)
        {
        EmployeeConstructorOverloading emp1 = new EmployeeConstructorOverloading(1,"Ivanov",25);
        System.out.println(emp1.id);
        EmployeeConstructorOverloading emp2=new EmployeeConstructorOverloading("Jackson",30);
        System.out.println(emp2.surename);
        EmployeeConstructorOverloading emp3 = new EmployeeConstructorOverloading(2,"Berberyan",56,23.0,"MIT");
        System.out.println(emp3.departament);
        }
    }
