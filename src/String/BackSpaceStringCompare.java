class Solution {
    public boolean backspaceCompare(String s, String t) {
        return findequal(s).equals(findequal(t));
    }
    public static String findequal(String word){
        StringBuilder sb = new StringBuilder();
        int hashcount=0;
        for(int i=word.length()-1; i>=0; i--){
            if(word.charAt(i)=='#'){
                hashcount++;
                continue;
            }

            if(hashcount>0){
                hashcount--;
            }else{
                sb.insert(0,word.charAt(i));
            }
        }
        return sb.toString();
    }
}
