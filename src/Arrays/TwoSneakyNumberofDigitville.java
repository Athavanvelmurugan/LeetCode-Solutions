class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int i=0;
        while(i<nums.length){
            if (nums[i] != i && nums[i] < nums.length && nums[i] != nums[nums[i]]) {
                swap(i, nums[i],nums);
            } else {
                i++;
            }
        }

        List<Integer>ans = new ArrayList<>();
        for(int j=0; j<nums.length; j++){
            if(j!=nums[j]){
                ans.add(nums[j]);
            }
        }
        int ans1[]= new int[ans.size()];
        for(int k=0; k<ans.size(); k++){
            ans1[k]=ans.get(k);
        }

        return ans1;
    }

    public static void swap(int start, int end, int nums[]){
        int temp = nums[start];
        nums[start]=nums[end];
        nums[end]=temp;
    }
}
