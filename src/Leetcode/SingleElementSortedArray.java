public class SingleElementSortedArray
{
    public int singleNonDuplicate(int[] nums)
    {
        int n = nums.length;
        for(int i = 0; i < n-1; i+=2)
        {
            if(nums[i+1]-nums[i] != 0)
            {
                return nums[i+1];
            }
        }
        return -1;
    }
}
