package btu;

public class Class6 {
    float x, y;

    public Class6(){

    }
    public Class6(float x){
        this.x = x;
    }
    public Class6(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float Method1(){
        float num1 = this.x, num2 = this.y;
        float temp;

        while(true){
            if(num1 == 0)
                return num2;
            else {
                temp = num1;
                num1 = (num2 % num1);
                num2 = temp;
            }
        }
    }

    public float Method2(){
        return (this.x * this.y) / this.Method1();
    }
}
