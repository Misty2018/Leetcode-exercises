/*

import java.util.LinkedList;

class Node {
    int val;
    Node next;
    Node(int x) { val = x; }
}

public class findMazePath {


    public static void main (String[] args){
        //ways to invoke static and nonstatic methods;
        //static: using class name : TwoSum.twoSum(int 1, int2);
        //non-static: using object name(instance name)
        /*when to use them: when you are considering create a very specific instances, using non-static
           otherwise, if its a widely shared. use static.
           Note: static method can not access non static variable.


        // TwoSum c = new TwoSum();
        //int d = c.twoSum(1,2);
        TwoSum object= new TwoSum();
        int[] a = new int[]{2, 4, 5, 3, 6};
        //object.twoSum(a, 8);
        //int[] d= object.twoSum(a, 8);
        System.out.println("the result is " +  object.twoSum(a, 8));
        /*for (int i=0; i<d.length; i++){
            System.out.println(d[i]);
        }

    }

    private static boolean bfs(int[][] maze, int startx, int starty) {
        // TODO Auto-generated method stub
        if(maze == null)
            return false;
        if(maze.length == 0 || maze[0].length == 0)
            return false;
        LinkedList<Node>queue = new LinkedList<Node>();
        int[][] Direction = {{-1,0}, {0, -1}, {1, 0}, {0, 1}}; //方向：左上右下
        Node n1 = new Node(0, 0, maze[0][0]);
        queue.offer(n1);

        int M = maze.length;
        int N = maze[0].length;

        while (!queue.isEmpty()) {
            Node node = queue.poll();
            if (node.val == 9) {
                return true;
            }
            for(int i = 0; i < 4; i++){
                int x = node.x + Direction[i][0];
                int y = node.y + Direction[i][1];
                //bfs
                if(x >= 0 && x < M && y >= 0 && y < N && maze[x][y] > 0){
                    Node newNode = new Node(x, y, maze[x][y]);
                    queue.offer(newNode);
                    maze[x][y] = -1;
                }
            }
        }
        return false;
    }
*/