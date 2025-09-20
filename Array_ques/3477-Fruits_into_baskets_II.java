package Array_ques;

class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        for(int i=0;i<fruits.length;i++){
            for(int j=0;j<baskets.length;j++){
                if(baskets[j]>=fruits[i]){
                    baskets[j]=0;
                    break;
                }
            }
        }
        int count=0;
        for(int i=0;i<baskets.length;i++){
            if(baskets[i]!=0) count++;
        }return count;
    }
}
