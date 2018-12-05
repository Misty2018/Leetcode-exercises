package Facebook_Leetcode;

import java.util.HashMap;
import java.util.HashSet;

public class LongestSubwithRepeatingCharacter {



    public static void main(String[] args){
        LongestSubwithRepeatingCharacter objext_for_test = new LongestSubwithRepeatingCharacter();
        String stringForTest = "sdazvuayscd";
        int a = objext_for_test.longestWithRepeating(stringForTest);
        System.out.println(a);

    }

    public int longestWithRepeating(String s){
        if(s==null || s.length()==0){
            return 0;
        }

        HashMap<Character,Integer> hashmap = new HashMap<Character,Integer>();

        int maxLength = 0; //int i=0,j=0;

        for (int i = 0, j = 0; i < s.length(); i++){
            if (hashmap.containsKey(s.charAt(i))){
                j = hashmap.get(s.charAt(i));
                maxLength = Math.max(maxLength, i - j + 1);
            }
            hashmap.put(s.charAt(i), i);


        }
        return maxLength;



    }


}
