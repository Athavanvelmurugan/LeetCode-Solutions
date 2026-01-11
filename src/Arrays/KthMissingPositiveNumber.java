class Solution {
    public int findKthPositive(int[] arr, int k) {
        int max =0;
        for(int i=0; i<arr.length; i++){
            max =Math.max(max,arr[i]);
        }
        
        Set<Integer> set = Arrays.stream(arr)
                         .boxed()
                         .collect(Collectors.toSet());
                         System.out.println(set);

        int count=0;
        for(int i=1; i<=max; i++){
            if(!set.contains(i)){
                System.out.println(i);
                count++;
            }
            if(count==k){
                System.out.println(i);
                return i;
            }
        }

        return arr.length+k;
    }
}
