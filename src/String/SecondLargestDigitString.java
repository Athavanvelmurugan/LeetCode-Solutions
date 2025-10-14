class Solution {
    public int secondHighest(String s) {
        Set<Integer>set= new HashSet<>();
        for(int i=0; i<s.length(); i++){
            if(Character.isDigit(s.charAt(i))){
                set.add(s.charAt(i)-'0');
            }
        }

        List<Integer>list= new ArrayList<>(set);
        Collections.sort(list);

        if(list.size()<2){
            return -1;
        }

        int res = list.get(list.size()-2);
        return res;
    }
}
