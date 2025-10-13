class Solution {
    public int maximumGap(int[] nums) {
      int n =nums.length;
      if(n<2){
        return 0;
      }
      Arrays.sort(nums);
      int maxGap = 0;
      for(int i=1; i<n; i++){
        int max =nums[i]-nums[i-1];
        maxGap=Math.max(max,maxGap);
      }

      return maxGap;  
    }
}
