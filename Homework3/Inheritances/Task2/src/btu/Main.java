package btu;

public class Main {

    public static void main(String[] args) {
        ClassA obj_1 = new ClassA();
        obj_1.Method1();
        obj_1.Method2();
        obj_1.Method3();

        ClassB obj_2 = new ClassB(15, 12);
        System.out.println("\n" + obj_2.Method4());
        System.out.println("\n" + obj_2.Method5());

        ClassC obj_3 = new ClassC();
        obj_3.Method1();
        System.out.println("\n" + obj_3.Method6());
        System.out.println("\n" + obj_3.Method7());
        System.out.println("\n" + obj_3.Method8());
    }
}
