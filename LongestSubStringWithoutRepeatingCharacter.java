package Facebook_Leetcode;
import java.util.HashMap;
import java.util.HashSet;

//Given a string, find the length of the longest substring without repeating characters.
//
//        Examples:
//
//        Given "abcabcbb", the answer is "abc", which the length is 3.
//
//        Given "bbbbb", the answer is "b", with the length of 1.
//
//        Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.

public class LongestSubStringWithoutRepeatingCharacter {

    public static void main(String[] args){
        LongestSubStringWithoutRepeatingCharacter objext_for_test = new LongestSubStringWithoutRepeatingCharacter();
        String stringForTest = "abcdzac";
        int a = objext_for_test.longestWithoutRepeating(stringForTest);
        System.out.println(a);

    }

    public int longestWithoutRepeating(String s){
        if(s==null || s.length()==0){
            return 0;
        }

        HashSet<Character> set = new HashSet<Character>();

        int maxLength = 0; int i = 0,j = 0;

        while(j<s.length()){
            if (!set.contains(s.charAt(j))){
                set.add(s.charAt(j));
                j++;
                maxLength = Math.max(maxLength, set.size());
            } else{
                set.remove(s.charAt(i));
                i++;
            }
        }
        return maxLength;


    }

    //test 1: ahcheradfkglkjeh
    // i    j
    // 3    2  res 2
    // 6    2  res:5
    // 12  10  res:3


    public int longestWithoutRepeating_1(String s){
        if(s==null || s.length()==0){
            return 0;
        }

        HashMap<Character, Integer> hashmap = new HashMap<Character, Integer>();

        int res = 0;

        for (int i = 0, j = 0; i < s.length(); i++){
            if (hashmap.containsKey(s.charAt(i))){
                j = Math.max(j , hashmap.get(s.charAt(i)) + 1);
            }
            hashmap.put(s.charAt(i), i);
            res = Math.max(res, i - j + 1);

        }

        return res;


    }


}
