class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int mid = nums.length / 2;
        int middle = nums[mid];
        int count = 0;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == middle){
                count++;
            } 
        }
        return count == 1;
    }
}