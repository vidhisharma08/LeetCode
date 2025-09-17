package String_ques;

class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int[] freq=new int[26];
        int count=0;
        for(char ch : allowed.toCharArray()){
            freq[ch-'a']++;
        }
        for(int i=0;i<words.length;i++){
            String str=words[i];
            boolean flag=true;
            for(int j=0;j<str.length();j++){
                char c=str.charAt(j);
                if(freq[c-'a']==0){
                    flag=false;
                    break;
                }
            }if(flag) count++;
        }return count;
    }
}