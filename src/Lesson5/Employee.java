package Lesson5;

public class Employee//We added "public", so we can see class's insides from other packages
    {
    int id;
    String surname;
    int age;
    double salary;
    String department;

    Employee(int id,String surname,int age,double salary,String departament)//Constructore
        {
            this.id=id;
            this.surname =surname;
            this.age=age;
            this.salary=salary;
            this.department =departament;
        }
    public Employee(String surname, int age)// We added public ,
    // so we could call it in another package
        {
        this.surname =surname;
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
