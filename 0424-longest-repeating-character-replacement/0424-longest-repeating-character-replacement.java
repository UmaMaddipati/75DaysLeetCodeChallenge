class Solution {
    public int characterReplacement(String s, int k) {
        int left=0,right=0,maxFreq=0,ans=0;
        int[]a=new int[26];
        while(right<s.length()){
            a[s.charAt(right)-'A']++;
            maxFreq=Math.max(maxFreq,a[s.charAt(right)-'A']);
            if((right-left+1-maxFreq)>k){
                a[s.charAt(left)-'A']--;
                left++;
            }
            if((right-left+1-maxFreq)<=k)ans=Math.max(ans,right-left+1);
            right++;
        }
        return ans;
    }
}