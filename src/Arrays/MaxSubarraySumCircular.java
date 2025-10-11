class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int CurMax =0;
        int maxsum=Integer.MIN_VALUE;
        int curMin =0;
        int minsum=Integer.MAX_VALUE;
        int total=0;

        for(int n : nums){
            total+=n;

            CurMax=Math.max(n, n+CurMax);
            maxsum=Math.max(maxsum,CurMax);

            curMin=Math.min(n, curMin+n);
            minsum=Math.min(curMin,minsum);
        }

        if(maxsum<0){
            return maxsum;
        }

        return Math.max(maxsum, total-minsum);
    }
}
