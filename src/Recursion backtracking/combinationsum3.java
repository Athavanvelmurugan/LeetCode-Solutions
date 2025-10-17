class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>>result = new ArrayList<>();
        backtrack(k, n,new ArrayList<>(),result,1);
        return result;
    }
    public static void backtrack(int k, int n , List<Integer>temp,List<List<Integer>>result, int start){
      if(n==0 && k==0){
        result.add(new ArrayList<>(temp));
      }

      if(n<0 || k==0){
        return;
      }
      for(int i=start; i<=9; i++){
        temp.add(i);
        backtrack(k-1,n-i,temp,result,i+1);
        temp.remove(temp.size()-1);
      }
    }
}
