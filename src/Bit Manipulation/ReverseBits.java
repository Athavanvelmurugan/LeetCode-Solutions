class Solution {
    public int reverseBits(int n) {
        int rev =0;
        for(int i=0; i<32; i++){
            rev =(rev<<1) | (n&1); // oru number add pandrom 
            n=n>>1; // last number shift pandrom
        }
        return rev;
    }
}
