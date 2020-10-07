package btu;

public class Main {

    public static void main(String[] args) {
        Class1 obj_1 = new Class1();
        System.out.println("Task 1");
        System.out.println("\na. " + obj_1.Method1(15));
        System.out.println("\nb. " + obj_1.Method2(25, 13));
        System.out.println("\nc. " + obj_1.Method3(-3, 5, 7));

        System.out.println("----------------");

        Class2 obj_2 = new Class2();
        System.out.println("\nTask 2");
        System.out.println("\na. " + obj_2.Method1(3));
        System.out.println("\nb. " + obj_2.Method2(7, 2));

        System.out.println("----------------");

        Class3 obj_3 = new Class3();
        System.out.println("\nTask 3");
        System.out.format("\na. %.2f\n", obj_3.Method1(16.5, 23.8));
        System.out.format("\nb. %.2f\n", obj_3.Method2(5.5, 3.9));

        System.out.println("----------------");

        Class4 obj_4 = new Class4();
        System.out.println("\nTask 4");
        System.out.format("\na. %.2f\n", obj_4.Method1(6.5, 12.8, 13.5));
        System.out.format("\nb. %.2f\n", obj_4.Method2(1.2, 5.3, 8.4));
        System.out.format("\nc. %.2f\n", obj_4.Method3(3.3, 2.7, 11.2));
    }
}
