package Facebook_Leetcode;

//public class TaskScheduler {
//    public int taskScheduler(List<String> tasks, int n) {
//        if (tasks == null || tasks.length() == 0) {
//            return 0;
//        }
//        if (n == 0) {
//            return tasks.length();
//        }
//        Map<String, Integer> map = new HashMap<>();
//        int time = 0;
//        for (String task : tasks) {
//            if (map.containsKey(task)) {
//                int lastTime = map.get(task);
//                time = Math.max(lastTime + n + 1, time + 1);  // choose the bigger one
//            } else {
//                time = time + 1;
//            }
//            map.put(task, time);  // last time this task ID has appeard
//        }
//        return time;
//    }
//}
//
//
//
//// (c[25] - 1) * (n + 1) + 25 - i  is frame size
//// when inserting chars, the frame might be "burst", then tasks.length takes precedence
//// when 25 - i > n, the frame is already full at construction, the following is still valid.
//
//    //O(N) time O(26) space
//public class Solution {
//    public int leastInterval(char[] tasks, int n) {
//
//        int[] c = new int[26];
//        for(char t : tasks){
//            c[t - 'A']++;
//        }
//        Arrays.sort(c);
//        int i = 25;
//        while(i >= 0 && c[i] == c[25]) i--;
//
//        return Math.max(tasks.length, (c[25] - 1) * (n + 1) + 25 - i);
//    }
//}
