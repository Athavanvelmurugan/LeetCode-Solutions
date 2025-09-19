class Solution {
    public int pivotIndex(int[] nums) {
        int rightsum=0;
        int totalsum=0;
        for(int num : nums){
            totalsum+=num;
        }

        for(int i=0; i<nums.length; i++){
            rightsum+=nums[i];
            if(totalsum==rightsum){
                return i;
            }
            totalsum-=nums[i];
        }
        return -1;
        
    }
}
