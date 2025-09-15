package HashMap_ques;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String,Integer> mp = new HashMap<>();
        List<String> list = new ArrayList<>();
        for(String s : s1.split(" ")){
            mp.put(s,mp.getOrDefault(s,0)+1);
        }for(String s : s2.split(" ")){
            mp.put(s,mp.getOrDefault(s,0)+1);
        }for(String s : mp.keySet()){
            if(mp.get(s)==1) list.add(s);
        }
        return list.toArray(new String[0]);
    }
}