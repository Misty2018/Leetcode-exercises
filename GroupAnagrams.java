package Facebook_Leetcode;
import java.util.*;

// O(nlogn)

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) return new ArrayList<List<String>>();
        Map<String, List<String>> map = new HashMap<String, List<String>>();
        for (String s : strs) {
            char[] ca = s.toCharArray();
            Arrays.sort(ca);
            String keyStr = String.valueOf(ca);
            //for example,map didn't have the List [nat,tan,ant] and it came across "nat",
            // map will add a new ArrayList with a keyStr "ant";
            if (!map.containsKey(keyStr)) map.put(keyStr, new ArrayList<String>());
            // arraylist with a keyStr"ant" add s;
            map.get(keyStr).add(s);
        }

        //map.values() return a view of the values contained int this map,
        // it returns a Conllection,and then initialize the ArrayList.
        // If you want to see more details,seeing the java source code.
        return new ArrayList<List<String>>(map.values());
    }
}
