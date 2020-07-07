package Lesson6;

public class EmployeeConstructorOverloading
    {

    public EmployeeConstructorOverloading(int id2, String surname2, int age2)
        {
      this(surname2,id2);//it always has to be on the first line in  constructor.
            // Otherwise it's an error -_-
       //We can't use overloaded constructor in constructor , so we are using "this" ,
            // instead of "EmployeeConstructorOverloading((surname2,id2))"
      id=id2;
        }

    protected EmployeeConstructorOverloading(String surename3,int age3)
        {
        surname =surename3;
        age=age3;
        }

    EmployeeConstructorOverloading(int id4,String surename4,int age4,double salary4,String department4)
        {
        this(surename4,age4);//it always has to be on the first line in  constructor.
            // Otherwise it's an error -_-
            //We can't use overloaded constructor in constructor , so we are using "this"
        id=id4;
        department =department4;
        salary=salary4;
        }



    int id;
    String surname;
    int age;
    double salary;
    String department;
    }
class EmployeeTest
    {
    public static void main(String[] args)
        {
        EmployeeConstructorOverloading emp1 = new EmployeeConstructorOverloading(1,"Ivanov",25);
        System.out.println(emp1.id);
        EmployeeConstructorOverloading emp2=new EmployeeConstructorOverloading("Jackson",30);
        System.out.println(emp2.surname);
        EmployeeConstructorOverloading emp3 = new EmployeeConstructorOverloading(2,"Berberyan",56,23.0,"MIT");
        System.out.println(emp3.department);

        }
    }
