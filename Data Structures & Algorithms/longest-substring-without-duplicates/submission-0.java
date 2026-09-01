class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> check = new HashMap<>();
        int l = 0;
        int r = 0;
        int max = 0;
        char[] str = s.toCharArray();

        while (r < str.length) {
            char incoming = str[r];

            while (check.containsKey(incoming)) {
                check.remove(str[l++]);
            }

            check.put(incoming, 0);
            max = Math.max(max, r - l + 1);
            r++;
        }

        return max;
    }
}
