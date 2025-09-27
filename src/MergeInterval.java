class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        List<int[]>result = new ArrayList<>();

        int start =intervals[0][0];
        int end = intervals[0][1];

        for(int []list : intervals){
            if(list[0]<=end){
                end=Math.max(end,list[1]);
            }else{
                result.add(new int[]{start,end});
                start=list[0];
                end=list[1];
            }
        }
        result.add(new int[]{start,end});
        return result.toArray(new int[0][]);
    }
}
