class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[1]-b[1]);

        int previousinterval =0;
        int count=1;
        for(int i=1; i<intervals.length; i++){
            if(intervals[i][0]>=intervals[previousinterval][1]){
                previousinterval=i;
                count++;
            }
        }

        return intervals.length-count;
    }
}
