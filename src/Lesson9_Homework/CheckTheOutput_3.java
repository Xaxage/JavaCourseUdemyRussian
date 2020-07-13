package Lesson9_Homework;

public class CheckTheOutput_3 {
    int a=1;
    static int b=2;
    void abc(int a){
        System.out.println(b);
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(CheckTheOutput_3.b);
    }

    public static void main(String[] args) {
        CheckTheOutput_3 ch=new CheckTheOutput_3();
        ch.abc(4);
    }
}
