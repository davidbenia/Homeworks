package btu;

public class Class1 {
    int x, y, z;

    public int Method1(int x){
        this.x = x;

        return (2 * this.x) - 7;
    }

    public int Method2(int y, int z){
        this.y = y;
        this.z = z;

        return (3 * this.y) + this.z;
    }

    public int Method3(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;

        return (12 * this.y) - this.x + this.z;
    }
}
