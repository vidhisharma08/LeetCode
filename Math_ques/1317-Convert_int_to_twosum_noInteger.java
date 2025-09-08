package Math_ques;

class Solution {
    public boolean checkNoInt(int num){
        while(num>0){
            if(num%10==0) return false;
            num/=10;
        }return true;
    }
    public int[] getNoZeroIntegers(int n) {
        for(int i=1;i<n;i++){
           int a= i;
           int b=n-i;
           if(a+b==n){
            if(checkNoInt(a) && checkNoInt(b)){
                return new int[]{a,b};
            }else continue;
           }
        }return new int[]{0,0};
    }
}