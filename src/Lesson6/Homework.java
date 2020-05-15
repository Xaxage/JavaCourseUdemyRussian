package Lesson6;

public class Homework
    {
    int sum()
        {
        System.out.println(sum);
        return sum;
        }
    int sum(int i)
        {
        System.out.println(i);
        sum=i;
        return sum;
        }
    int sum(int i,int j)
        {
        sum=i+j;
        System.out.println(i+j);
        return sum;
        }
    int sum(int i,int j,int k)
        {
        sum=i+j+k;
        System.out.println(i+j+k);
        return sum;
        }
    int sum(int i,int j,int k,int l)
        {
        sum=i+j+k+l;
        System.out.println(i+j+k+l);
        return sum;
        }

    int sum;
    }

class HomeworkTest
    {
    public static void main(String[] args)
        {
        Homework obj= new Homework();
        obj.sum();
        obj.sum(3);
        obj.sum(34,4);
        obj.sum(3,4,6);
        obj.sum(1,2,3,4);
        }
    }
