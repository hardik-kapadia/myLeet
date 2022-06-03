class NumMatrix {

    private int[][] matrix;
    private int[][] dp;

    public NumMatrix(int[][] matrix) {

        this.matrix = matrix;
        this.dp = new int[matrix.length][matrix[0].length];
        dp[0][0] = matrix[0][0];

        for (int i = 1; i < matrix[0].length; i++) {
            dp[0][i] = dp[0][i-1] + matrix[0][i];
        }

        for (int i = 1; i < matrix.length; i++) {
            dp[i][0] = dp[i-1][0] + matrix[i][0];
        }

        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[i].length; j++) {
                dp[i][j] = dp[i-1][j] +  dp[i][j-1] - dp[i-1][j-1] + matrix[i][j];
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {

        int sum = dp[row2][col2];

        if(row1>0){
            sum -= dp[row1-1][col2];
        }

        if(col1>0){
            sum -= dp[row2][col1-1];
        }

        if(row1>0 && col1>0){
            sum += dp[row1-1][col1-1];
        }

        return sum;


    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */