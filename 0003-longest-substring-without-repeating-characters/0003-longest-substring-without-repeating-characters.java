import java.util.HashMap;

class Solution {
public int lengthOfLongestSubstring(String s) {
int low = 0;
int res = 0;
HashMap<Integer, Integer> map = new HashMap<>();

    for (int high = 0; high < s.length(); high++) {
        map.put((int) s.charAt(high),
            map.getOrDefault((int) s.charAt(high), 0) + 1);

        while (map.get((int) s.charAt(high)) > 1) {
            map.put((int) s.charAt(low),
                map.get((int) s.charAt(low)) - 1);

            if (map.get((int) s.charAt(low)) == 0) {
                map.remove((int) s.charAt(low));
            }

            low++;
        }

        int len = high - low + 1;
        res = Math.max(len, res);
    }

    return res;
}


}
