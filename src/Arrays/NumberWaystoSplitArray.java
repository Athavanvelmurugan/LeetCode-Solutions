class Solution {
    public int waysToSplitArray(int[] nums) {
        long totalsum =0;
        long leftsum=0;
        long rightsum=0;
        int count=0;
        for(int num : nums){
            totalsum+=num;
        }

        for(int i=0; i<nums.length-1;i++){
            leftsum+=nums[i];
            rightsum=totalsum-leftsum;
            if(leftsum>=rightsum){
                count++;
            }
        }
        return count;
    }
}
