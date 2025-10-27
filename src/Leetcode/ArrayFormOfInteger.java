import java.util.ArrayList;
import java.util.List;

public class ArrayFormOfInteger
{

    public List<Integer> addToArrayForm(int[] num, int k) {
        String kStr = String.valueOf(k);
        int[] kArr = new int[kStr.length()];
        for (int i = 0; i < kStr.length(); i++) {
            kArr[i] = kStr.charAt(i) - '0';
        }

        int maxLength = Math.max(num.length, kArr.length) + 1;

        int[] paddedNum = new int[maxLength];
        int[] paddedK = new int[maxLength];
        System.arraycopy(num, 0, paddedNum, maxLength - num.length, num.length);
        System.arraycopy(kArr, 0, paddedK, maxLength - kArr.length, kArr.length);

        int[] resultArr = new int[maxLength];
        int carry = 0;
        for (int i = maxLength - 1; i >= 0; i--) {
            int sum = paddedNum[i] + paddedK[i] + carry;
            resultArr[i] = sum % 10;
            carry = sum / 10;
        }

        List<Integer> finalList = new ArrayList<>();
        int startIndex = (resultArr[0] == 0 && resultArr.length > 1) ? 1 : 0;
        for (int i = startIndex; i < resultArr.length; i++) {
            finalList.add(resultArr[i]);
        }

        if (finalList.isEmpty()) {
            finalList.add(0);
        }

        return finalList;
    }
}
