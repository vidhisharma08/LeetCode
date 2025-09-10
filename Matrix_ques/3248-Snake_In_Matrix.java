package Matrix_ques;

import java.util.List;

class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int i=0;
        for(String cmd : commands){
            if(cmd.charAt(0)=='R') i++;
            else if(cmd.charAt(0)=='L') i--;
            else if(cmd.charAt(0)=='D') i+=n;
            else if(cmd.charAt(0)=='U') i-=n;
        }
        return i;
    }
}