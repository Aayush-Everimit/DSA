public class MaxAchievableNumber
{
    public  static void main(String[] args)
    {
        int num = 3;
        int t = 2;
        int result = theMaximumAchievableX(num,t);
        System.out.println(result);
    }
    public static int theMaximumAchievableX(int num, int t)
    {
        return num+t+t;
    }
}
