package datastructure.numberofbst;

public class BstCount {
    private static final int MOD = 1000000007;

    public static int countBST(int n) {
        // Create an array to store the counts of BSTs for different numbers of nodes
        int[] dp = new int[n + 1];

        // Initialize the base cases
        dp[0] = 1;
        dp[1] = 1;

        // Calculate the count of BSTs for each number of nodes from 2 to n
        for (int i = 2; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                // Calculate the count of BSTs by summing the counts of left and right subtrees
                dp[i] = (dp[i] + (dp[j] * dp[i - j - 1]) % MOD) % MOD;
            }
        }

        // Return the count of BSTs for n nodes
        return dp[n];
    }
}
