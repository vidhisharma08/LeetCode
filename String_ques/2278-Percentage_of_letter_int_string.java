package String_ques;

class Solution {
    public int percentageLetter(String s, char letter) {
        
        int len=s.length();
        int count=0;
        for(int i=0;i<len;i++){
            char ch=s.charAt(i);
            if(letter==ch) count++;
        }
        int ans=(count*100)/len;
        return ans;
    }
}