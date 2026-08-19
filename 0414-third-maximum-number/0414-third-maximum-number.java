class Solution {
    public int thirdMax(int[] nums) {
        long max = Long.MIN_VALUE;
        long smax = Long.MIN_VALUE;
        long tmax = Long.MIN_VALUE;

        for(int i = 0; i<nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
            }
        }
        for(int i = 0; i<nums.length; i++){
            if(nums[i] > smax && nums[i] != max){
                smax = nums[i];
            }
        }
        for(int i = 0; i<nums.length; i++){
            if(nums[i] > tmax && nums[i] != max && nums[i] != smax){
                tmax = nums[i];
            }
        }
        if(tmax == Long.MIN_VALUE){
        return (int) max;
        }
        return (int) tmax;
    }
}