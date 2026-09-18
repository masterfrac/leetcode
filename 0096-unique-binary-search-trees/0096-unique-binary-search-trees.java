class Solution {
    public int numTrees(int n) {

        int[] dp = new int[n + 1];

        dp[0] = 1; // Empty tree
        dp[1] = 1; // One node

        for (int nodes = 2; nodes <= n; nodes++) {

            for (int root = 1; root <= nodes; root++) {

                int left = dp[root - 1];
                int right = dp[nodes - root];

                dp[nodes] += left * right;
            }
        }

        return dp[n];
    }
}