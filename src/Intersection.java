import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Intersection
{
    public static void main(String[] args)
    {
        int[] nums1 = {1,2,2,1}, nums2 = {2,2};
        int[] result = intersection(nums1, nums2);
        System.out.println(Arrays.toString(result));
    }
    public static int[] intersection(int[] nums1, int[] nums2)
    {
        Set<Integer> set = new HashSet<>();
        for(int num:nums1)
        {
            set.add(num);
        }
        Set<Integer> intersection = new HashSet<>();
        for(int num:nums2)
        {
            if(set.contains(num))
            {
                intersection.add(num);
            }
        }
        int[] res = new int[intersection.size()];
        int i = 0;
        for(int num : intersection)
        {
            res[i++]= num;
        }
        return res;
    }
}
