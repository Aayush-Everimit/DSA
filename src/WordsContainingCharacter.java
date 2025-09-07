import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WordsContainingCharacter
{
    public static void main(String[] args)
    {
        String[] str = {"leet","code"};
        List<Integer> result =  findWordsContaining(str,'e');
        System.out.println(Arrays.toString(result.toArray()));
    }
    public static List<Integer> findWordsContaining(String[] words, char x)
    {
        List<Integer> list = new ArrayList<>();
        int counter = 0;
        for(String word : words)
        {
            if(word.contains(String.valueOf(x)))
            {
                list.add(counter);
            }
            counter++;
        }
        return list;
    }
}
