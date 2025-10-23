class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(t.length()!=s.length()) return false;
        Map<Character,Character> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char replacement = t.charAt(i);
            char original = s.charAt(i);
            if(!map.containsKey(original)){
                if(!map.containsValue(replacement)){
                    map.put(original,replacement);
                }else{
                    return false;
                }
            }else{
                char having = map.get(original);
                if(having != replacement){
                    return false;
                }
            }
        }
        return true;
    }
}
