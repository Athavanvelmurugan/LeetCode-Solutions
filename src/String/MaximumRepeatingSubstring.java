class Solution {
    public int maxRepeating(String sequence, String word) {
        int max=0;
        for(int i=0; i<sequence.length(); i++){
            int start=i;
            int count=0;
            while(start+word.length()<=sequence.length()&&sequence.substring(start,start+word.length()).equals(word)){
                count++;
                start+=word.length();
            }
            max=Math.max(count,max);
        }
        return max;
    }
}
