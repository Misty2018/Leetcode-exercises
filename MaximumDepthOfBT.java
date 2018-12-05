package Facebook_Leetcode;

//public class MaximumDepthOfBT {
//    private int depth;
//
//    // recursion
//    private int maxDepth(TreeNode root){
//        depth = 0;
//        traverse(root, 1);
//        return depth;
//
//
//    }
//
//    private void traverse(TreeNode root, int currDepth){
//        if (root == null); return;
//
//        depth = Math.max(depth, currDepth);
//
//        traverse(root.left, currDepth + 1 );
//        traverse(root.right, currDepth + 1 );
//
//
//    }
//
//
//}


// divide and conquer
/*
 private int maxDepth(TreeNode root){
        if (root == null); return 0;
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        return Math.max(left, right) + 1;


    }

 */
