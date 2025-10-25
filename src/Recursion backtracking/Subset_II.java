//Efficient Method 

class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        backtrackII(result, new ArrayList<>(), nums, 0);
        return result;
    }

    public static void backtrackII(List<List<Integer>> result, List<Integer> temp, int nums[], int start) {
        result.add(new ArrayList(temp));
        for (int i = start; i < nums.length; i++) {
            if(i>start && nums[i]==nums[i-1])continue;
            temp.add(nums[i]);
            backtrackII(result, temp, nums, i + 1);
            temp.remove(temp.size() - 1);
        }
    }
}

/////


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

// 2nd Method 


class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        backtrackII(result, new ArrayList<>(), nums, 0);
        return result;
    }

    public static void backtrackII(List<List<Integer>> result, List<Integer> temp, int nums[], int start) {
        if (result.contains(temp))
            return;

        result.add(new ArrayList(temp));

        for (int i = start; i < nums.length; i++) {
            temp.add(nums[i]);
            backtrackII(result, temp, nums, i + 1);
            temp.remove(temp.size() - 1);
        }
    }
}
