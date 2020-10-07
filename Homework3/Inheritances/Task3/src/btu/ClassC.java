package btu;

public class ClassC extends ClassB{
    double z, r;

    public int Method7(){
        int[] nums = new int[]{x, y, (int)z, (int)r};
        int max = nums[0];

        for(int i = 0; i < nums.length; i++)
            if(nums[i] > max)
                max = nums[i];

        return max;
    }

    public double Method8(){
        return ((Math.pow(x, 2)) + (2 * y)) / (z - r) ;
    }

    public double Method9(){
        Method2();

        return ((y - x) / 3) + (r / (z + 4));
    }
}
