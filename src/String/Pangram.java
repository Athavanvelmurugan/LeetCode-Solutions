class Solution {
    public boolean checkIfPangram(String sentence) {
        Set<Character>set = new HashSet<>();
        for(char c='a'; c<='z'; c++){
            set.add(c);
        } 

        for(char c : sentence.toCharArray()){
            set.remove(c);
        }

        return set.isEmpty()?true:false; 
    }
}
