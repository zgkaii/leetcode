package matrix;

/**
 * 59. 螺旋矩阵 II https://leetcode-cn.com/problems/spiral-matrix-ii/
 */
public class SpiralMatrix {
    public int[][] generateMatrix(int n) {
        // -->
        // 01 01 01 01
        // 01 02 02 01
        // 01 02 02 01
        // 01 01 01 01
        // 从最外层依次往内层填入元素
        // 1. 从左向右填入上侧元素，依次为(top,left)到(top,right)
        // 2. 从上到下填入右侧元素，依次为(top+1,right)到(bottom,right)
        // 3. left<right且top<bottom，则从右向左填入下侧元素，依次为(bottom,right-1)到(bottom,left+1)
        // 4. 从下往上填入左侧元素，依次为(bottom,left)到(top+1,left)
        // 填完当前层的元素之后，left和top分别增加1，right和bottom分别减少1，进入下一层继续填入元素，直到填完所有元素为止。
        int[][] ret = new int[n][n];
        int left = 0, top = 0;
        int right = n - 1, bottom = n - 1;
        int count = 1;
        while (left <= right) {
            for (int j = left; j <= right; j++) {
                ret[top][j] = count++;
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                ret[i][right] = count++;
            }
            right--;
            for (int j = right; j >= left; j--) {
                ret[bottom][j] = count++;
            }
            bottom--;
            for (int i = bottom; i >= top; i--) {
                ret[i][left] = count++;
            }
            left++;
        }
        return ret;
    }
}
