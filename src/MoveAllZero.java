import java.util.*;
public class MoveAllZero
{
    public static void main(String[] args)
    {
        int[] arr = {11,9,0,15,0,0,5,6};
        int n = arr.length;
        int j = 0;
        for(int i = 0 ; i < n ; i++)
        {
                 arr[j++]= arr[i];
        }
        if(j != 0)
        {
            while(j<n)
            {
                arr[j++]=0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
