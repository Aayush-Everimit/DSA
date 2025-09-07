public class DivisibleandNon_divisibleSumsDifference
{
    public static void main(String[] args)
    {
        int n = 5;
        int m = 1;
        int result = differenceOfSums(n, m);
        System.out.println(result);
    }
    public static int differenceOfSums(int n, int m)
    {
        int countdivi = 0;
        int countndivi = 0;
        int i = 1;
        while(i<=n)
        {
            if(i%m!=0)
            {
                countndivi+=i;
            }
            else
            {
                countdivi+=i;
            }
            i++;
        }
        return countndivi-countdivi;
    }
}
