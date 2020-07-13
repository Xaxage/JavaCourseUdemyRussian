package Lesson9_Homework;

public class CheckTheOutput_1 {
    int b=1;
    static int a=2;
    void abc(int a){
        System.out.println(a);
        System.out.println(this.a);
    }

    public static void main(String[] args) {
        CheckTheOutput_1 ch= new CheckTheOutput_1();
        ch.abc(3);
    }
}
