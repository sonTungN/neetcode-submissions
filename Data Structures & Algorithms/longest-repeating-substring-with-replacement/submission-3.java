class Solution {
    public int characterReplacement(String s, int k) {
        char[] str = s.toCharArray();
        HashSet<Character> set = new HashSet<>();

        for (char c : str) {
            set.add(c);
        }

        int max = 0;
        for (char c : set) {
            int count = 0;
            int l = 0;

            for (int r = 0; r < str.length; r++) {
                if (str[r] == c) {
                    count++;
                }

                while ((r - l + 1 - count > k)) {
                    if (str[l++] == c) {
                        count--;
                    }
                }

                max = Math.max(max, r - l + 1);
            }
        }

        return max;
    }
}
