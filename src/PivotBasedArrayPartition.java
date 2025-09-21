import java.util.*;

public class PivotBasedArrayPartition
{
    public static void main(String[] args)
    {
        int[] nums = {-3,4,3,2};
        int pivot = 10;
        int[] result = pivotArray(nums, pivot);
        System.out.println(Arrays.toString(result));
    }
    public static int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        int[] result = new int[n];
        int countSmall = 0, countEqual = 0;

        for (int num : nums) {
            if (num < pivot) countSmall++;
            else if (num == pivot) countEqual++;
        }

        int left = 0, mid = countSmall, right = countSmall + countEqual;

        for (int num : nums) {
            if (num < pivot) result[left++] = num;
            else if (num == pivot) result[mid++] = num;
            else result[right++] = num;
        }

        return result;
    }

}
