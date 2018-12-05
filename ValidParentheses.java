package Facebook_Leetcode;
import java.util.*;

public class ValidParentheses {
    // o(n) iterate once
    // o(n) use o(n) space to build a stack

    // []{}()
    // {[}]
    // {
    // }

    private boolean isValidParenthese(String s){
        // s is empty or s length is 0 (" ")
        if (s == null || s.length() == 0){
            return true;
        }

        Stack<Character> stack = new Stack<>();

        for (Character a : s.toCharArray()){
            if (a == '(') stack.push(')');
            else if(a == '[') stack.push(']');
            else if(a == '{') stack.push('}');
            else{
                   // "}" or "]" or ")"
                if(stack.isEmpty() || stack.pop() != a) return false;
            }

        }
        return stack.isEmpty();
    }

}
