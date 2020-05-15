package Lesson6;

public class MethodOverloading
    {

     void show(int i1)//accepts 1 argument
         {
         System.out.println(i1);
         System.out.println("Data type is int");
         }

    void show(int a,int b)//accepts 2 arguments
        {
        System.out.println(a);
        }

    void show(String s,int a)//accepts the same arguments , but in other positions
        {
        System.out.println("String = "+ s + " int = "+a);
        }

    void show (int a,String s)//accepts the same arguments , but in other positions
        {
        System.out.println(a);
        }

     void show(boolean b1)
         {
         System.out.println(b1);
         System.out.println("Data type is boolean");
         }

    void show(String s1)
        {
        System.out.println(s1);
        System.out.println("Data type is String");
        }
    }
class MethodOverloadingTest
    {
    public static void main(String[] args)
        {
        MethodOverloading mO=new MethodOverloading();
        int a=500;
        mO.show(a);
        boolean b=true;
        mO.show(b);
        String s="Hello";
        mO.show (s);
        }
    }
