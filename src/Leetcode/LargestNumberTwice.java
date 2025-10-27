import java.util.Arrays;

public class LargestNumberTwice
{
    public int dominantIndex(int[] nums)
    {
        int n =  nums.length;
        if(nums.length == 1)
        {
            return 0;
        }
        int[] sortedArr = nums.clone();
        Arrays.sort(sortedArr);
        if(sortedArr[n-1]<2*sortedArr[n-2])
        {
            return -1;
        }
        else{
            for(int i= 0 ; i < n ; i++)
            {
                if(sortedArr[n-1]==nums[i])
                {
                    return i;
                }
            }
        }
        return -1;
    }
}
