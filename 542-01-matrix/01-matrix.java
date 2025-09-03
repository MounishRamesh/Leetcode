class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int m = mat.length, n = mat[0].length;
        int INF = m + n + 5;
        int[][] dp = new int[m][n]; 
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = (mat[i][j] == 0) ? 0 : INF;
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 1) {
                    if (i > 0) dp[i][j] = Math.min(dp[i][j], dp[i-1][j] + 1);
                    if (j > 0) dp[i][j] = Math.min(dp[i][j], dp[i][j-1] + 1);
                }
            }
        }
        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                if (mat[i][j] == 1) {
                    if (i + 1 < m) dp[i][j] = Math.min(dp[i][j], dp[i+1][j] + 1);
                    if (j + 1 < n) dp[i][j] = Math.min(dp[i][j], dp[i][j+1] + 1);
                }
            }
        }

        return dp;
    }
}
