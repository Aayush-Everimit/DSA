public class ScoreOfString
{
    public static void main(String args[])
    {
        String s = "zaz";
        int res = scoreOfString(s);
        System.out.println(res);
    }
    public static int scoreOfString(String s)
    {
        char[] carr = s.toCharArray();
        int count = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            count += Math.abs(s.charAt(i) - s.charAt(i + 1));
        }
        return count;
    }

}
