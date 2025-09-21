class Solution {
    public int[] searchRange(int[] nums, int target) {
        int findleft =findleftside(nums,target);
        int findright =findrightside(nums,target);
        return new int[]{findleft,findright};
    }
    public static int findleftside(int nums[], int target){
        if(nums.length==0)return -1;
        int left =0;
        int right =nums.length-1;
         int index=-1;
        while(left<=right){
            int mid =left+(right-left)/2;
            if(nums[mid]==target){
                index=mid;
                right=mid-1;
            }else if(nums[mid]<target){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return index;
    }
    public static int findrightside(int nums[], int target){
        if(nums.length==0)return -1;
        int left=0;
        int right=nums.length-1;
        int index=-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                index=mid;
                left=mid+1;
            }else if(nums[mid]<target){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return index;
    }
}
