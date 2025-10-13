class Solution {
    public int jump(int[] nums) {
        int max =0; int count=0; int tempmax=0;
        for(int i=0; i<nums.length-1; i++){

            max=Math.max(max,i+nums[i]);

            if(nums.length-1<=max){
                count++; 
                break;
            }

            if(tempmax==i){
                count++;
                tempmax=max;
            }
        }

        return count;
    }
}
