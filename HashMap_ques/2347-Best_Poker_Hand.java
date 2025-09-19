package HashMap_ques;


class Solution {
    public String bestHand(int[] ranks, char[] suits) {
        int[] r=new int[14];
        int[] s=new int[4];
        for(int i=0;i<5;i++){
            r[ranks[i]]++;
            s[suits[i]-'a']++;
        }String ans="High Card";
        for(int i=0;i<4;i++){
            if(s[i]==5){
                ans= "Flush"; 
                break;
            }
        }for(int i=0;i<14;i++){
            if(r[i]>=3){
                ans= "Three of a Kind"; 
                return ans;
            }else if(r[i]==2){
                ans= "Pair";
            }
        }return ans;
    }
}