class Solution {
    public boolean isAnagram(String s, String t) {
        int n=s.length();
        int m=t.length();
        if(n!=m){
            return false;
        }
        char [] sArr=s.toCharArray();
        char [] tArr=t.toCharArray();
        for(int i=0;i<n;i++){
            boolean found=false;
            for(int j=0;j<m;j++){
                if(sArr[i]==tArr[j]){
                    found=true;
                    tArr[j]=' ';
                    break;
                }
            }
            if(!found){
                return false;
            }
        }
    return true;
    }
}