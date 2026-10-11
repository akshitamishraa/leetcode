import java.util.HashMap;

class Solution {
    public int totalFruit(int[] fruits) {
        int low = 0;
        int maxLen = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int high = 0; high < fruits.length; high++) {
            map.put(fruits[high], map.getOrDefault(fruits[high], 0) + 1);

            while (map.size() > 2) {
                map.put(fruits[low], map.get(fruits[low]) - 1);

                if (map.get(fruits[low]) == 0) {
                    map.remove(fruits[low]);
                }

                low++;
            }

            maxLen = Math.max(maxLen, high - low + 1);
        }

        return maxLen;
    }
}