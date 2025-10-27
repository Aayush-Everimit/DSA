import java.util.LinkedHashSet;

public class minimumOperationstoMakeArrayDistinct
{
    public static void main(String args[])
    {
        int[] arr = {1,2,3,4,2,3,3,5,7};
        int n = minimumOperations(arr);
        System.out.println(n);
    }
    public static int minimumOperations(int[] nums)
    {
        LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
        for (int num : nums) {
            set.add(num);
        }
        if (set.size() == nums.length) {
            return 0;
        } else {
            return counters(nums);
        }
    }
    public static int counters(int[] nums) {
        int counter = 0;
        while (nums.length > 0) {
            LinkedHashSet<Integer> set = new LinkedHashSet<>();
            for (int num : nums) {
                if (!set.add(num)) {

                    counter++;
                    int removeCount = Math.min(3, nums.length);
                    int[] temp = new int[nums.length - removeCount];
                    if (temp.length > 0) {
                        System.arraycopy(nums, removeCount, temp, 0, temp.length);
                    }
                    nums = temp;
                    break;
                }
            }
            if (set.size() == nums.length) {

                break;
            }
        }
        return counter;
    }
}
