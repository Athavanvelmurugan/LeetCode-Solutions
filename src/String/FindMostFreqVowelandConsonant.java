class Solution {
    public int maxFreqSum(String s) {
        int count[]= new int[26];
        int countc[]= new int[26];

        for(int i=0; i<s.length(); i++){
            if(isvowels(s.charAt(i))){
               count[s.charAt(i)-'a']++;
            }else{
                countc[s.charAt(i)-'a']++;
            }
        }
        int oddmax =0;
        int vow=0;
        for(int i=0; i<count.length; i++){
            oddmax=Math.max(oddmax,countc[i]);
            vow=Math.max(vow,count[i]);
        }
        return vow+oddmax;
    }
    public static boolean isvowels(char c){
        return c=='a' || c=='e' || c=='i' || c=='o' || c=='u';
    }
}
