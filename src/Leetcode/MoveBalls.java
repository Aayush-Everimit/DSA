import java.util.Arrays;

public class MoveBalls
{
    public static void main(String[] args)
    {
        String str = "110" ;
        int[] result = minOperations(str);
        System.out.println(Arrays.toString(result));
    }
    public static int[] minOperations(String boxes)
    {
        char[] balls = boxes.toCharArray();
        int[] result = new int[balls.length];
        int n = balls.length;
        int count = 0;
        for(int j=0;j<n;j++)
        {
            count=0;
            for(int i = 0; i<n;i++)
            {
                if(balls[i]=='1')
                {
                    count+=Math.abs(i-j);
                }
            }
            result[j] = count;
        }
        return result;
    }
}
