class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int[] buckets = new int[1081];

        for(int[] trip : trips){
            int pass = trip[0];
            int start = trip[1];
            int end = trip[2];

            buckets[start] = buckets[start] + pass;
            buckets[end] = buckets[end] - pass;
        }

        int passengers = 0;
        for(int bucket : buckets){
            passengers = passengers + bucket;

            if(passengers > capacity){
                return false;
            }
        }
        return true;
    }
}