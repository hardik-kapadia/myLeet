class Solution {
    public int findMinArrowShots(int[][] points) {
        
        if (points.length == 1)
            return 1;
        
        Arrays.sort(points, (int[] p, int[] q) -> p[0] - q[0]);
        
        List<int[]> xWindows = new ArrayList<>();

        for (int i = 0; i < points.length; i++) {

            int[] balloon = points[i];
            boolean fits = false;

            for (int j = 0; j < xWindows.size(); j++) {

                int[] window = xWindows.get(j);

                if (balloon[0] <= window[1] && balloon[1] >= window[0]) {

                    window[0] = Math.max(window[0], balloon[0]);
                    window[1] = Math.min(window[1], balloon[1]);

                    fits = true;
                    break;

                }
            }

            if (!fits)
                xWindows.add(new int[] { balloon[0], balloon[1] });

        }

        return xWindows.size();
    }
}