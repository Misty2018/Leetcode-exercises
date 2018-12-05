package Facebook_Leetcode;

//public class ValidBT {
//
//    static boolean valid(TreeNode[] arr) {
//        Set<TreeNode> set = new HashSet<>();
//        for (TreeNode root: arr) {
//            if (set.contains(root.left)) {
//                return false;
//            }  . from: 1point3acres
//            if (set.contains(root.right)) {
//                return false
//            }
//            if (root.left != null)
//                set.add(root.left);. From 1point 3acres bbs
//            if (root.right != null)
//                set.add(root.right);
//        }
//        // 就剩下根不在set里面
//        if (set.size() != arr.length - 1) {
//            return false;
//        }. 留学申请论坛-一亩三分地
//        // 检验这些node 是否在tree的集合里.本文原创自1point3acres论坛
//        int cnt = 0;
//        for (TreeNode root: arr) {
//            if (set.contains(root))
//                cnt++;. 留学申请论坛-一亩三分地
//        }
//        return arr.length - cnt == 1;
//    }
//
//}
//
//
//
//    private static bool ValidBT(Node[] A)
//    {
//        int len = A.Length;
//        if (len < 2) return true;
//
//        // HashSet store all the nodes and remove them if they are the children of others;
//        HashSet<Node> hSet = new HashSet<Node>();
//        for (int i = 0; i < len; i++) hSet.Add(A);. 牛人云集,一亩三分地
//        for (int i = 0; i < len; i++)
//        {
//            // Invalid Node return false;
//            if (A.Children.Count > 2) return false;
//            for (int n = 0; n < A.Children.Count; n++) hSet.Remove(A.Children[n]);. from: 1point3acres
//        }
//
//        // If it's not exactly 1 root, return false;
//        if (hSet.Count != 1) return false;
//        Node root = hSet.ToArray()[0];
//        Queue<Node> que = new Queue<Node>(root.Children);
//        HashSet<Node> layerVisit = new HashSet<Node>();
//        while (que.Count > 0)
//        {
//            int cnt = que.Count();. 1point3acres
//
//
//            layerVisit.Clear(); 来源一亩.三分地论坛.
//            for (int i = 0; i < cnt; i++)
//            {
//                Node tmpN = que.Dequeue();. more info on 1point3acres
//
//                // If the node existed in the visited nodes, return false;
//                if (!hSet.Add(tmpN)) return false;. From 1point 3acres bbs
//                // If there is left, right relationship in the same layer return false;
//                if (layerVisit.Contains(tmpN)) return false;
//                if (tmpN.Children.Count > 0) layerVisit.UnionWith(tmpN.Children.ToArray());
//            foreach (Node node in layerVisit) que.Enqueue(node);
//        }
//
//        return true;
//    }
//
