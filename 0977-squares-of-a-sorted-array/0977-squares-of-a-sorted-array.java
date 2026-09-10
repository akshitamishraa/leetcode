class Solution {
    public int[] sortedSquares(int[] nums) {

        Arrays.sort(nums);

        int j = 0;
        int[] ans = new int[nums.length];

        for(int i = 0; i < nums.length; i++) {

            int square = nums[i] * nums[i];

            ans[j] = square;
            j++;
        }

        Arrays.sort(ans);

        return ans;
    }
}