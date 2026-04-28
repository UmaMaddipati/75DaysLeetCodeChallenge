class Solution {
    public int majorityElement(int[] nums) {
        int a=(nums.length/2)+1;
        int b=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int key=nums[i];
            if(hm.containsKey(key)){
                int curval=hm.get(key);
                hm.put(key,curval+1);
            }
            else{
                hm.put(key,1);
            }
            if (hm.get(key)>=a){
                b=key;
            }
        }
        
        return b;
    }
}