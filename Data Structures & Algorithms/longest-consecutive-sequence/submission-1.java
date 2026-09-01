class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> store = new HashSet<>();

        for (int num : nums) {
            store.add(num);
        }

        int longest = 0;
        for (int num : nums) {
            if (!store.contains(num - 1)) {
                int length = 1;
                while (store.contains(num + length)) {
                    length++;
                }
                longest = Math.max(length, longest);
            }
        }
        return longest;
    }
}
