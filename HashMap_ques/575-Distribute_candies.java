package HashMap_ques;
import java.util.HashSet;

class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> set=new HashSet<>();
        for(int n : candyType){
            set.add(n);
        }if(candyType.length/2 > set.size()) return set.size();
        return candyType.length/2;

    }
}
