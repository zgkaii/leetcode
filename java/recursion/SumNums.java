package recursion;

public class SumNums {
    public int sumNums(int n) {
        // 当 n = 1 时 n > 1 不成立 ，此时 “短路” ，终止后续递归
        boolean x = n > 1 && (n += sumNums(n - 1)) > 0;
        return n;
    }
}
