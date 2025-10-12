class Solution {
    public char findTheDifference(String s, String t) {
        int s_sum =0; int t_sum=0;

        for(int i=0; i<s.length();i++){
            s_sum+=s.charAt(i);
        }

        for(int j=0; j<t.length(); j++){
            t_sum+=t.charAt(j);
        }

        int result = t_sum-s_sum;

        return (char)result;
    }
}
