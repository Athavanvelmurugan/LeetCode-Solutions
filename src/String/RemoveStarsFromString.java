class Solution {
    public String removeStars(String s) {
        StringBuilder result = new StringBuilder();
        int starcount=0;
        for(int i=s.length()-1; i>=0; i--){
            if(s.charAt(i)=='*'){
                starcount++;
                continue;
            }
            if(starcount>0){
                starcount--;
            }else{
                result.insert(0,s.charAt(i));
            }
        }
        return result.toString();
    }
}
