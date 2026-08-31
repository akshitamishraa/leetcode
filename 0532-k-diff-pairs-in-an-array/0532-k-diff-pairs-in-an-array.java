class Solution {
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        int i = 0;
        int j = 1;
        int count = 0;

        while(j < nums.length){
            if(i == j){
                j++;
                continue;
            }
            int diff = Math.abs(nums[i] - nums[j]);
            if(diff == k){
                i++;
                j++;
                count++;
            while(i < nums.length && nums[i] == nums[i -1]){
                i++;
            }
            while(j < nums.length && nums[j] == nums[j -1]){
                j++;
            } 
            } else if(diff < k){
                j++;
            } else if(diff > k){
                i++;
            }        
        }
        return count;
    }
}