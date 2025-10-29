class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> set = new HashSet<>();
        for(char c : jewels.toCharArray()){
            set.add(c);
        }
        int ans=0;
        for(int i=0; i<stones.length(); i++){
            if(set.contains(stones.charAt(i))){
                ans++;
            }
        }
        return ans;
    }
}
