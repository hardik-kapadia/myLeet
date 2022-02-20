class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        
        Arrays.sort(intervals, (p, q) -> {
            if (p[0] == q[0])
                return q[1] - p[1];
            else
                return p[0] - q[0];
        });

        int maxTillNow = -1;
        int count = 0;

        for (int[] is : intervals)
            if (is[1] > maxTillNow) {
                count++;
                maxTillNow = is[1];
            }

        return count;
    }
}