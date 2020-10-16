package labConsole4_1;

public class ClassA implements A_Interface{
    private int a = 10, b = 29;

    public ClassA(){
        System.out.println("\n===lc4_1_ClassA===");
    }

    @Override
    public void Hello_OPP() {
        System.out.print("\nHello OPP");
    }

    @Override
    public void Print_Var1() {
        System.out.format("\na = %d", a);
    }

    @Override
    public void Print_Var2() {
        System.out.format("\nb = %d", b);
    }

    @Override
    public void Print_Var_Sum() {
        System.out.format("\na + b = %d", (a + b));
    }

    @Override
    public int Return_Var_Sum() {
        return (a + b);
    }

    @Override
    public int Return_Var_Product() {
        return (a * b);
    }

    @Override
    public void Assign_Var_Values() {
        a = 5;
        b = 6;

        //Printing to check for myself
        System.out.format("\nAssigned: a = %d; b = %d\n", a, b);
    }
}
