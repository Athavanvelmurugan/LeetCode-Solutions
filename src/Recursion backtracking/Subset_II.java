class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());

        for(int num : nums){
            int n=result.size();
            for(int i=0; i<n; i++){
                List<Integer>list = new ArrayList<>(result.get(i));
             //   if(list.contains(num)) continue;
                list.add(num);
                if(result.contains(list))continue;
                result.add(list);
            }
        }
        return result;
    }
}
