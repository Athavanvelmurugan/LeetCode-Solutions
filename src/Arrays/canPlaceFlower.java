class Solution {
    public boolean canPlaceFlowers(int[] f, int n) {
        for(int i=0; i<f.length; i+=2){
            if(f[i]==0){
                if(i==f.length-1||f[i+1]==f[i]){
                    n--;
                }else{
                    i++;
                }
            }
        }
        return n<=0;
    }
}
