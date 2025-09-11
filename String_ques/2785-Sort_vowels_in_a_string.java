package String_ques;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public boolean isVowel(char c){
        c= Character.toLowerCase(c);
        return (c=='a' || c=='e' || c=='i' || c=='o' || c=='u');
    }public String sortVowels(String s) {
        List<Character> list=new ArrayList<>();
        char[] res=s.toCharArray();
        for(char ch :res){
            if(isVowel(ch)){
              list.add(ch);
            }
        }
        Collections.sort(list);
        int k=0;
        for(int i=0;i<res.length;i++){
            if(isVowel(res[i])){
                res[i]=list.get(k);
                k++;
            }
        }
       return new String(res);
    }
}