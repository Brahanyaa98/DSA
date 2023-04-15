class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int maxFrequency = 0;
        int leftPointer = 0;
        int rightPointer = 0;
        long total = 0;
        //sliding window approach for checking the valid window
        //for the same numbered element, the frequency is equal to element*(number_repetitions)
        while(rightPointer<nums.length){
            total += nums[rightPointer];
            //valid window or not 
            while((long)nums[rightPointer]*(rightPointer-leftPointer+1)>(total+k)){
                total -= nums[leftPointer];
                leftPointer++;
            }
            maxFrequency = Math.max(maxFrequency, (rightPointer-leftPointer+1));
            rightPointer++;
        }
        return maxFrequency;
        
    }
}
