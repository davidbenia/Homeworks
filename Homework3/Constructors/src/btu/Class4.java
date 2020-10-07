package btu;

public class Class4 {
    int x, y;

    public Class4(){
        System.out.println("hello Class4");
    }

    public int Method1(int x, int y){
        this.x = x;
        this.y = y;

        if(this.x > 0)
            return (4 * this.x) - this.y;
        else if(this.x <= 0)
            return (2 * this.x) + this.y;

        return 0;
    }

    public int Method2(int x, int y){
        this.x = x;
        this.y = y;

        if(this.y > 0)
            return (4 * this.x) + this.y;
        else if(this.y <= 0)
            return (2 * this.x) - this.y;

        return 0;
    }
}
