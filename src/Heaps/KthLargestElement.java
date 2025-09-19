class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue <Integer>queue = new PriorityQueue<>();
        for(int i=0; i<nums.length; i++){
            queue.offer(nums[i]);
            if(queue.size()>k){
                queue.poll();
            }
        }

        return queue.peek();
    }
}


class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue <Integer>queue = new PriorityQueue<>(collections.reverseOrder());
        for(int i=0; i<nums.length; i++){
            queue.offer(nums[i]);
        }
      for(int i=0; i<k-1; i++){
        queue.poll();
      }
        return queue.peek();
    }
}
