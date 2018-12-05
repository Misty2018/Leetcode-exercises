package Facebook_Leetcode;
import java.util.*;
public class VerticalOrder {
    public List<List<Integer>> verticalOrder(TreeNode root) {
        List<List<Integer>> results = new ArrayList<>();
        if (root == null) return results;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        Map<Integer, List<Integer>> map = new HashMap<>();
        LinkedList<Position> queue = new LinkedList<>();
        queue.add(new Position(root, 0));
        while (!queue.isEmpty()) {
            Position position = queue.remove();
            min = Math.min(min, position.column);
            max = Math.max(max, position.column);
            List<Integer> list = map.get(position.column);
            if (list == null) {
                list = new ArrayList<>();
                map.put(position.column, list);
            }
            list.add(position.node.val);
            if (position.node.left != null) queue.add(new Position(position.node.left, position.column-1));
            if (position.node.right != null) queue.add(new Position(position.node.right, position.column+1));
        }
        for(int i=min; i<=max; i++) {
            List<Integer> list = map.get(i);
            if (list != null) results.add(list);
        }
        return results;
    }
}
class Position {
    TreeNode node;
    int column;
    Position(TreeNode node, int column) {
        this.node = node;
        this.column = column;
    }




}
