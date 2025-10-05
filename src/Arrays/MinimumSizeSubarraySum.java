class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minlen=Integer.MAX_VALUE;
        int curr =0;
        int low=0;
        int high=0;
        while(high<nums.length){
            curr+=nums[high];
            high++;

            while(curr>=target){
            int curlen =high-low;
            minlen =Math.min(minlen,curlen);
            curr-=nums[low];
            low++;
            }
        }
        return minlen==Integer.MAX_VALUE?0:minlen;
    }
}
