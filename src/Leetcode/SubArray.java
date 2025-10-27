import java.util.*;
public class SubArray
{
    public static void main(String[] args)
    {
        int[] arr = {10,20,30,40};
        int k = 1;
        int[] dummy = new int[k];
        int n = arr.length;
        for(int i=0;i<n;i++)
        {
            StringBuffer sb = new StringBuffer();
            for(int j=i;j<n;j++)
            {
                sb.append(arr[j]);
                sb.append(" ");
                System.out.println(sb.toString());
            }
        }
    }
}
