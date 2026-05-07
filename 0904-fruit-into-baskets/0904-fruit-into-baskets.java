class Solution {
    public int totalFruit(int[] fruits) {
        int st = 0,end = 0;
        int n = fruits.length,maxLen = 0;
        Map<Integer,Integer> map = new HashMap<>();
        while(end<n)
        {
            map.put(fruits[end],map.getOrDefault(fruits[end],0)+1);
            while(map.size()>=3)
            {
                map.put(fruits[st],map.get(fruits[st])-1);
                if(map.get(fruits[st]) == 0) map.remove(fruits[st]);
                st++;
            }
            int currLen = end-st+1;
            maxLen = Math.max(maxLen,currLen);
            end++;
        }
        return maxLen;
    }
}