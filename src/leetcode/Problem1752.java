package leetcode;
class Solution {
    public boolean check(int[] arr) {
        int x=0,y=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1])
                continue;
            if(arr[i]<arr[i+1])
                x++;
            else
                y++;
        }
        if(y==1){

            if(arr[arr.length-1]<=arr[0])
                x++;
            else
                y++;
            if(y==1)
                return true;
        }else if(y<=0)
            return true;
        return false;
    }
}
public class Problem1752 {
    
}
