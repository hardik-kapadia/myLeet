class Solution {
public:
    int f(int m, int n, int maxMove, int cRow, int cCol, int move, int ***dp)
{
    if (move >= maxMove)
        return 0;

    if (dp[move][cRow][cCol] != -1)
        return dp[move][cRow][cCol];

    int MOD = 1000000007;

    int count = 0;
    if (cRow < m - 1)
        count = ((count % MOD) + (f(m, n, maxMove, cRow + 1, cCol, move + 1, dp) % MOD)) % MOD;
    else
        count++;

    if (cCol < n - 1)
        count = ((count % MOD) + (f(m, n, maxMove, cRow, cCol + 1, move + 1, dp) % MOD)) % MOD;
    else
        count++;

    if (cRow > 0)
        count = ((count % MOD) + (f(m, n, maxMove, cRow - 1, cCol, move + 1, dp) % MOD)) % MOD;
    else
        count++;

    if (cCol > 0)
        count = ((count % MOD) + (f(m, n, maxMove, cRow, cCol - 1, move + 1, dp) % MOD)) % MOD;
    else
        count++;

    dp[move][cRow][cCol] = count;

    return count;
}

int findPaths(int m, int n, int maxMove, int startRow, int startColumn)
{

    int ***dp = new int **[maxMove];

    for (int i = 0; i < maxMove; i++)
    {
        dp[i] = new int *[m];

        for (int j = 0; j < m; j++)
        {
            dp[i][j] = new int[n];

            for (int k = 0; k < n; k++)
            {
                dp[i][j][k] = -1;
            }
        }
    }

    int x = f(m, n, maxMove, startRow, startColumn, 0, dp);

    return x;
}
};