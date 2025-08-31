import java.util.*;

class Solution {

    public static int longestIncreasingPath(int[][] arr) {
        int n = arr.length, m = arr[0].length;
        int[][] dp = new int[n][m];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        boolean[][] vis = new boolean[n][m];
        int ans = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                ans = Math.max(ans, dfs(vis, arr, i, j, -1, dp));
            }
        }

        return ans;
    }

    public static int dfs(boolean[][] vis, int[][] arr, int i, int j, int curr, int[][] dp) {
        if (i < 0 || j < 0 || i > arr.length - 1 || j > arr[0].length - 1) {
            return 0;
        }
        if (arr[i][j] <= curr) {
            return 0;
        }

        if (dp[i][j] != -1) {  // already computed
            return dp[i][j];
        }

        vis[i][j] = true;
        curr = arr[i][j];
        int max = 1;

        max = Math.max(max, 1 + dfs(vis, arr, i + 1, j, curr, dp));
        max = Math.max(max, 1 + dfs(vis, arr, i - 1, j, curr, dp));
        max = Math.max(max, 1 + dfs(vis, arr, i, j + 1, curr, dp));
        max = Math.max(max, 1 + dfs(vis, arr, i, j - 1, curr, dp));

        vis[i][j] = false;
        dp[i][j] = max;   
        return max;
    }

}
