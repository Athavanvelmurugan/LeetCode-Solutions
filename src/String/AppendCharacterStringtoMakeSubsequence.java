class Solution {
    public int appendCharacters(String s, String t) {
        int start=0; int tpoint =0;
        while(start<s.length() && tpoint<t.length()){
            if(s.charAt(start)==t.charAt(tpoint)){
                start++;
                tpoint++;
            }else{
                start++;
            }
        }
        return t.length()-tpoint;
    }
}
