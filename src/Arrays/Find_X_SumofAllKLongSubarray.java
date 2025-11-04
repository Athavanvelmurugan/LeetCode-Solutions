public class Solution {
    public int[] findXSum(int[] nums, int k, int x) {
        int n = nums.length;
        if (n == 0 || k == 0) return new int[0];
        int m = n - k + 1;
        int[] ans = new int[m];

        for (int start = 0; start <= n - k; start++) {
            HashMap<Integer, Integer> freq = new HashMap<>();
            for (int i = start; i < start + k; i++) {
                freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);
            }

            List<Map.Entry<Integer, Integer>> list = new ArrayList<>(freq.entrySet());
            list.sort((a, b) -> {
                int fa = a.getValue(), fb = b.getValue();
                if (fa != fb) return Integer.compare(fb, fa); // freq desc
                return Integer.compare(b.getKey(), a.getKey()); // value desc
            });

            long sum = 0;
            int taken = 0;
            for (Map.Entry<Integer, Integer> e : list) {
                if (taken >= x) break;
                sum += (long) e.getValue() * e.getKey();
                taken++;
            }
            ans[start] = (int) sum;
        }

        return ans;
    }
}
