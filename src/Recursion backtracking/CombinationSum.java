class Solution {
    public List<List<Integer>> combinationSum(int[] c, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(c);
        back(c,target,0,new ArrayList<>(),result);
        return result;
    }

    public static void back(int c[], int target,int start,List<Integer>temp,List<List<Integer>>result){

        if(target==0){
            result.add(new ArrayList<>(temp));
            return;
        }
        for(int i=start; i<c.length; i++){
             if(c[i]>target){
                break;
             }

             temp.add(c[i]);
             back(c,target-c[i],i,temp,result);
             temp.remove(temp.size()-1);
        }   
    }
}
