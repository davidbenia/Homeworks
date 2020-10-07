package btu;

public class Class1 {
    int x;

    public Class1(){
        System.out.println("hello Class1");
    }

    public void Method1(int x){
        this.x = x;

        if(this.x % 2 == 0)
            System.out.println("\nx is even");
        else
            System.out.println("\nx is odd");
    }
}
