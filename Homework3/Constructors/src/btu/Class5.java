package btu;

public class Class5 {
    float x, y;

    public Class5(){

    }
    public Class5(float x){
        this.x = x;
    }

    public float Method1(float y){
        this.y = y;

        if(this.y != 0)
            return (x / this.y) + (x * this.y);
        else if(x <= 0)
            return (float)Math.pow(x, 4) + this.y;

        return 0;
    }

    public float Method2(float y){
        this.y = y;

        if(this.x < this.y || this.x == this.y)
            return this.x;
        else
            return this.y;
    }
}
