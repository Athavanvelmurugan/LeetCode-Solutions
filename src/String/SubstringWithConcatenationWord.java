class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
         int n =words[0].length();
        //int wordlen =n*words.length;
        Map<String,Integer> map = new HashMap<>();
        List<Integer> ans = new ArrayList<>();

        for(String str:words){
            map.put(str,map.getOrDefault(str,0)+1);
        }

        for(int i=0; i<n;i++){
            Map<String,Integer> map2 = new HashMap<>();
            int count=0 , left=i , right=i;
            while(right+n<=s.length()){
                String rightsubstring = s.substring(right,right+n);
                right=right+n;

                if(map.containsKey(rightsubstring)){
                    map2.put(rightsubstring,map2.getOrDefault(rightsubstring,0)+1);
                     count++;

                     while (map2.get(rightsubstring)>map.get(rightsubstring)){
                         String leftsubstring = s.substring(left,left+n);
                         map2.put(leftsubstring,map2.get(leftsubstring)-1);
                         left=left+n;
                         count--;
                     }

                     if(count==words.length){
                        ans.add(left);
                     }
                }else{
                    map2.clear();
                    count=0;
                    left=right;
                }
            }
        }
        return ans;
    }
}
