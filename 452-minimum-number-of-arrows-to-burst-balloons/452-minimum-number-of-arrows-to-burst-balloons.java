class Solution {
    public int findMinArrowShots(int[][] points) {
        if (points.length == 1)
            return 1;
        
                if (points.length == 2)
            return (points[0][0] <= points[1][1] && points[0][1] >= points[1][0]) ? 1 : 2;

        Arrays.sort(points, (int[] p, int[] q) -> p[1] - q[1]);

        int arrows = 1;

        int currentArrow = points[0][1];

        for (int i = 1; i < points.length; i++) {
            if (points[i][0] > currentArrow) {
                currentArrow = points[i][1];
                arrows++;
            }

        }

        return arrows;
    }
}