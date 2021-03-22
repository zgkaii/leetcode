package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: Mr.Z
 * @DateTime: 2021/01/29 14:47
 * @Description: 51. N 皇后 https://leetcode-cn.com/problems/n-queens/
 *               <p>
 *               n 皇后问题 研究的是如何将 n 个皇后放置在 n×n 的棋盘上，并且使皇后彼此之间不能相互攻击。
 *               皇后彼此不能相互攻击，也就是说：任何两个皇后都不能处于同一条横行、纵行或斜线上。
 *               <p>
 *               输入：n = 2 || n = 1 || n = 3(无解法) 输出：[["Q"]]
 *               <p>
 *               输入：n = 4
 *               输出：[[".Q..","...Q","Q...","..Q."],["..Q.","Q...","...Q",".Q.."]]
 */
public class NQueens {
    public List<List<String>> solveNQueens1(int n) {
        char[][] board = new char[n][n]; // 用二维char数组初始化棋盘
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                board[i][j] = '.';
        List<List<String>> res = new ArrayList<>();
        backtrack(res, board, 0);
        return res;
    }

    private void backtrack(List<List<String>> res, char[][] board, int row) {
        if (board.length == row) {
            res.add(charArrayToList(board)); // 将char二维数组放入List中
            return;
        }
        int n = board[row].length - 1;
        for (int col = 0; col <= n; col++) {
            if (!isValid(board, row, col))
                continue; // 调用isValid(),排除不合法选项
            board[row][col] = 'Q'; // 放置皇后
            backtrack(res, board, row + 1); // 递归查询并放置下一个皇后
            board[row][col] = '.'; // 撤销选择
        }
    }

    public static boolean isValid(char[][] board, int row, int col) {
        // 检查正上方冲突(列冲突)(由于是从上往下的来一个一个排列 所以不用检查下方的棋盘)
        for (int r = 0; r < board.length; r++)
            if (board[r][col] == 'Q')
                return false;
        // 检查左上方
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--)
            if (board[i][j] == 'Q')
                return false;
        // 检查右上方
        for (int i = row - 1, j = col + 1; i >= 0 && j < board[i].length; i--, j++)
            if (board[i][j] == 'Q')
                return false;
        return true;
    }

    public static List<String> charArrayToList(char[][] board) {
        List<String> list = new ArrayList<>();
        for (char[] c : board) {
            String str = new String(c);
            list.add(str);
        }
        return list;
    }

    List<List<String>> ans = new ArrayList<>();

    public List<List<String>> solveNQueens(int n) {
        int[] queens = new int[n]; // 记录每行中皇后所在的位置
        dfs(n, 0, 0, 0, 0, queens);
        return ans;
    }

    // col当前行，row当前列，left左上，right右上
    public void dfs(int n, int row, int col, int left, int right, int[] queens) {
        if (row == n) { // 回溯
            ans.add(generateString(queens));
            return;
        }
        //   0 1 2 3	col 0100   right 0010  left 1000   1110 & 1111 = 0111 
        // 0 . . Q .    . . Q .	   . . Q .	   . . Q .     . . Q .       1 不能放置
        // 1 . . . .    . . X .	   . X . .	   . . . X     . X X X       0 能放置
        int bits = ((1 << n) - 1) & ~(col | left | right);
        while (bits > 0) {
            int pick = bits & (-bits); // 获取最低1位 0001
            int tmp = pick, placeTmp = -1;
            while (tmp > 0) { // 尝试在最低位放置皇后
                tmp = tmp >> 1;
                placeTmp++;
            }
            queens[row] = placeTmp;
            // 列从左到右 -> 二进制地位到高位 故应该left右移一位 right左移1位
            dfs(n, row + 1, col | pick, (left | pick) << 1, (right | pick) >> 1, queens);
            bits = bits & (bits - 1); // 最低位1设置为0，回复
        }
    }

    // 将皇后位置保存进字符串
    public List<String> generateString(int[] queens) {
        List<String> res = new ArrayList<>();
        for (int i : queens) {
            char[] chars = new char[queens.length];
            Arrays.fill(chars, '.');
            chars[i] = 'Q';
            res.add(String.valueOf(chars));
        }
        return res;
    }

}
