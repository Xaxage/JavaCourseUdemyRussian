package Lesson8;

public class Student {
    String name;
    int course;
    static int counter;//static means variable doesn't belong to created objects anymore.
    //Variable belongs to it's class.
    int a;
    public Student(String name2,int course2)
    {
        counter++;
        name=name2;
        course=course2;
        System.out.println("Student # "+ counter+" was created." );
    }

    public static void showCounter()
    {
        System.out.println(counter + " students were created.");
    }

    /*public static void main(String[] args) {
        showCounter();
        System.out.println(counter);
        //Variable "counter" belongs to it's class ,
        // so we can delete word "Student." .*/

    public void showInfo(){
        System.out.println("Welcome to the Student class");
    }

    void abc(){ //If abc method is called, than object has already been created
        a++;//We can call non-static variable in non-static method.
        counter++;//We can call static variable in  non-static method.
    }
    static void abcd(){
        counter++; //We can call static variable in static method.
        //a++;  //We can't call non-static variable in static method,
        //because abcd doesn't create object.But we can create object
        //in non-static method.
        Student st4=new Student("Vahe",4);
        st4.a++;
    }
}
class StudentTest{
    public static void main(String[] args) {
        Student st1=new Student("Ivan",2);
        Student st2=new Student("Peter",4);
        Student st3=new Student("Masha",2);
        System.out.println(Student.counter);//Variable belongs to it's class ,
        // so we are calling it by it's class's name.
        System.out.println(st3.counter);// Anyway we can still call it using object.
        Student.showCounter();
        st2.showCounter();
        Student.abcd();// We called static method without creating an object
        //abc(); // Can't do it without an object.
        st3.abc();//No problem with an object ^_^
    }
}
