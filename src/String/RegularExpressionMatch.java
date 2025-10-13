class Solution {
    public boolean isMatch(String s, String p) {
        Boolean dp[][] = new Boolean[s.length() + 1][p.length() + 1];
        return findmatch(s, p, 0, 0, dp);
    }

    public static boolean findmatch(String s, String p, int sindex, int pindex, Boolean dp[][]) {
        if (pindex == p.length()) {
            return sindex == s.length();
        }

        if (dp[sindex][pindex] != null) {
            return dp[sindex][pindex];
        }

        boolean charactermatch = (sindex < s.length()) &&
                                 (s.charAt(sindex) == p.charAt(pindex) || p.charAt(pindex) == '.');

        boolean nextonestar = (pindex + 1 < p.length() && p.charAt(pindex + 1) == '*');

        boolean ismatch;

        if (nextonestar) {
            // either skip 'x*' or consume one if matched
            ismatch = findmatch(s, p, sindex, pindex + 2, dp) ||
                      (charactermatch && findmatch(s, p, sindex + 1, pindex, dp));
        } else {
            // move both pointers if char matches
            ismatch = charactermatch && findmatch(s, p, sindex + 1, pindex + 1, dp);
        }

        dp[sindex][pindex] = ismatch;
        return ismatch;
    }
}
