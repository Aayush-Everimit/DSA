import java.util.Arrays;
public class Search
{
    public static int linearSearch(int[] arr, int key )
    {
        int n = arr.length;
        for(int i=0;i<n;i++)
        {
            if (key==arr[i])
            {
                return i;
            }
        }
        return -1;
    }
    public static int  binarySearch(int[] arr, int key )
    {
        int n = arr.length;

        return n;
    }

    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int key = 19;
        System.out.println(linearSearch(arr,key));

    }
}
