package HashMap_ques;

import java.util.HashMap;

class Solution {
    public int countWords(String[] words1, String[] words2) {
        HashMap<String,Integer> mp1 = new HashMap<>();
        HashMap<String,Integer> mp2 = new HashMap<>();
        int count=0;
        for(String s : words1){
            if(mp1.containsKey(s)){
                mp1.put(s,mp1.get(s)+1);
            }else{
                mp1.put(s,1);
            }
        }for(String s : words2){
            if(mp2.containsKey(s)){
                mp2.put(s,mp2.get(s)+1);
            }else{
                mp2.put(s,1);
            }
        }for(String s : words1){
            if(mp1.get(s)==1 && mp2.containsKey(s) && mp2.get(s)==1) count++;
        }return count;
    }
}