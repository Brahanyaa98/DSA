class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       List<List<Integer>> result = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        for(int i =0;i<nums.length; i++){
            int left = i+1;
            int right = nums.length-1;
            while(left<right){
                if(nums[i]+nums[left]+nums[right] == 0 && i!= left && left!=right && i!=right ){
                    result.add(Arrays.asList(nums[i], nums[left],  nums[right]));
                    left++;
                    right--;
                }
                else if(nums[i] + nums[left]+nums[right]<0){
                    left++;
                }
                else{
                    right--;
                }
            }
        }
        return result;
    }

        
}
