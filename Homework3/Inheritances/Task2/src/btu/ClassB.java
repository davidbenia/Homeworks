package btu;

public class ClassB extends ClassA{
    public ClassB(){
        System.out.println("hello ClassB");
    }

    public ClassB(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int Method4(){
        return y - x;
    }

    public int Method5(){
        return x + (2 * y);
    }
}
