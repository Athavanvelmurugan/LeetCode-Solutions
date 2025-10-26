class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        Set<Character>broken= new HashSet<>();
        for(char c : brokenLetters.toCharArray()){
            broken.add(c);
        }

        String word[]=text.split(" ");
        int ans=0;
        for(String str : word){
            boolean flag = true;
            for(char c : str.toCharArray()){
                if(broken.contains(c)){
                    flag=false;
                    break;
                }
            }
            if(flag){
                ans++;
            }
        }
        return ans;
    }
}
