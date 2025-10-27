import java.util.*;

public class DistinctTriplets
{
    public static void main(String args[])
    {
        int[] nums = {-1,0,1,2,-1,-4};
        int n = nums.length;
        Set<List<Integer>> result = new HashSet<>();
        if(n < 3)
        {
        }
        else{
            for(int i=0;i<n;i++)
            {
                for(int j=i+1;j<n;j++)
                {
                    for(int k=j+1;k<n;k++)
                    {
                        if(isSumZero(nums[i],nums[j],nums[k])&&isDistinctIndex(i,j,k))
                        {
                            List<Integer> triplet = Arrays.asList(nums[i], nums[j], nums[k]);
                            Collections.sort(triplet);
                            result.add(triplet);
                        }
                    }
                }
            }
            System.out.println("Distinct triplets:"+result);
        }
    }
    public static boolean isSumZero(int i, int j, int k)
    {
        return  i+j+k==0;
    }
    public static boolean isDistinctIndex(int i, int j, int k)
    {
        return i != j && i != k && j != k;
    }
}
