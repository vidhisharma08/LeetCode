package Array_ques;

class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int maxArea=0;
        int maxDia=0;
        for(int i=0;i<dimensions.length;i++){
            int l=dimensions[i][0];
            int w=dimensions[i][1];
            // double diaLen=Math.sqrt((double)l*l+(double)w*w);
            // if(diaLen>maxDia){
            //     maxDia=diaLen;
            //     maxArea=l*w;
            // }else if(diaLen==maxArea){
            //     maxArea=Math.max(maxArea,l*w);
            // }
            int diaLen=l*l+w*w;
            int area=l*w;
            if(diaLen>maxDia || (diaLen==maxDia && area>maxArea)){
                maxArea=area;
                maxDia=diaLen;
            }
        }
        return maxArea;
    }
}