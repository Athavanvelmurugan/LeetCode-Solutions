class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer>set = new HashSet<>();

        for(int num : nums){
            set.add(num);
        }
        int max=0;
        for(int curnum : set){
            if(!set.contains(curnum-1)){
                int currentlength=1;
                int currentnum=curnum;

                while(set.contains(currentnum+1)){
                    currentlength++;
                    currentnum++;
                }
                max=Math.max(max,currentlength);
            }
        }
        return max;
    }
}
