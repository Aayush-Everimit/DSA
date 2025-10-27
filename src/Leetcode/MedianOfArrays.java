import java.util.*;
public class MedianOfArrays
{
    public static void main(String[] args)
    {
        int[] nums1 = {1,3};
        int[] nums2 = {2,4};
        int x = nums1.length;
        int y = nums2.length;
        int z = x+y;
        int[] arr = new int[z];
        System.arraycopy(nums1, 0, arr, 0, x);
        System.arraycopy(nums2, 0, arr, x, y);
        Arrays.sort(arr);

        if(z % 2 == 0)
        {
            double median = (arr[z/2]+arr[(z/2)-1])/2.0;
            System.out.printf("%.5f\n", median);
        }
        else
        {
            double median = arr[Math.abs(z/2)];
            System.out.printf("%.5f\n", median);
        }
    }
}
