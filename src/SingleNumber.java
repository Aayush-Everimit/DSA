import java.util.Arrays;

public class SingleNumber
{
    public static void  main(String[] args)
    {
        int[] nums = {3,1,3,1,2};
        int answer = singleNumber(nums);
        System.out.println(answer);
    }
    public static int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 0; i < n - 1; i += 2) {
            if (nums[i] != nums[i + 1]) {
                return nums[i];  // Found the single number
            }
        }
        return nums[n - 1];  // Single number is the last element
    }
}
