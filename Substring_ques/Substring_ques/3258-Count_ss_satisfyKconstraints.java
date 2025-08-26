package Substring_ques;
class Solution {
    public int countKConstraintSubstrings(String s, int k) {
        int count=0;
        for(int i=0;i<s.length();i++){
            int count1=0;
            int count0=0;
            for(int j=i;j<s.length();j++){
                if(s.charAt(j)=='0') count0++;
                else count1++;
                if(count0 <=k || count1<=k) count++;
            }
        }return count;
    }
}