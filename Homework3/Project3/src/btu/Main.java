package btu;

public class Main {

    public static void main(String[] args) {
        ClassA obj_1 = new ClassA();
        obj_1.Method1();
        obj_1.Method2();
        System.out.println("\nSum of elements less than index: " + obj_1.Method3());
        System.out.println("\nProduct of indexes less than elements: " + obj_1.Method4());

        ClassB obj_2 = new ClassB();
        obj_2.Method1();
        obj_2.Method2();
        obj_2.Method3();
        System.out.format("\nMax - Min: %.2f", obj_2.Method4());
    }
}
