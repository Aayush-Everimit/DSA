public class ValueAfterOperation
{
    public static void main(String[] args)
    {
        String[] operations ={"--X", "X++", "X++"};
        int res = finalValueAfterOperations(operations);
        System.out.println(res);
    }
    public static int finalValueAfterOperations(String[] operations)
    {
        int V = 0;
        for(String operation : operations)
        {
            if(operation.contains("++"))
            {
                V++;
            }
            else if(operation.contains("--"))
            {
                V--;
            }
        }
        return V;
    }
}
