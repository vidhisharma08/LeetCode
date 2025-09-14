package String_ques;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int maxFreqSum(String s) {
       HashMap<Character,Integer> mpp=new HashMap<>();
       for(char ch : s.toCharArray()){
        mpp.put(ch,mpp.getOrDefault(ch,0)+1);
       } int  v=0;
       int c=0;
       for(Map.Entry<Character,Integer> en : mpp.entrySet()){
        if(en.getKey()=='a' || en.getKey()=='e' || en.getKey()=='i' || en.getKey()=='o' || en.getKey()=='u'){
            if(en.getValue()>v) v=en.getValue();
        }else{
            if(en.getValue()>c) c=en.getValue();    
        }
       }return c+v;    }
}
