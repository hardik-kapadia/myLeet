class Solution {
    public int maxAreaOfIsland(int[][] grid) {

        int r = grid.length;
        int c;
        try {
            c = grid[0].length;
        } catch (IndexOutOfBoundsException e) {
            return 0;
        }

        int maxArea = 0;

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (grid[i][j] == 0 || grid[i][j] == 2)
                    continue;

                int tempArea = getMaxArea(grid, i, j);
                // System.out.println("For " + i + "," + j + ": " + tempArea);
                if (tempArea > maxArea) {
                    maxArea = tempArea;
                }
            }
        }

        return maxArea;

    }

    static int getMaxArea(int[][] grid, int r, int c) {

        // System.out.println("Finding for: " + r + "." + c);

        int area;

        if (grid[r][c] == 1) {
            grid[r][c] = 2;
            area = 1;
        } else
            return 0;

        if (r > 0) {
            area += getMaxArea(grid, r - 1, c);
        }
        if (r < grid.length - 1)
            area += getMaxArea(grid, r + 1, c);

        if (c > 0) {
            area += getMaxArea(grid, r, c - 1);
        }
        if (c < grid[0].length - 1)
            area += getMaxArea(grid, r, c + 1);

        return area;
    }
}