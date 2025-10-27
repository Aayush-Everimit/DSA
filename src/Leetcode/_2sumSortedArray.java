public class _2sumSortedArray
{
    public int[] twoSum(int[] numbers, int target)
    {
        int n = numbers.length;
        int maxSum = numbers[n-1]+numbers[n-2];
        if(maxSum<target)
        {
            return new int[0];
        }
        else{
            int left = 0;
            int right = n-1;
            while(left < right) {
                int store = numbers[left]+numbers[right];
                if(store>target)
                {
                    right--;
                }
                else if(store==target)
                {
                    return new int[]{left+1,right+1};
                } else if (store<target) {
                    left++;
                }
            }
            return new int[0];
        }
    }
}
