class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> ans = new ArrayList<>();
        backtrack(0,new ArrayList<>(), s, ans);
        return ans;
    }

    public static void backtrack(int index,List<String>temp,String s, List<String>ans){
        if(temp.size()==4){
            if(s.length()==index){
                ans.add(String.join(".",temp));
            }
            return;
        }

        for(int len=1; len<=3 && index+len<=s.length(); len++){
            String part = s.substring(index,index+len);
            if(part.length() >1 && part.charAt(0)=='0') break;
            int val = Integer.parseInt(part);
            if(val>255)break;

            temp.add(part);
            backtrack(index+len,temp,s,ans);
            temp.remove(temp.size()-1);
        }
    }
}
