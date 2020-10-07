package btu;

public class Class4 {
    double a, b, z;

    public double Method1(double a, double b, double z){
        this.a = a;
        this.b = b;
        this.z = z;

        return (this.a + Math.pow(this.b, 3) - 7) / (this.z + 8);
    }

    public double Method2(double a, double b, double z){
        this.a = a;
        this.b = b;
        this.z = z;

        return (this.a + this.z - Math.pow(this.b, 3)) / (this.z * this.a * this.b);
    }

    public double Method3(double a, double b, double z){
        this.a = a;
        this.b = b;
        this.z = z;

        return ((this.a * this.z) - this.b) / (this.z * this.b);
    }
}
