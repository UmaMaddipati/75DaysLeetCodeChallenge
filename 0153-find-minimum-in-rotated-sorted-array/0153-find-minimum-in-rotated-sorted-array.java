class Solution {
    public int findMin(int[] nums) {
        return nums[pivotFind(nums) + 1]; 
    }

    public int pivotFind(int[] arr){
        int start = 0 , end = arr.length-1;
        while(start <= end){
            int mid = ( start + ( end - start ) / 2); 
            if( mid < end &&  arr[mid] > arr[mid + 1]){
                return mid;
            }
            if( mid > start &&  arr[mid-1] > arr[mid]){
                return mid - 1;
            }
          if(arr[start] > arr[mid]){
            end = mid - 1;
          }else{
                start = mid + 1;
          }
        }
        return -1;
    }
}