class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int ston : stones){
            pq.add(ston);
        }

        while(pq.size()>1){ // 8,7,4,2,1,1
            int y =pq.poll(); // 8
            int x =pq.poll(); // 7
            if(x!=y){
                pq.add(y-x); //8-7 
            }
        }
        return pq.isEmpty()? 0 :pq.poll();
    }
}
