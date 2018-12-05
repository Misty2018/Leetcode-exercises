package Facebook_Leetcode;

//public class CommonFriends {
//    public List<String> recommendation(String name) {
//                List<String> res = new ArrayList<String>();
//                if (name==null || name.length()==0) return res;
//
//              List<String> friends = getFriends(name);
//                HashSet<String> set = new HashSet<String>();
//                 for (String friend : friends) {
//                         set.add(friend);
//                    }
//
//               HashMap<String, Integer> map = new HashMap<String, Integer>();
//                ArrayList<String>[] list = new ArrayList[friends.size()+1];
//
//        19         for (String friend : friends) {
//            20             List<String> ffriends = getFriends(friend);
//            21             for (String each : ffriends) {
//                22                 if (!set.contains(each) && !each.equals(name)) {
//                    23                     //map.put(each, map.getOrDefault(each, 0) + 1);
//                    24                     if (map.containsKey(each))
//                        25                         map.put(each, map.get(each)+1);
//                    26                     else map.put(each, 1);
//                    27                 }
//                28             }
//            29         }
//        30
//        31         for (String each : map.keySet()) {
//            32             int count = map.get(each);
//            33             if (list[count] == null) list[count] = new ArrayList<String>();
//            34             list[count].add(each);
//            35         }
//        36
//        37         for (int k=list.length-1; k>=0; k--) {
//            38             if (list[k] != null)
//                39                 res.addAll(list[k]);
//            40         }
//        41         return res;
//        42
//        43     }
//44
//}
//
//
