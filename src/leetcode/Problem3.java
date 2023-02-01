package leetcode;
import java.util.Set;
import java.util.HashSet;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0, right = 0, maxLen = 0;
        Set<Character> set = new HashSet<>();

        while (right < s.length()) {
            if (!set.contains(s.charAt(right))) {
                set.add(s.charAt(right));
                right++;
                maxLen = Math.max(maxLen, right - left);
            } else {
                set.remove(s.charAt(left));
                left++;
            }
        }

        return maxLen;
    }
}
