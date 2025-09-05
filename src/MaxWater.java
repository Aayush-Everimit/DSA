public class MaxWater
{
    public static void main(String[] args)
    {
        int[] height = {1,8,6,2,5,4,8,3,7};
        int n = height.length-1;
        int maxWater = 0;
        int width = 0;
        int h = 0;
        for(int left = 0, right = n; left < right ;)
        {
            h = Math.min(height[left], height[right]);
            width = Math.abs(right-left);
            maxWater = Math.max(maxWater, h*width);
            if(height[left] > height[right])
            {
                right--;
            }
            else
            {
                left++;
            }
        }
        System.out.println(maxWater);
    }
}
