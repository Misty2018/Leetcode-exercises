package Facebook_Leetcode;

//public class InvertTree {
//
//    //BFS ; level order obe by one
//    public TreeNode invertTree(TreeNode root) {
//
//        if (root == null) {
//            return null;
//        }
//
//        final Queue<TreeNode> queue = new LinkedList<>();
//        queue.offer(root);
//
//        while(!queue.isEmpty()) {
//            final TreeNode node = queue.poll();
//            final TreeNode left = node.left;
//            node.left = node.right;
//            node.right = left;
//
//            if(node.left != null) {
//                queue.offer(node.left);
//            }
//            if(node.right != null) {
//                queue.offer(node.right);
//            }
//        }
//        return root;
//    }
//}
//
//// recursive
//public TreeNode invertTree(TreeNode root) {
//    if (root == null) return null;
//    TreeNode temp = root.left;
//    root.left = invertTree(root.right);
//    root.right = invertTree(temp);
//    return root;
//}
