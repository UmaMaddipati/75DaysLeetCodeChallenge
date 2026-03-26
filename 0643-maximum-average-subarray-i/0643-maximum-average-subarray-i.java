class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length;
        double sum=0;
        double max_avg=0;
        for(int i=0;i<k && i<n;i++){
            sum+=nums[i];
        }
        max_avg=sum/k;
        for(int i=k;i<n;i++){
            sum=sum-nums[i-k]+nums[i];
            max_avg=Math.max(max_avg,sum/k);
        }
        return max_avg;
    }
}