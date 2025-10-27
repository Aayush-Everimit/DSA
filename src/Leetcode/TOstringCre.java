import java.util.Arrays;

public class TOstringCre
{
    public static String mytostring(int[] input)
    {
        StringBuilder str = new StringBuilder("[");
        for(int i: input)
        {
            str.append(input[0]);
            if(i<input.length-1)
                str.append(", ");
        }
        str.append("]");
        return str.toString();
    }
    public static void main(String[] args)
    {
        int[][] a = new int[][]{{1,1,1,1,1},{6,6,6,6,6},{11,11,11,11,11}};
        for(int[] j : a)
        {
            System.out.println(mytostring(j));
        }
    }
}
