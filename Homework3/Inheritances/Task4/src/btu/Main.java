package btu;

public class Main {

    public static void main(String[] args) {
        ClassA obj_1 = new ClassA();
        obj_1.Method1();
        obj_1.Method2();
        obj_1.Method3();

        ClassB obj_2 = new ClassB();
        obj_2.Method4();
        obj_2.Method5();
        obj_2.Method6();
        System.out.println("\n" + obj_2.x);
    }
}
