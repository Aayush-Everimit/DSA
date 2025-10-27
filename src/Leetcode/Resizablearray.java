public class Resizablearray
{
    private int[] arr;
    int p = -1;
    public Resizablearray()
    {
        this(10);
    }
    public Resizablearray(int size)
    {
        arr = new int[size];
    }
    public void add(int num)
    {
        arr[++p] = num;
    }
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
}
