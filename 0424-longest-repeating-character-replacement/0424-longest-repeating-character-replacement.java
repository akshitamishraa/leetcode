class Solution {
    public int characterReplacement(String s, int k) {

        int low = 0;
        int res = 0;
        int[] map = new int[255];

        for (int high = 0; high < s.length(); high++) {

            map[s.charAt(high)]++;

            int len = high - low + 1;
            int maxcnt = find(map);
            int diff = len - maxcnt;

            while (diff > k) {

                map[s.charAt(low)]--;
                low++;

                maxcnt = find(map);
                len = high - low + 1;
                diff = len - maxcnt;
            }

            len = high - low + 1;
            res = Math.max(res, len);
        }

        return res;
    }

    public int find(int[] map) {
        int max = 0;

        for (int i = 0; i < 255; i++) {
            max = Math.max(max, map[i]);
        }

        return max;
    }
}