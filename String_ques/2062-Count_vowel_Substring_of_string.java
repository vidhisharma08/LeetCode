package String_ques;

import java.util.HashSet;

class Solution {
    public int countVowelSubstrings(String word) {
        int count=0;
        for(int i=0;i<word.length();i++){
            HashSet<Character> set = new HashSet<>();
            for(int j=i;j<word.length();j++){
                char ch=word.charAt(j);
                if("aeiou".indexOf(ch)==-1) break;
                set.add(ch);
                if(set.size()==5) count++;
            }
        }return count;
    }
}