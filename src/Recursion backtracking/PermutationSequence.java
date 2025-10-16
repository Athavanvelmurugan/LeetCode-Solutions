class Solution { //Permutation Sequence Leetcode 60
    public String getPermutation(int n, int k) {
        List<String>result= new ArrayList<>();
        boolean[]used= new boolean[n];
        backtrack(n,k,used,new StringBuilder(), result);
        return result.get(k-1);
    }

    public static void backtrack(int n, int k, boolean[]used,StringBuilder temp, List<String>result){
        if(temp.length()==n){
            result.add(temp.toString());
            return;
        }

        for(int i=1; i<=n; i++){
            if(used[i-1])continue;
            temp.append(i);
            used[i-1]=true;
            backtrack(n,k,used,temp,result);
            temp.deleteCharAt(temp.length()-1);
            used[i-1]=false;
        }
    }
}
