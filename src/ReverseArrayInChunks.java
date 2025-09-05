import java.util.*;
public class ReverseArrayInChunks
{
    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int n = arr.length;
        int k = 4;
        int c = 0;
        int j = 0;
        for(int i = 0 ; i < n ; i+=k)
        {
            c = i;
            j=Math.min(c+k-1,n-1);
            while(c<j)
            {
                int temp = arr[c];
                arr[c++] = arr[j];
                arr[j--] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
