package btu;

public class Main {

    public static void main(String[] args) {
        ClassA obj_1 = new ClassA();
        obj_1.Method1();
        obj_1.Method2();
        System.out.println("\na * b = " + obj_1.Method3());

        ClassB obj_2 = new ClassB();
        obj_2.Method1();
        obj_2.Method2();
        System.out.println("\nMin: " + obj_2.Method3());

        ClassC obj_3 = new ClassC();
        obj_3.Method1();
        System.out.println("\nlast digit of a: " + obj_3.Method2());
        System.out.println("\nfirst digit of b: " + obj_3.Method3());
        System.out.println("\ndigit sum of c: " + obj_3.Method4());
        obj_3.Method6();
    }
}
