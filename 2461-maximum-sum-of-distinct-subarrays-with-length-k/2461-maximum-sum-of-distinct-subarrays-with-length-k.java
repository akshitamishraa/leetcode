class Solution {
    public long maximumSubarraySum(int[] nums, int k) {

        // Sliding Window
        long sum = 0;
        long max = 0;

        Map<Integer, Integer> map = new HashMap<>();
        int dupes = 0;

        for (int i = 0; i < k; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 0);
            }

            map.put(nums[i], map.get(nums[i]) + 1);
            sum = sum + nums[i];

            if (map.get(nums[i]) > 1) {
                dupes++;
            }
        }

        if (dupes == 0) {
            max = Math.max(max, sum);
        }

        for (int i = k; i < nums.length; i++) {

            int numToAdd = nums[i];
            int numToRemove = nums[i - k];

            if (!map.containsKey(numToAdd)) {
                map.put(numToAdd, 0);
            }

            map.put(numToAdd, map.get(numToAdd) + 1);

            if (map.get(numToAdd) > 1) {
                dupes++;
            }

            sum = sum + numToAdd;

            if (map.get(numToRemove) > 1) {
                dupes--;
            }

            map.put(numToRemove, map.get(numToRemove) - 1);
            sum = sum - numToRemove;

            if (dupes == 0) {
                max = Math.max(max, sum);
            }
        }

        return max;
    }
}