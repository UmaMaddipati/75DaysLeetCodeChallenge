class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n=piles.length;
        int maxx=findMax(piles,n);
        int low=1,high=maxx;
        while(low<=high){
            int mid=(low+high)/2;
            if(totalHours(piles,mid,n)<=h){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
    public int totalHours(int[] piles,int mid,int n){
        int summ=0;
        for(int i=0;i<n;i++){
            summ+=Math.ceil((double)piles[i]/(double)mid);
        }
        return summ;
    }
    public int findMax(int[] piles,int n){
        int maxx=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(piles[i]>maxx){
                maxx=Math.max(maxx,piles[i]);
            }
        }
        return maxx;
    }
}