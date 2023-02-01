package leetcode;
class Solution {
    public double myPow(double x, int n) {
        if (n == Integer.MAX_VALUE) return x;
        else if (n == Integer.MIN_VALUE) return (x == 1 || x == -1) ? 1 : 0;
        if (n < 0) {
            x = 1 / x;
            n = -n;
        }
        double res = 1;
        while (n > 0) {
            if (n % 2 == 1) res = res * x;
            x = x * x;
            n = n / 2;
        }
        return res;
    }
}
