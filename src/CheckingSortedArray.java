public class CheckingSortedArray
{
    public static void main(String[] args)
    {
        int[] arr = {5, 10, 15, 40, 50, 70, 80, 90, 100, 0};
        int i = 0;
        while(i < arr.length)
        {
            if(arr[i] > arr[i+1])
            {
                ++i;
                if(i == arr.length-1)
                {
                    System.out.println("Sorted Array");
                    System.out.println("Descending");
                }
            }
            else
                {
                System.out.println("Sorted Array");
                }
        }
    }
}
