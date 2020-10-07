package btu;

public class Main {

    public static void main(String[] args) {
        Class1 obj_1 = new Class1();
        obj_1.Method1(4);

        Class2 obj_2 = new Class2(15);
        obj_2.Method1();

        Class3 obj_3 = new Class3(12, 25);
        obj_3.Method1();
        obj_3.Method2(15);

        System.out.println("\n----Class4----\n");

        Class4 obj_4 = new Class4();
        System.out.println("\nEvaluation 1: " + obj_4.Method1(13, 30));
        System.out.println("\nEvaluation 2: " + obj_4.Method2(5, 3));

        System.out.println("\n----Class5----\n");

        Class5 obj_5 = new Class5((float)13.5);
        System.out.println("\nEvaluation 1: " + obj_5.Method1((float)5.8));
        System.out.println("\nMinimum between x and y: " + obj_5.Method2((float)3.2));

        System.out.println("\n----Class6----\n");

        Class6 obj_6 = new Class6((float)10.4, (float)3.3);
        System.out.println("\nGCD of x and y: " + obj_6.Method1());
        System.out.println("\nLCM of x and y " + obj_6.Method2());
    }
}
