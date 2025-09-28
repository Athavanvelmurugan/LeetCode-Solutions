class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int index=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]%2==0){
                int temp=nums[index]; // 3
                nums[index]=nums[i]; // 2
                nums[i]=temp;        //3
                index++;                 
            }
        }
        return nums;
    }
}
