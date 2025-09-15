package String_ques;

class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] arr=text.split(" ");
        int count=0;
        for(char ch : brokenLetters.toCharArray()){
            int i=0;
            while(i<arr.length){
                if(arr[i].indexOf(ch)!=-1){
                   count++;
                   arr[i]="_";
                }i++;
            }
         
        }return arr.length-count;
    }
}
