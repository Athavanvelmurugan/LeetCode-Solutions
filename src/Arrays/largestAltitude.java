class Solution {
    public int largestAltitude(int[] gain) {
        int max =Integer.MIN_VALUE;
        int higher =0;
        for(int num:gain){
            int total=higher+num;
            max=Math.max(max,total);
            higher=total;
        }
        return max<0? 0 :max;
    }
}
