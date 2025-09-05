import java.util.Arrays;
public class BestDayToBuyANdSellStock
{
    public static void main(String[] args)
    {
        int[] prices = {7,1,5,3,6,4};
        int[] operation = result(prices,prices);
        int lowest = operation[0];
        int highest = operation[1];
        System.out.println(highest-lowest);
    }
    public static int[] result(int[] k,int[] M)
    {
        int n = k.length;
        int count = 0;
        Arrays.sort(k);
        for(int i=0;i<n;i++)
        {
            if(M[i]==k[0])
            {
                count=i;
                break;
            }

        }
        return new int[]{k[0],k[k.length-1]};
    }
}
