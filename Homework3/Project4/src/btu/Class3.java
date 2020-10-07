package btu;

public class Class3 {
    double a, b;

    public double Method1(double a, double b){
        this.a = a;
        this.b = b;

        return ((4 * Math.pow(this.a, 2)) / this.b) - 1;
    }

    public double Method2(double a, double b){
        this.a = a;
        this.b = b;

        return ((3 * Math.pow(this.a, 3)) / 2) - Math.pow(this.b, 2);
    }
}
