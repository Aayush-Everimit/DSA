import java.util.*;
public class ReverseArray
{
    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4,5,6,7,8};
        int temp = 0 ;

        for(int i = 0 , j = arr.length -1 ; i <= (arr.length/2); i++ , j--)
        {
            temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
