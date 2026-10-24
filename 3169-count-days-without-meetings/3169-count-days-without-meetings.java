class Solution {
    public int countDays(int days, int[][] meetings) {
        Arrays.sort(meetings, Comparator.comparingInt(a-> a[0]));

        List<int[]> res = new ArrayList<>();
        res.add(meetings[0]);

        for(int i = 0; i < meetings.length; i++){
            if(meetings[i][0] <= res.get(res.size() -1)[1]){
                res.get(res.size() - 1)[0] = Math.min(
                    res.get(res.size() - 1)[0],
                    meetings[i][0]
                );

                 res.get(res.size() - 1)[1] = Math.max(
                    res.get(res.size() - 1)[1],
                    meetings[i][1]
                );
            } else{
                res.add(meetings[i]);
            }
        }
        int gap = 0;
        for (int i = 1; i < res.size(); i++) {
            gap += res.get(i)[0] - res.get(i - 1)[1] - 1;
        }

        gap = gap + res.get(0)[0] - 1;
        gap = gap + days - res.get(res.size() - 1)[1];


        return gap;
    }
}