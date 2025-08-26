package Math_ques;

class Solution {
    public int reverse(int x) {
        int m=x;
        int l=0;
        if(x<0){
            x=(-2*x)+m;
        }
        while(x>0){
            int r=x%10;
            if(l<Integer.MIN_VALUE/10 || l>Integer.MAX_VALUE/10){
                return 0;
            }
            l=(l*10)+r;
            x=x/10;
        }
        if(m<0) return (-1)*l;
        else return l;
    }
}
