class Solution {
    public int trap(int[] height) {
        int left[]= new int[height.length];
        int right[]= new int[height.length];

        int max=-1;                                  // Find left max
        for(int i=0; i<height.length; i++){
            if(max<=height[i]){
                max=height[i];
            }
            left[i]=max;
        }

        max=-1;
        for(int i=height.length-1; i>=0; i--){   // Find right max
            if(max<=height[i]){
                max=height[i];
            }
            right[i]=max;
        }

        int total=0;
        for(int i=0; i<height.length; i++){    // Find min left , right  Subtract height of building
            total+=Math.min(left[i],right[i])-height[i];
        }
        return total;
    }
}
