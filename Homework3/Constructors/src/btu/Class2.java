package btu;

public class Class2 {
    int x;

    public Class2(){

    }
    public Class2(int x){
        this.x = x;
    }

    public void Method1(){
        if(x > 5 && x < 24)
            System.out.println("\nx is in [5; 24]");
        else
            System.out.println("\nx is not in [5; 24]");
    }
}
