package leetcode;
class Solution {
    public int myAtoi(String str) {
    if (str == null || str.length() == 0) {
        return 0;
    }
    int sign = 1;
    int i = 0;
    long res = 0;
    while (i < str.length() && str.charAt(i) == ' ') {
        i++;
    }
    if (i < str.length() && str.charAt(i) == '-') {
        sign = -1;
        i++;
    } else if (i < str.length() && str.charAt(i) == '+') {
        i++;
    }
    while (i < str.length() && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
        res = res * 10 + (str.charAt(i) - '0');
        if (res > Integer.MAX_VALUE) {
            break;
        }
        i++;
    }
    res *= sign;
    if (res > Integer.MAX_VALUE) {
        return Integer.MAX_VALUE;
    } else if (res < Integer.MIN_VALUE) {
        return Integer.MIN_VALUE;
    } else {
        return (int)res;
    }
    }
}
