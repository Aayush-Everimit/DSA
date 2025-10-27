import java.util.Arrays;

public class SquareOfSortedArray
{
    public int[] sortedSquares(int[] nums)
    {
        int n = nums.length;
        int[] res = new int[n];
        for(int num = 0 ; num < n; num++)
        {
           res[num] = nums[num] * nums[num];
        }
        Arrays.sort(res);
        return res;
    }
}
