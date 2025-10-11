class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        Map<Character,Integer>map = new HashMap<>();
        for(int i=0; i<order.length(); i++){
            map.put(order.charAt(i),i);
        }

        for(int i=0; i<words.length-1; i++){
            if(!compare(words[i],words[i+1],map)){
                return false;
            }
        }
        return true;
    }

    public boolean compare(String word, String word2, Map<Character,Integer>map){

        for(int i=0; i<word.length() && i<word2.length(); i++){
            char x =word.charAt(i);
            char y = word2.charAt(i);

            if(x!=y){
                if(map.get(x)>map.get(y)){
                    return false;
                }else{
                    return true;
                }
            }
        }
        if(word.length()>word2.length()){
            return false;
        }
        return true;
    }
}
