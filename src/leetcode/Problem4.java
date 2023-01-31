package leetcode;
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i=0;
        int j=0;
        int k=0;
        int nums[]=new int[nums1.length + nums2.length];
        while(i<nums1.length || j<nums2.length){
            if(i<nums1.length && j<nums2.length){
                if(nums1[i]<nums2[j]){
                    nums[k++]=nums1[i++];
                }else{
                    nums[k++]=nums2[j++];
                }
            }else if(j<nums2.length){
                nums[k++]=nums2[j++];
            }else if(i<nums1.length){
                nums[k++]=nums1[i++];
            }
        }
        double median=0;
        int mid=nums.length/2;
        if(nums.length%2==0){
            median=(nums[mid]+nums[mid-1])/2.0;
        }else{
            median=nums[mid];
        }
        return median;
    }
}
public class Problem4 {
    
}
