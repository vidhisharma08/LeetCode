package Matrix_ques;

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if(mat==null || mat.length==0) return new int[0];
        int m=mat.length;
        int n = mat[0].length;
        int res[]=new int[m*n];
        int r=0;
        int c=0;
        for(int i=0;i<m*n;i++){
            res[i]=mat[r][c];
            if((r+c)%2==0){
               
               if(c==n-1) r++;
               else if(r==0) c++;
               else{
                r--; c++;
               }
            }else{
                if(r==m-1) c++;
                
                else if(c==0) r++;
                else{
                    r++;
                    c--;
                }
            }
        }
        return res;
    }
}