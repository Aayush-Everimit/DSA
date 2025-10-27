public class RotateArrayBackward
{
    public static void main(String[] args)
    {
        int k = 3;
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int n = arr.length;
        int[] arr2 = new int[k];
        int[] arr3 = new int[n-k];

        for(int i = 0; i < k; i++)
        {
            arr2[i] = arr[k-i-1];
        }
        for(int i = k,j=0; i < n ; i++,j++)
        {
            arr3[j] = arr[i];
        }


    }
}
