import java.util.*;
//import.java.util.HashMap;


public class isValid {
    public static void main(String[] args){
        int a = isValid("     ()");
        System.out.println(a);
    }
    public static int isValid(String s) {
        if(!s.contains("(")){
            return -1;
        }

        HashMap<Character, Character> map = new HashMap<Character, Character>();
        map.put('(', ')');
        //map.put('[', ']');
        //map.put('{', '}');

        Stack<Character> stack = new Stack<Character>();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);

            if (map.keySet().contains(curr)) {
                stack.push(curr);
            } else if (map.values().contains(curr)) {
                if (!stack.empty() && map.get(stack.peek()) == curr) {
                    stack.pop();
                    count++;
                }
            }
        }
        if (stack.empty()) {
            return count;
        }
        return -1;
    }
}
