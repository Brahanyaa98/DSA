class Solution {
    public int subarraySum(int[] nums, int k) {
        int sum = 0;
        int count = 0;
        int result;
        //Declare a hashmap 
        HashMap<Integer, Integer> subarraySum = new HashMap();
        subarraySum.put(0,1);
        //iterate the nums array
        for(int i = 0; i<nums.length; i++){
            sum += nums[i];
            if(subarraySum.containsKey(sum-k)){
                count += subarraySum.get(sum-k);
            }
            subarraySum.put(sum, subarraySum.getOrDefault(sum,0)+1);
            
        }
        return count;
    }
}
