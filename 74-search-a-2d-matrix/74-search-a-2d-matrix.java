class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int m = matrix.length;
        int n = matrix[0].length;

        int i = 0;

        for (; i < m; i++)
            if (matrix[i][0] > target)
                break;
        
        
        if(i == 0 || (i == m && matrix[m-1][n-1] < target))
            return false;

        i--;
        
        int lb = 0;
        int ub = n - 1;

        while (lb <= ub) {

            int mid = (ub + lb) / 2;

            if (matrix[i][mid] == target)
                return true;

            if (matrix[i][mid] > target)
                ub = mid - 1;

            else
                lb = mid + 1;

        }

        return false;
        
    }
}