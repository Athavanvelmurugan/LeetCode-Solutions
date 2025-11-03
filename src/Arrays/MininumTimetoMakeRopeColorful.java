class Solution {
    public int minCost(String colors, int[] neededTime) {
        
         if (colors == null || colors.length() == 0) return 0;

        int n = colors.length();
        int total = 0;
        int prevTime = neededTime[0]; 

        for (int i = 1; i < n; i++) {
            if (colors.charAt(i) == colors.charAt(i - 1)) {
                total += Math.min(prevTime, neededTime[i]);
                prevTime = Math.max(prevTime, neededTime[i]);
            } else {
                prevTime = neededTime[i];
            }
        }
        return total;
    }
}
