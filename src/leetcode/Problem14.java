package leetcode;
class Solution {
    public String longestCommonPrefix(String[] strs) {
        int j;
        outer:
        for(j=0;j<strs[0].length();j++)
        for(int i=0;i<strs.length-1;i++){
            if(j<strs[i].length()&&j<strs[i+1].length()){
                if(strs[i].charAt(j)==strs[i+1].charAt(j)){
                    continue;
                }
            }
            break outer;
        }

        return strs[0].substring(0, j);
    }
}
