class Solution {
    public boolean wordPattern(String pattern, String s) {
          String[] words = s.split(" ");
        if (pattern.length() != words.length) return false;

        Map<Character, String> p2w = new HashMap<>();
        Map<String, Character> w2p = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String w = words[i];

            if (p2w.containsKey(c)) {
                if (!p2w.get(c).equals(w)) return false;
            } else {
                // c not mapped yet; ensure w not already mapped to another char
                if (w2p.containsKey(w)) return false;
                p2w.put(c, w);
                w2p.put(w, c);
            }
        }
        return true;
    }
}
