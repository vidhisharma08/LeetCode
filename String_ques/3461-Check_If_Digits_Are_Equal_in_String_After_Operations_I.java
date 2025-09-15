package String_ques;

class Solution {

    public boolean hasSameDigits(String s) {
        while(s.length()>2){
           String str ="";
           for(int i=0;i<s.length()-1;i++){
             int n=((s.charAt(i)-'0')+(s.charAt(i+1)-'0'))%10;
             str+=n;
           }s=str;
        }return s.charAt(0)==s.charAt(1);
    }
}
