class Solution {
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);

        int hCuts = horizontalCuts.length;
        int vCuts = verticalCuts.length;


        int hMax = horizontalCuts[0] - 0;
        int wMax = verticalCuts[0] - 0;

        for (int i = 0; i < horizontalCuts.length - 1; i++) {
            int tempDiff = horizontalCuts[i + 1] - horizontalCuts[i];

            if (tempDiff > hMax)
                hMax = tempDiff;

        }
        if (h - horizontalCuts[horizontalCuts.length - 1] > hMax)
            hMax = h - horizontalCuts[horizontalCuts.length - 1];

        for (int i = 0; i < verticalCuts.length - 1; i++) {
            int tempDiff = verticalCuts[i + 1] - verticalCuts[i];
            if (tempDiff > wMax)
                wMax = tempDiff;

        }
        
        if (w - verticalCuts[verticalCuts.length - 1] > wMax)
            wMax = w - verticalCuts[verticalCuts.length - 1];

        int ans1 = hMax % 1000000007;
        int ans2 = wMax % 1000000007;
        long x = ((long) ans1 * (long) ans2) % (long) 1000000007;
        return (int) x;
    }
}