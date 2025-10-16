class Solution {
    public boolean hasMatch(String s, String p) {
        for(int i=0; i<s.length();i++){
            if(ismatch(s,p,i,0)){
                return true;
            }
        }
        return false;
    }

    public boolean ismatch(String s1, String s2 , int i , int j){

        if(s2.length()==j)return true;
        if(s1.length()==i){
            for(int k=j; k<s2.length(); k++){
                if(s2.charAt(k)!='*') return false;
            }
            return true;
        }

        if(s2.charAt(j)=='*'){
            return ismatch(s1,s2,i,j+1) || ismatch(s1,s2,i+1,j);
        }else if(s1.charAt(i)==s2.charAt(j)){
            return ismatch(s1,s2,i+1,j+1);
        }else{
            return false;
        }

    }
}
