package Lesson4.Homework;

    class Student
    {

    Student()
        {

        }

    Student(int studentId,String name)
        {
        this.studentId=studentId;
        this.name=name;
        }

    Student(int studentId,String name,String surename,
            int course,double averageGradeOfMath,
            double averageGradeOfEconomy,double averageGradeOfForeignLanguage)
        {
        this(studentId,name);
        this.surename=surename;
        this.course=course;
        this.averageGradeOfMath=averageGradeOfMath;
        this.averageGradeOfEconomy=averageGradeOfEconomy;
        this.averageGradeOfForeignLanguage=averageGradeOfForeignLanguage;
        }

        int studentId;
        String name;
        String surename;
        int course;
        double averageGradeOfMath;
        double averageGradeOfEconomy;
        double averageGradeOfForeignLanguage;
        void averageGradeOfAllTheSubjects()
            {
            double result=averageGradeOfMath+averageGradeOfEconomy+
                    averageGradeOfForeignLanguage;
            System.out.println(result/3);
            }

    }

    class StudentTest
        {
        public static void main(String[] args)
            {
             Student student1= new Student();
             Student student2= new Student();
             Student student3= new Student();

             student1.name="Vardush";
             student1.surename="Kostanyan";
             student1.course=1;
             student1.averageGradeOfEconomy=3;
             student1.averageGradeOfForeignLanguage=5;
             student1.averageGradeOfMath=4;
             student1.averageGradeOfAllTheSubjects();

             student2.name="Sudarik";
             student2.surename="Ikilikyan";
             student2.course=3;
             student2.averageGradeOfMath=3;
             student2.averageGradeOfForeignLanguage=5;
             student2.averageGradeOfEconomy=1;student2.averageGradeOfAllTheSubjects();

             student3.name="Valodik";
             student3.surename="Papazyan";
             student3.course=4;
             student3.averageGradeOfForeignLanguage=5;
             student3.averageGradeOfMath=5;
             student3.averageGradeOfEconomy=5;
             student3.averageGradeOfAllTheSubjects();

             Student student4=new Student();
             Student student5=new Student(756,"Erik");
             Student student6=new Student(837,"Nemo",
                     "Matrix",7,5,
                     5,5);


            }
        }
