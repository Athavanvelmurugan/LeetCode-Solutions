class Solution { //2679
    public int matrixSum(int[][] nums) {
        int n=nums.length;
        int m=nums[0].length;

        int sum=0;

        for(int i=0; i<n; i++){
            Arrays.sort(nums[i]);
        }

        for(int j=m-1; j>=0; j--){
            int colsum=0;
            for(int i=0; i<n; i++){
                colsum=Math.max(colsum,nums[i][j]);
            }
            sum+=colsum;
        }
        return sum;
    }
}
