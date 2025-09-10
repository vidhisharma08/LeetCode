package Array_ques;

import java.util.Arrays;

class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int n=cost.length;
        int minCost=0;
        int j=1;
        for(int i=n-1;i>=0;i--){
           if(j%3!=0){
            minCost+=cost[i];
           }j++;
        }return minCost;
    }
}