package Lesson8;

public class Test1 {
    public final int a;//final makes 'a' a Constant.
    // We can't initialise 'a',after forth line


    Test1() {
    a=20;//Or we could just initialise 'a' from the beginning
    }

    Test1(boolean b){
    a=15;//Or we could just initialise 'a' from the beginning
    }
    public void abc(short s){
        final byte b;
        b=10;//We must initialise final variable , before using it !!!
        // We can initialise 'a',after 16-th line,in methods.
        System.out.println(s+b);
    }

    public static void main(String[] args) {
        Test1 t=new Test1();
        System.out.println(t.a);
    }
}
