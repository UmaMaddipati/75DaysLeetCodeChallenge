class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer>saw=new HashMap<>();
        for(int num:nums){
            if(saw.containsKey(num) && saw.get(num)>=1){
                return true;
            }
            saw.put(num,saw.getOrDefault(num,0)+1);
        }
        return false;
    }
}