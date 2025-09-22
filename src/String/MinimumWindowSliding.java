class Solution {
    public String minWindow(String word, String t) {
        if(word.length()<t.length()){
            return "";
        }
       int fre[]= new int[128];
        for(char c:t.toCharArray()){
            fre[c]++;
        }

        int left =0; int right=0; int minlen = Integer.MAX_VALUE; int minstart=0; int needed =t.length();
        while(right<word.length()){
            char r = word.charAt(right);
            if(fre[r]>0){
                needed--;
            }
            fre[r]--;
            right++;

            while(needed==0){
                if(right-left<minlen){
                    minlen=right-left;
                    minstart=left;
                }
                char l = word.charAt(left);
                fre[l]++;
                if (fre[l]>0) {
                    needed++;
                }
                left++;
            }
        }
        return minlen==Integer.MAX_VALUE? "":word.substring(minstart,minstart+minlen);
	}
}
