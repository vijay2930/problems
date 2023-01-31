package leetcode;
import java.util.Map;
import java.util.HashMap;
class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int res=0;
        for (int i = 0; i < s.length(); i++) {
            char symbol = s.charAt(i);
            int value = map.get(symbol);
            if ((i < s.length()-1 && map.get(s.charAt(i + 1)) < value)|| (i==s.length()-1) || (s.charAt(i)==s.charAt(i+1))) {
                res+=value;
            } else{
                res-=value;
            }
        }
        return res;
    }
}
public class Problem13 {
    
}
