package leetcode;
class Solution {
    private int max(int height[]){
        int max=0;
        for(int i=0;i<height.length;i++){
            if(height[max]<=height[i]){
                max=i;
            }
        }
        return max;
    }
    public int trap(int[] height) {
        int n=height.length;
        int water=0;
        int left=0;
        int right=n-1;
        int k=1;
        int m=n-1;
        int max=max(height);
        while(k<n && m>0){
            if(left!=max){
                if(height[left]>height[k]){
                        int val=height[left]-height[k];
                        if(val>0)
                            water+=val;
                }else{
                    left=k;
                }
            }
            if(right!=max){
                if(height[right]>height[m]){
                        int val=height[right]-height[m];
                        if(val>0){
                            water+=val;
                        }
                }else{
                    right=m;
                }
            }
            m--;
            k++;
        }
        return water;
    }
}
