class Solution {
    public int maximumProduct(int[] nums, int k) {
        PriorityQueue<Integer>pq = new PriorityQueue<>();
        int mod =1000000007;
                 //1000000007
        for(int num : nums){
            pq.offer(num);
        }

        for(int i=0; i<k; i++){
            int min =pq.poll();
            min++;
            pq.offer(min);
        }

        long result=1;
        while(!pq.isEmpty()){
            result= (result*pq.poll())%mod;
        }
        return (int) result;
    }
}
