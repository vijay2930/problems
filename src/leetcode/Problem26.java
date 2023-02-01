package leetcode;
import java.util.*;
class Solution {
    public int removeDuplicates(int[] nums) {
        ArrayList<Integer> arr=new ArrayList<>();
        int res=1;
        int prev=nums[0];
        arr.add(prev);
        for(int i=1;i<nums.length;i++){
            if(prev!=nums[i]){
                prev=nums[i];
                res++;
                arr.add(prev);;
            }
        }
        for(int i=0;i<arr.size();i++){
            nums[i]=arr.get(i);
        }
        return res;
    }
}
