class Solution {
    public int splitArray(int[] nums, int k) {
      int max=0; int sum=0;
      for(int i=0; i<nums.length; i++){
        max=Math.max(max,nums[i]);
        sum+=nums[i];
      } 
      int left=max;
      int right=sum;

      while(left<right){
        int mid=left+(right-left)/2;
        if(issplit(nums,k,mid)){
            right=mid;
        }else{
            left=mid+1;
        }
      } 
      return left;
    }

    public static boolean issplit(int nums[], int k, int mid){
        int cur=0; int pieces=1;
        for(int i=0; i<nums.length; i++){
            if(cur+nums[i]>mid){
                pieces++;
                cur=nums[i];
            }else{
                cur+=nums[i];
            }
        }
        return pieces<=k;
    }
}
