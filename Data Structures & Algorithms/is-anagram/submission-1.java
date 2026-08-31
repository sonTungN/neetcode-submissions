class Solution {
    public boolean isAnagram(String s, String t) {
        int[] counter = new int[26];

        if (s.length() != t.length()) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            int idxS = (int) s.charAt(i) - 'a';
            int idxT = (int) t.charAt(i) - 'a';
            counter[idxS]++;
            counter[idxT]--;
        }

        for (int i = 0; i < counter.length; i++) {
            if (counter[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
