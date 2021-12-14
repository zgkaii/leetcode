package dfs_bfs;

public class ColorBorder {
    public int[][] colorBorder(int[][] grid, int row, int col, int color) {
        boolean[][] vis = new boolean[grid.length][grid[0].length];
        // 1.找到连通分量边界
        find(grid, row, col, grid[row][col], vis);
        // 2.填充边界
        fill(grid, color, vis);
        return grid;
    }

    public void find(int[][] grid, int r, int c, int val, boolean[][] vis) {
        // 终结条件
        if (r >= grid.length || c >= grid[0].length || r < 0 || c < 0 || grid[r][c] != val || vis[r][c]) {
            return;
        }
        // 深入优先搜索
        if (grid[r][c] == val) {
            vis[r][c] = true;
            find(grid, r - 1, c, val, vis);
            find(grid, r + 1, c, val, vis);
            find(grid, r, c - 1, val, vis);
            find(grid, r, c + 1, val, vis);
        }
    }

    public void fill(int[][] grid, int color, boolean[][] vis) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (vis[i][j] == true) {
                    // 元素位于边界上，着色
                    if (i + 1 >= grid.length || j + 1 >= grid[0].length || i - 1 < 0 || j - 1 < 0) {
                        grid[i][j] = color;
                        // 所有4个邻居都被标记，该元素位于中间，避免为该框着色
                    } else if (!(vis[i + 1][j] && vis[i - 1][j] && vis[i][j - 1] && vis[i][j + 1])) {
                        grid[i][j] = color;
                    }
                }
            }
        }
    }
}
