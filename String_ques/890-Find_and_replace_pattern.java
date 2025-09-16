package String_ques;

import java.util.ArrayList;
import java.util.List;

class Solution {
    boolean check(String str1 , String str2){
        for(int i=0;i<str1.length();i++){
            if(str1.indexOf(str1.charAt(i)) != str2.indexOf(str2.charAt(i))) return false;
        }return true;
    }
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> list=new ArrayList<>();
        for(String word : words){
            if(check(word,pattern)) list.add(word);
        }return list;
    }
}
