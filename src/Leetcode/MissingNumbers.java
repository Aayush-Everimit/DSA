import java.util.Arrays;

public class MissingNumbers
{
    public static void  main(String[] args)
    {
        int[] nums = {9,6,4,2,3,5,7,0,1};
        int answer = missingNumber(nums);
        System.out.println(answer);
    }
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);

        if (n == 0 || nums[0] != 0) {
            return 0;
        }

        int i = 0;
        while (i < n - 1) {
            if (nums[i + 1] - nums[i] != 1) {
                return nums[i] + 1;
            }
            i++;
        }

        return nums[n - 1] + 1;
    }
}

