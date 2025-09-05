public class NearestPerson
{
    public static void main(String args[])
    {
        int closest = findClosest(1,5,3);
        System.out.println(closest);
    }
    public static int findClosest(int x, int y, int z)
    {
        if(Math.abs(x - z)>Math.abs(y - z))
        {
            return 2;
        }
        else if(Math.abs(x - z)<Math.abs(y - z)){
                return 1;
        }
        return 0;
    }
}
