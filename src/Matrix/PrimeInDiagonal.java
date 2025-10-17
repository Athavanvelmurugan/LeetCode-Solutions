class Solution {
    public int diagonalPrime(int[][] nums) {
        int maxl = Integer.MIN_VALUE;
        int maxr = Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;
        int n = nums.length;
        for (int i = 0; i < nums.length; i++) {
            if (prime(nums[i][i])) {
                maxl = Math.max(maxl, nums[i][i]);
            }
            if (prime(nums[i][n - 1 - i])) {
                maxr = Math.max(maxr, nums[i][n - 1 - i]);
            }
        }

        max = Math.max(maxl, maxr);

        return max == Integer.MIN_VALUE ? 0 : max;
    }

    public static boolean prime(int num) {
        if (num < 2)
            return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}
