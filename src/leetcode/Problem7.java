package leetcode;
class Solution {
    public int reverse(int x) {
        long rev=0;
            while(x!=0){
                rev=(rev*10)+(x%10);
                x/=10;
                
            }
        return (Integer.MAX_VALUE<rev||rev<Integer.MIN_VALUE) ? 0 : (int)rev;
    }
}
public class Problem7 {
    
}
