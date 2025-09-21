import java.util.Arrays;

public class ArrayByParity
{
    public static void main(String[] args)
    {
        int[]  nums = {4,3,2,1};
        int[] res = transformArray(nums);
        System.out.println(Arrays.toString(res));
    }
    public static int[] transformArray(int[] nums)
    {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] % 2 == 0) {
                nums[i] = 0;
            }
        }
        for (int i = 0; i < n; i++) {
            if (nums[i] % 2 != 0) {
                nums[i] = 1;
            }
        }
        Arrays.sort(nums);
        return nums;
    }
}
