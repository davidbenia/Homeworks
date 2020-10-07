package btu;

public class ClassC extends ClassB{
    double z = 15;

    public int Method6(){
        return (x + y + (int)z) / 3;
    }

    public double Method7(){
        double sum = x * y * z;

        return Math.pow(sum, 1 / 3);
    }

    public int Method8(){
        int temp = (int)z;
        int[] nums = new int[]{x, y, temp};
        int max = nums[0];

        for(int i = 0; i < nums.length; i++)
            if(nums[i] > max)
                max = nums[i];

        return max;
    }
}
