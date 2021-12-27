class Solution {
    public int[][] kClosest(int[][] points, int k) {
                int l = points.length;

        for (int i = 0; i < k; i++) {

            int least = i;
            double leastDist = Math.pow(points[least][0], 2) + Math.pow(points[least][1], 2);

            for (int j = i + 1; j < l; j++)
                if (Math.pow(points[j][0], 2) + Math.pow(points[j][1], 2) < leastDist) {
                    leastDist = Math.pow(points[j][0], 2) + Math.pow(points[j][1], 2);
                    least = j;
                }

            if (least != i) {
                int[] t = points[i];
                points[i] = points[least];
                points[least] = t;
            }

        }

        return Arrays.copyOf(points, k);
    }
}