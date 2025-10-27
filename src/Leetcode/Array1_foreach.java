import java.util.Arrays;

public class Array1_foreach
{
    public static void main(String[] args)
    {
        int[][] a = new int[][]{{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};
        for(int[] j : a)
        {
            System.out.println(Arrays.toString(j));
        }
    }
}
