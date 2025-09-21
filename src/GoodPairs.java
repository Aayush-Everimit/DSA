public class GoodPairs
{
    public static void main(String[] args)
    {
        int[] nums = {1,1,1,1};
        int goodPairs = numIdenticalPairs(nums);
        System.out.println(goodPairs);
    }
//    public static int numIdenticalPairs(int[] nums)
//    {
//        int goodPairs = 0;
//        int n = nums.length;
//        int i = 0;
//        while(i<n)
//        {
//            for(int j = 0; j < n; j++)
//            {
//                if(nums[i] == nums[j] && i<j)
//                    goodPairs++;
//            }
//            i++;
//        }
//        return goodPairs;
//    }
public static int numIdenticalPairs(int[] nums)
{
    int[][] arr = new int[nums.length][2];
    int goodPairs = 0;
    int n = nums.length;
    for(int i = 0,j=n-1; i < n; i++,j--)
    {
        if(nums[i] == nums[j])
        {
            if(i<j || i>j)
            {

            }
        }
    }
    return goodPairs;
}
}
