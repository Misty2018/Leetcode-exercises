package Facebook_Leetcode;

// 当 word -> abbreviation 在字典的所有abbreviation中不存在时， return true
// 当 word 在字典中存在时, 如果没有其他字典中的词有相同的abbreviation, return true

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//public class UniqueWordAbb {
//    Map<String, Set<String> > map = new HashMap<>();
//
//    public void uniqueWordAbb(String[] dictionary) {
//        for(int i=0; i<dictionary.length; i++) {
//            String s = dictionary[i];
//            if(s.length() > 2 ) {
//                s = s.charAt(0) + Integer.toString(s.length()-2) + s.charAt(s.length()-1);
//            }
//            if(map.containsKey(s) ) {
//                map.get(s).add(dictionary[i]);
//            } else {
//                Set<String> set = new HashSet<String>();
//                set.add(dictionary[i]);
//                map.put(s, set);
//            }
//
//        }
//    }
//
//    public boolean isUnique(String word) {
//        //input check
//        String s = word;
//        if(s.length() > 2 ) {
//            s = s.charAt(0) + Integer.toString(s.length()-2) + s.charAt(s.length()-1);
//        }
//        if(!map.containsKey(s)) return true; // word is not in dic
//        else return map.get(s).contains(word) && map.get(s).size()<=1; //word in dic,(set does not allow duplicates, so even more than one, size is still 1.
//
//    }
//
//    // method 2
//    Map<String, Integer> dict = new HashMap<>();
//    Map<String, Integer> abbr = new HashMap<>();
//
//    //* @param dictionary: a list of words
//    public void ValidWordAbbr(String[] dictionary) {
//        // do intialization if necessary
//        for (String s : dictionary) {
//            dict.put(s, dict.getOrDefault(s, 0) + 1);
//            abbr.put(getAbbr(s), abbr.getOrDefault(getAbbr(s), 0) + 1);
//        }
//    }
//
//    /*
//     * @param word: a string
//     * @return: true if its abbreviation is unique or false
//     */
//    public boolean isUnique(String word) {
//        // write your code here
//        return dict.getOrDefault(word, 0) == abbr.getOrDefault(getAbbr(word), 0);
//    }
//
//    private String getAbbr(String s) {
//        if (s.length() <= 2) {
//            return s;
//        }
//
//        s = s.substring(0, 1) + (s.length() - 2) + s.substring(s.length() - 1, s.length());
//        System.out.println(s);
//        return s;
//    }
//
///**
// * Your ValidWordAbbr object will be instantiated and called as such:
// * ValidWordAbbr obj = new ValidWordAbbr(dictionary);
// * boolean param = obj.isUnique(word);
// */
//
//
//
//
//}
//
//
