class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        List<int[]> res = new ArrayList<>();
        res.add(intervals[0]);
        for(int i = 0; i < intervals.length; i++){
            int[] last = res.get(res.size() - 1);
            int[] interval = intervals[i];
            if(interval[0] <= last[1]){
                last[0] = Math.min(interval[0], last[0]);
                last[1] = Math.max(interval[1], last[1]);
            } else{
                res.add(interval);
            }
        }
        return res.toArray(new int[res.size()][]);
    }
}