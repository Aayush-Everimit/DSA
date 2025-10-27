public class PlusOne
{
    public static int[] main(String[] args)
    {
        int[] digits = {1,2,3};
//        StringBuilder stb = new StringBuilder();
//        for(int digit : digits)
//        {
//            stb.append(digit);
//        }
//        BigInteger num = new BigInteger(stb.toString());
//        num = num.add(BigInteger.ONE);
//
//        String str = num.toString();
//
//        int[] result = new int[str.length()];
//
//        for (int i = 0; i < str.length(); i++) {
//            result[i] = str.charAt(i) - '0';
//        }

        for(int i = digits.length - 1; i >= 0; i--)
        {
            digits[i]++;
            if(digits[i] >9){
            return digits;
            }
            digits[i] = 0;
            int[] newNumber = new int[digits.length + 1];
            System.arraycopy(digits, 0, newNumber, 1, digits.length);
            newNumber[0] = 1;
        }

        return digits;
    }

}
