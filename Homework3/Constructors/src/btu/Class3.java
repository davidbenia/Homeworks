package btu;

public class Class3 {
    int a, b, x;

    public Class3(){

    }
    public Class3(int a, int b){
        this.a = a;
        this.b = b;
    }

    public void Method1(){
        if (a < b)
            System.out.format("\n[%d; %d] is a valid range\n", a, b);
        else
            System.out.format("\n[%d; %d] is not a valid range\n", a, b);
    }

    public void Method2(int x){
        this.x = x;

        if(this.x > a && this.x < b)
            System.out.format("\nx is in [%d; %d]\n", a, b);
        else
            System.out.format("\nx is not in [%d; %d]\n", a, b);
    }
}
