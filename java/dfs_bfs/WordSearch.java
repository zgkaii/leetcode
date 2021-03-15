package dfs_bfs;

/**
 * @Author: Mr.Z
 * @DateTime: 2021/03/14
 * @Description: 79. 单词搜索 https://leetcode-cn.com/problems/word-search/
 */
public class WordSearch {

  public boolean exist(char[][] board, String word) {
    char[] words = word.toCharArray();
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board[0].length; j++) {
        // 从[i, j]开启深度优先搜索
        if (dfs(board, words, i, j, 0)) return true;
      }
    }
    return false;
  }

  private boolean dfs(char[][] board, char[] word, int i, int j, int index) {
    // 边界条件，越界直接return false
    if (
      (i >= board.length || i < 0) ||
      (j >= board[0].length || j < 0) ||
      board[i][j] != word[index]
    ) return false;
    // word字符都查找完了，直接返回true
    if (index == word.length - 1) return true;
    // 保存当前坐标的值
    char tmp = board[i][j];
    // 修改当前坐标的值
    board[i][j] = '.';
    // 沿着当前坐标的上下左右4个方向查找
    boolean res =
      dfs(board, word, i + 1, j, index + 1) ||
      dfs(board, word, i - 1, j, index + 1) ||
      dfs(board, word, i, j + 1, index + 1) ||
      dfs(board, word, i, j - 1, index + 1);
    // 递归之后再把当前的坐标复原
    board[i][j] = tmp;
    return res;
  }
}
