package dfs_bfs;

public class MovingCount {
    public int movingCount(int m, int n, int k) {
        boolean[][] vis = new boolean[m][n];
        return dfs(vis, m, n, k, 0, 0);
    }

    private int dfs(boolean[][] vis, int m, int n, int k, int i, int j) {
        if (i >= m || j >= n || vis[i][j] || sum(i) + sum(j) > k)
            return 0;
        vis[i][j] = true;
        return 1 + dfs(vis, m, n, k, i + 1, j) + dfs(vis, m, n, k, i, j + 1);
    }

    private int sum(int p) {
        int sum = 0;
        while (p > 0) {
            sum += p % 10;
            p /= 10;
        }
        return sum;
    }
}
