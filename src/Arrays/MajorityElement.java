class Solution {
    public int majorityElement(int[] nums) {
        int vote=1;
        int vist=nums[0];
        for(int i=1; i<nums.length; i++){
            if(vote==0){
                vist=nums[i];
                vote=1;
            }else if(vist==nums[i]){
                vote++;
            }else{
                vote--;
            }
        }
        return vist;
    }
}
