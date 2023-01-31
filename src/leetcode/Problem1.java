package leetcode;

import java.util.Arrays;
import java.util.HashMap;
class Solution {
    public int[] twoSum(int[] nums, int target) {
    if(nums==null || nums.length<2)
        return new int[]{0,0};
    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    for(int i=0; i<nums.length; i++){
        if(map.containsKey(nums[i])){
            return new int[]{map.get(nums[i]), i};
        }else{
            map.put(target-nums[i], i);
        }
    }
    return new int[]{0,0};
    }
}
class Problem1 {
    public static void main(String[] args) {
        Solution s=new Solution();
        int num[]={2,7,11,15};
        int target=9;
        int res[]=s.twoSum(num, target);
        System.out.println(Arrays.toString(res));
    }
}
