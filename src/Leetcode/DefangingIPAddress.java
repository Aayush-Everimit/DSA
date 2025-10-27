public class DefangingIPAddress
{
    public static void main(String[] args)
    {
        String address = "1.1.1.1";
        String answer = defangIPaddr(address);
        System.out.println(answer);
    }
    public static String defangIPaddr(String address)
    {
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < address.length(); i++)
        {
            if(address.charAt(i) == '.')
            {
                result.append("[.]");
            }
            else
                {
                result.append(address.charAt(i));
                }
        }
        return result.toString();
    }
}
