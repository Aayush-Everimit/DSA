import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        for (char c : s.toCharArray()) {
            if (c == '[' || c == '{' || c == '(') {
                stack.push(c);
            }
            else {
                if (stack.isEmpty()) {
                    return false;
                }

                char topChar = stack.pop();

                if ((c == ')' && topChar != '(') ||
                        (c == '}' && topChar != '{') ||
                        (c == ']' && topChar != '[')) {
                    return false;
                }
            }
        }

       return stack.isEmpty();
    }
}