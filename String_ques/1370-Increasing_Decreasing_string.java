package String_ques;

class Solution {
    public String sortString(String s) {
        int[] freq=new int[26];
        for(char ch : s.toCharArray()){
            freq[ch-'a']++;
        }
        StringBuilder sb=new StringBuilder();
        while(sb.length()!=s.length()){
            for(int i=0;i<26;i++){
                if(freq[i]!=0){
                    sb.append((char)(i+'a'));
                    freq[i]--;
                }
            }for(int i=25;i>=0;i--){
                if(freq[i]!=0){
                    sb.append((char)(i+'a'));
                    freq[i]--;
                }
            }
        }return sb.toString();
    }
}