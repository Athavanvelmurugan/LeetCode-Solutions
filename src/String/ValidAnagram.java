package leetcode;

import java.util.Arrays;

class validAnagaram {
    public static void main(String[] args) {
        String a = "act";
        String b = "tac";

        System.out.println(anagaram(a, b));
        System.out.println(validAnagram(a,b));
    }

    private static boolean anagaram(String a, String b) {  //Approach TC-O(N) SC-O(1)
        if (a.length() != b.length()) return false;
        int[] count = new int[26];

        for (int i = 0; i < a.length(); i++) {
            count[a.charAt(i) - 'a']++;
            count[b.charAt(i) - 'a']--;
        }

        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) {
                return false;
            }
        }
        return true;
    }

    private static boolean validAnagram(String a, String b) { //Approach TC -O(log n) SP-0(1)
        if (a.length() != b.length()) return false;
        char c[]= a.toCharArray();
        char c1[]=b.toCharArray();
        Arrays.sort(c);
        Arrays.sort(c1);

        if(Arrays.equals(c,c1)){
            return true;
        }
        return false;
    }
}
