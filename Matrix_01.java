package Facebook_Leetcode;
import java.util.*;

public class Matrix_01 {
    public List<List<Integer>> updateMatrix(List<List<Integer>> matrix) {
        int m = matrix.size();
        int n = matrix.get(0).size();

        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix.get(i).get(j) == 0) {
                    queue.offer(new int[]{i, j});
                } else {
                    matrix.get(i).set(j, Integer.MAX_VALUE);
                }
            }
        }

        int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        while (!queue.isEmpty()) {
            int[] cell = queue.poll();
            for (int[] d : dirs) {
                int r = cell[0] + d[0];
                int c = cell[1] + d[1];
                if (r < 0 || r >= m || c < 0 || c >= n ||
                        matrix.get(r).get(c) <= matrix.get(cell[0]).get(cell[1]) + 1) continue;
                queue.add(new int[]{r, c});
                matrix.get(r).set(c, matrix.get(cell[0]).get(cell[1]) + 1);
            }
        }

        return matrix;
    }


//我们可以首先遍历一次矩阵，将值为0的点都存入queue，将值为1的点改为INT_MAX。之前像什么遍历迷宫啊，起点只有一个，
//        而这道题所有为0的点都是起点，这想法，叼！然后开始BFS遍历，从queue中取出一个数字，
//        遍历其周围四个点，如果越界或者周围点的值小于等于当前值，则直接跳过。因为周围点的距离更小的话，
//        就没有更新的必要，否则将周围点的值更新为当前值加1，然后把周围点的坐标加入queue

    public int[][] updateMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                // 把0元素加入队列中，以备波及影响周围元素
                if (matrix[i][j] == 0) {
                    queue.offer(new int[]{i, j});
                } else {

                    // 设为最大值，方便求0元素影响值
                    matrix[i][j] = Integer.MAX_VALUE;
                }
            }
        }

        // 上下左右
        int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        while (!queue.isEmpty()) {
            int[] cell = queue.poll();
            for (int[] d : dirs) {
                int r = cell[0] + d[0];
                int c = cell[1] + d[1];

                if (r < 0 || r >= m || c < 0 || c >= n ||
                        matrix[r][c] <= matrix[cell[0]][cell[1]] + 1) continue;
                // 上下左右取到的值

                queue.add(new int[]{r, c});
                matrix[r][c] = matrix[cell[0]][cell[1]] + 1;
            }
        }

        return matrix;
    }
}