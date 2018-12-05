import java.util.LinkedList;
import java.util.Queue;

public class Maze {
    private final static int[] dx = {-1, 0, 0, 1};
    private final static int[] dy = {0, 1, -1, 0};

    public static void main(String[] args){
        Maze a = new Maze();
        int[][] maze_1 ={{1,1,1,1,1,1},{1,1,1,1,0,0},{0,0,1,0,0,0},{1,1,1,1,1,1},{1,0,0,0,0,0},{1,1,1,0,9,0}};
        int[][] maze_2 = {{9}};
        int[][] maze_3 = {{1,1,1,1},{1,0,0,0},{1,9,0,0}};
        int[][] maze_4 = {{1,0,0,0,0},{1,1,1,1,1},{1,0,0,0,1},{0,0,9,1,1}};
        int[][] maze = {{1,0,0,0,0},{1,1,1,1,1},{1,0,0,0,0},{0,0,9,0,0}};
        int c = a.Solution(maze_1);
        System.out.println(c);
    }


    public int Solution(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return 0;
        //if (matrix[0][0] == 0) {return 0;}
        if (matrix[0][0] == 9)
            return 1;
        int m = matrix.length, n = matrix[0].length;
        Queue<int[]> queue = new LinkedList<int[]>();
        queue.offer(new int[]{0, 0});
        int[][] visited = new int[m][n];
        visited[0][0] = 1;
        //matrix[0][0] = 1;
        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            for (int i = 0; i < 4; i++) {
                int[] next = {cur[0] + dx[i], cur[1] + dy[i]};
                if (next[0] >= 0 && next[0] < m && next[1] >= 0 && next[1] < n) {
                    if (matrix[next[0]][next[1]] == 9)
                        return 1;
                    else if (matrix[next[0]][next[1]] == 1 && visited[next[0]][next[1]] == 0) {
                        queue.offer(next);
                        //matrix[next[0]][next[1]] = 0;
                        visited[next[0]][next[1]] = 1;
                    }
                }
            }
        }
        return 0;
    }
}
