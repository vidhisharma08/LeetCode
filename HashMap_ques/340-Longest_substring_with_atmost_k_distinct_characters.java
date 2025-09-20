package HashMap_ques;

import java.util.HashMap;
class Solution {

	public static int kDistinctChars(int k, String str) {
		// Write your code here
		int l=0;
		int r=0;
		int maxlen=0;
		HashMap<Character,Integer> mpp=new HashMap<>();
		while(r<str.length()){
			char ch=str.charAt(r);
			mpp.put(ch,mpp.getOrDefault(ch,0)+1);
			if(mpp.size()>k){
				char chl=str.charAt(l);
                mpp.put(chl,mpp.get(chl)-1);
				if(mpp.get(chl)==0) mpp.remove(chl);
				l++;
			}if(mpp.size()<=k){
				maxlen=Math.max(maxlen,r-l+1);
			}r++;
		}return maxlen;
	}

}
