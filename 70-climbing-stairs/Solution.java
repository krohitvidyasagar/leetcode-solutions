public class Solution {
    public int climbStairs(int n) {
        int[] stairs = new int[46];
        stairs[0] = 0;
        stairs[1] = 1;
        stairs[2] = 2;

        for (int i=3; i <= n; i++) {
            stairs[i] = stairs[i-1] + stairs[i-2];
        }

        return stairs[n];
    }

    public static void main(String[] args) {
        int n = 5;

        Solution s1 = new Solution();

        System.out.println("Number of ways to climb the stairs: " + s1.climbStairs(n));
    }
}