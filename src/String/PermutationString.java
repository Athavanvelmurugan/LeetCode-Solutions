class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length())return false;
        int s1count[]= new int[26];
        int s2count[]= new int[26];

        for(int i=0; i<s1.length(); i++){
            s1count[s1.charAt(i)-'a']++;
        }

        int window=s1.length();

        // first Sliding window
        for(int i=0; i<window; i++){
            s2count[s2.charAt(i)-'a']++;
        }

        if(matches(s1count, s2count)){
            return true;
        }

        //slidow window remeaning
        for(int i=window; i<s2.length(); i++){
            s2count[s2.charAt(i)-'a']++;
            s2count[s2.charAt(i-window)-'a']--;
            

            if(matches(s1count,s2count)){
                return true;
            }
        }

        return false;
    }

    public static boolean matches(int count1[], int count2[]){
        for(int i=0; i<26; i++){
            if(count1[i]!=count2[i]){
                return false;
            }
        }
        return true;
    }
}
