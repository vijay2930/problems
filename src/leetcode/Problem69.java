package leetcode;
class Solution {
    public int mySqrt(int x) {
    if (x < 2) {
        return x;
    }
    int left = 1, right = x;
    while (left <= right) {
        int mid = left + (right - left) / 2;
        if (mid <= x / mid) {
            left = mid + 1;
        } else {
            right = mid - 1;
        }
    }
    return left - 1;
    }
}
