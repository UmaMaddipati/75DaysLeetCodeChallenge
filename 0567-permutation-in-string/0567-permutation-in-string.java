class Solution {
        public boolean match(int[] f1,int [] f2){
        for(int i=0;i<26;i++){
            if(f1[i]!=f2[i]){
                return false;
            }
        }
        return true;
    }
    public boolean checkInclusion(String s1, String s2) {
        int [] freq1=new int[26];
        int [] freq2=new int[26];
        for(char c:s1.toCharArray()){
            freq1[c-'a']++;
        }
        int n=s1.length();
        for(int i=0;i<s2.length();i++){
            freq2[s2.charAt(i)-'a']++;
            if(i>=n){
                freq2[s2.charAt(i-n)-'a']--;
            }
            if(match(freq1,freq2))
            return true;
        }
        return false;
    }
}